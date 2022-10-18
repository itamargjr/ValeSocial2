package report;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import entity.ValeSocial;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

public class DSReportFicha implements JRDataSource {
	
	private Iterator<ValeSocial> dados;
	
	private ValeSocial registro;
	
	public DSReportFicha(List<ValeSocial> lista) {
		dados = lista.iterator();
	}
	
	@Override
	public Object getFieldValue(JRField field) throws JRException {
		if(field.getName().equalsIgnoreCase("id_valesoc")){
			return new BigDecimal(registro.getId_valesoc());
		}
		
		if(field.getName().equalsIgnoreCase("data_valesoc")){
			return registro.getData_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("requerente_valesoc")){
			return registro.getRequerente_valesoc();
		}

		if(field.getName().equalsIgnoreCase("sexo_valesoc")){
			return registro.getSexo_valesoc();
		}
		if(field.getName().equalsIgnoreCase("nascimento_valesoc")){
			return registro.getNascimento_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("cpf_valesoc")){
			return registro.getCpf_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("cpfresp_valesoc")){
			return registro.getCpfresp_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("nomeresp_valesoc")){
			return registro.getNomeresp_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("pai_valesoc")){
			return registro.getPai_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("mae_valesoc")){
			return registro.getMae_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("identidade_valesoc")){
			return registro.getIdentidade_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("orgaoidt_valesoc")){
			return registro.getOrgaoidt_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("logradouro_valesoc")){
			return registro.getLogradouro_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("numero_valesoc")){
			return registro.getNumero_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("complemento_valesoc")){
			return registro.getComplemento_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("bairro_valesoc")){
			return registro.getBairro_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("cidade_valesoc")){
			return registro.getCidade_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("cep_valesoc")){
			return registro.getCep_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("uf_valesoc")){
			return registro.getUf_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("telefone_valesoc")){
			return registro.getTelefone_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("celular_valesoc")){
			return registro.getCelular_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("tipotransp_valesoc")){
			return registro.getTipotransp_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("origem1_valesoc")){
			return registro.getOrigem1_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("destino1_valesoc")){
			return registro.getDestino1_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("tipotransp1_valesoc")){
			return registro.getTipotransp1_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("origem2_valesoc")){
			return registro.getOrigem2_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("destino2_valesoc")){
			return registro.getDestino2_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("tipotransp2_valesoc")){
			return registro.getTipotransp2_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("origem3_valesoc")){
			return registro.getOrigem3_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("destino3_valesoc")){
			return registro.getDestino3_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("tipotransp3_valesoc")){
			return registro.getTipotransp3_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("enviadosetrans_valesoc")){
			return registro.getEnviadosetrans_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("recebidosetrans_valesoc")){
			return registro.getRecebidosetrans_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("resultadosetrans_valesoc")){
			return registro.getResultadosetrans_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("analisadosetrans_valesoc")){
			return registro.getAnalisadosetrans_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("tipodef_valesoc")){
			return registro.getTipodef_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("cid_valesoc")){
			return registro.getCid_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("acompanhante_valesoc")){
			return registro.getAcompanhante_valesoc();
		}
		
		if (registro.getFrequenciatrat_valesoc()!=null) {
			if(field.getName().equalsIgnoreCase("frequenciatrat_valesoc")){
				return new BigDecimal(registro.getFrequenciatrat_valesoc());
			}
		}
		
		if(field.getName().equalsIgnoreCase("motindefer_valesoc")){
			return registro.getMotindefer_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("codposto_valesoc")){
			return registro.getCodposto_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("nomeposto_valesoc")){
			return registro.getNomeposto_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("procsetrans_valesoc")){
			return registro.getProcsetrans_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("tiporeq_valesoc")){
			return registro.getTiporeq_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("exigencia_valesoc")){
			return registro.getExigencia_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("motexigencia_valesoc")){
			return registro.getMotexigencia_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("periciamed_valesoc")){
			return registro.getPericiamed_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("defpermtrans_valesoc")){
			return registro.getDefpermtrans_valesoc();
		}
		
		if (registro.getQuantvales_valesoc()!=null) {
			if(field.getName().equalsIgnoreCase("quantvales_valesoc")){
				return new BigDecimal(registro.getQuantvales_valesoc());
			}
		}
		
		if(field.getName().equalsIgnoreCase("motindefermed_valesoc")){
			return registro.getMotindefermed_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("medico_valesoc")){
			return registro.getMedico_valesoc();
		}
		
		if(field.getName().equalsIgnoreCase("dataanalisemed_valesoc")){
			return registro.getDataanalisemed_valesoc();
		}
		
		return null;
	}

	@Override
	public boolean next() throws JRException {
		if(dados.hasNext()){
			registro = dados.next();
			return true;
		}
		return false;
	}

}
