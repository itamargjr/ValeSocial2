package manager;

import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.primefaces.PrimeFaces;

import entity.ValeSocial;
import net.sf.jasperreports.engine.JasperRunManager;
import persistence.ValeSocialDao;
import report.DSReportFicha;
import util.Biblioteca;

@ManagedBean
@ViewScoped
public class ValesocialBean {
	
	private ValeSocial valesocial; 
	
	private List< ValeSocial> valesociallista;
	private List< ValeSocial> valesociallistaenviadossetrans;
	
	public ValesocialBean() {
		
		valesocial = new ValeSocial();
		
		valesociallista = new ArrayList<ValeSocial>();
		
		try {
			
			ValeSocialDao vd  = new ValeSocialDao();
			
			valesociallistaenviadossetrans = vd.findAllenviados();
			
		} catch (Exception e) {
			e.printStackTrace();
			
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), ""));
		}

	}

	public List<ValeSocial> getValesociallistaenviadossetrans() {
		return valesociallistaenviadossetrans;
	}

	public void setValesociallistaenviadossetrans(List<ValeSocial> valesociallistaenviadossetrans) {
		this.valesociallistaenviadossetrans = valesociallistaenviadossetrans;
	}

	public ValeSocial getValesocial() {
		return valesocial;
	}

	public void setValesocial(ValeSocial valesocial) {
		this.valesocial = valesocial;
	}

	public List<ValeSocial> getValesociallista() {
		return valesociallista;
	}

	public void setValesociallista(List<ValeSocial> valesociallista) {
		this.valesociallista = valesociallista;
	}
	
	public void testaCPF() {		
		if (!Biblioteca.IsCpf(valesocial.getCpf_valesoc())) {
			valesocial.setCpf_valesoc(null);
			
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "CPF INV�LIDO! Favor informar um CPF v�lido", ""));			
		}
	}
	
	public void testaCPFResp() {		
		if (!Biblioteca.IsCpf(valesocial.getCpfresp_valesoc())) {
			valesocial.setCpfresp_valesoc(null);
			
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "CPF INV�LIDO! Favor informar um CPF v�lido para o respons�vel", ""));			
		}
	}
	
	public void cadastrar() {
		
		try {
			
			ValeSocialDao vd  = new ValeSocialDao();
			
			vd.gravar(valesocial);
			
			valesocial = new ValeSocial();
			
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Requerimento gravado com sucesso", ""));
			
		} catch (Exception e) {
			e.printStackTrace();
			
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), ""));
		}		
	}
	
	public void gravaredicao() {
		
		try {
			
			ValeSocialDao vd  = new ValeSocialDao();
			
			vd.gravaredicao(valesocial);
			
			valesocial = new ValeSocial();
			
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Requerimento gravado com sucesso", ""));
			
		} catch (Exception e) {
			e.printStackTrace();
			
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), ""));
		}		
	}
	
	public void buscar() {
		try {
			
			ValeSocialDao vd  = new ValeSocialDao();
			
			valesociallista = vd.findAll(valesocial);
			
		} catch (Exception e) {
			e.printStackTrace();
			
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), ""));
		}
	}
	
	public String imprimirFicha() {

		if ((valesocial.getId_valesoc()==null)) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Nenhuma informa��o encontrada para enviar imprimir", "")); // passa a mensagem
		} else {

			try{	
	
				valesociallista = new ValeSocialDao().findAllImpressao(valesocial);

				if(valesociallista.size()==0) {
					FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Ficha n�o encontrada", "")); // passa a mensagem
				} else {

					DSReportFicha ds = new DSReportFicha(valesociallista);					

					InputStream arquivo = FacesContext.getCurrentInstance()
						.getExternalContext().getResourceAsStream("/valesocial.jasper");	
					
					Map<String, Object> param = new HashMap<>();
					
					String caminho = "./resources/imagens/governo-rio-de-janeiro-logo.png";
					
					ServletContext scontext = (ServletContext)FacesContext.getCurrentInstance().getExternalContext().getContext();
					
					param.put("pLogoRJ", scontext.getRealPath(caminho));
				
					byte[] pdf = JasperRunManager.runReportToPdf(arquivo, param, ds);

					HttpServletResponse res = (HttpServletResponse) FacesContext
							.getCurrentInstance().getExternalContext().getResponse();
	
					res.setContentType("application/pdf");

					res.setContentLength(pdf.length);
	
					OutputStream out = res.getOutputStream();

					out.write(pdf, 0, pdf.length);

					out.flush();	

					out.close();
					
					FacesContext.getCurrentInstance().responseComplete();
				}					
				
			} catch (Exception e) {
				e.printStackTrace();
				
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), ""));	
			}
		}
		
		return null;
	}
	
	public void mostradialogorequerimento() {
		PrimeFaces.current().executeScript("PF('Dialogo').show();");		
	}
	
	public void abrirdialogoenviosetrans() {
		PrimeFaces.current().executeScript("PF('dialogoenviosetrans').show();");		
	}
	
	public void abrirdialogoeditar() {
		PrimeFaces.current().executeScript("PF('dialogoeditar').show();");		
	}
	
	public void confirmarenviosetrans() {
		try {
			
			java.util.Date data = new java.util.Date();
			SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

			valesocial.setEnviadosetrans_valesoc(formatador.format(data));
			
			ValeSocialDao vd  = new ValeSocialDao();
			
			vd.enviasetrans(valesocial);
			
			PrimeFaces.current().executeScript("PF('dialogoenviosetrans').hide();");	
			
		} catch (Exception e) {
			e.printStackTrace();
			
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), ""));
		}	
	}
	
	public void mostradialogoretorno() {
		
		java.util.Date data = new java.util.Date();
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

		valesocial.setRecebidosetrans_valesoc(formatador.format(data));
		valesocial.setAnalisadosetrans_valesoc(formatador.format(data));
		
		PrimeFaces.current().executeScript("PF('DialogoRetorno').show();");		
	}
	
	public void ConfirmarretornoSetrans() {
		try {
		
			ValeSocialDao vd  = new ValeSocialDao();
			
			vd.retornosetrans(valesocial);
			
			PrimeFaces.current().executeScript("PF('DialogoRetorno').hide();");	
			
		} catch (Exception e) {
			e.printStackTrace();
			
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), ""));
		}	
	}
	
	public String imprimirlistagem() {
		
		try {
			
			ValeSocialDao vd  = new ValeSocialDao();
			
			valesociallista = vd.findAll(valesocial);
			
			if(valesociallista.size()==0) {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Sem dados para imprimir", ""));
			} else {

				DSReportFicha ds = new DSReportFicha(valesociallista);					

				InputStream arquivo = FacesContext.getCurrentInstance()
					.getExternalContext().getResourceAsStream("/valesocialcadastro.jasper");	
			
				Map<String, Object> param = new HashMap<>();
				
				String caminho = "./resources/imagens/governo-rio-de-janeiro-logo.png";
				
				ServletContext scontext = (ServletContext)FacesContext.getCurrentInstance().getExternalContext().getContext();
				
				param.put("pLogoRJ", scontext.getRealPath(caminho));
			
				byte[] pdf = JasperRunManager.runReportToPdf(arquivo, param, ds);

				HttpServletResponse res = (HttpServletResponse) FacesContext
						.getCurrentInstance().getExternalContext().getResponse();

				res.setContentType("application/pdf");

				res.setContentLength(pdf.length);

				OutputStream out = res.getOutputStream();

				out.write(pdf, 0, pdf.length);

				out.flush();	

				out.close();
				
				FacesContext.getCurrentInstance().responseComplete();
				
				valesocial = new ValeSocial();
			}					
					
			
		} catch (Exception e) {
			e.printStackTrace();
			
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), ""));
		}
		
		return null;
	}
	
	public String imprimirquantidades() {
		
		return null;
	}

}
