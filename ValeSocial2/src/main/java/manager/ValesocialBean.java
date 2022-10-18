package manager;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
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
	
	public ValesocialBean() {
		
		valesocial = new ValeSocial();
		
		valesociallista = new ArrayList<ValeSocial>();

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
			
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "CPF INVÁLIDO! Favor informar um CPF válido", ""));			
		}
	}
	
	public void testaCPFResp() {		
		if (!Biblioteca.IsCpf(valesocial.getCpfresp_valesoc())) {
			valesocial.setCpfresp_valesoc(null);
			
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "CPF INVÁLIDO! Favor informar um CPF válido para o responsável", ""));			
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
	
	public void buscar() {
		try {
			
			ValeSocialDao vd  = new ValeSocialDao();
			
			valesociallista = vd.findAll(valesocial);
			
		} catch (Exception e) {
			e.printStackTrace();
			
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), ""));
		}
	}
	
	public String imprimelistarequerimentos() {
		
		return null;
	}
	
	public String imprimirFicha() {

		if ((valesocial.getId_valesoc()==null)) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Nenhuma informação encontrada para enviar imprimir", "")); // passa a mensagem
		} else {

			try{		
				
				valesociallista = new ValeSocialDao().findAll(valesocial);
				
				if(valesociallista.size()==0) {
					FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Ficha não encontrada", "")); // passa a mensagem
				} else {
					DSReportFicha ds = new DSReportFicha(valesociallista);
					
					InputStream arquivo = FacesContext.getCurrentInstance()
						.getExternalContext().getResourceAsStream("/valesocial.jasper");	

					byte[] pdf = JasperRunManager.runReportToPdf(arquivo, null, ds);
						
					HttpServletResponse res = (HttpServletResponse) FacesContext
							.getCurrentInstance().getExternalContext().getResponse();
						
					res.setContentType("application/pdf");
					
					res.setContentLength(pdf.length);
						
					OutputStream out = res.getOutputStream();

					out.write(pdf, 0, pdf.length);

					out.flush();	
					
					out.close();
					
					FacesContext.getCurrentInstance().responseComplete();
					
					OutputStream fileout = new FileOutputStream("fichavalesocial.pdf");	
					
					fileout.write(pdf, 0, pdf.length);

					fileout.flush();	

					fileout.close();
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

}
