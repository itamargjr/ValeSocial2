package persistence;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import entity.ValeSocial;

public class ValeSocialDao extends Dao {

	public void enviasetrans(ValeSocial vs) throws Exception{	
		
		open();	
		
		String smtp = "update cid_valesocial  set enviadosetrans_valesoc = ? where id_valesoc = ?";			
	
		stmt = con.prepareStatement(smtp);

		stmt.setString(1, vs.getEnviadosetrans_valesoc());
		stmt.setInt(2, vs.getId_valesoc());

		stmt.executeUpdate();

	}
	
	public void retornosetrans(ValeSocial vs) throws Exception{	
		
		open();	
		
		String smtp = "update cid_valesocial  set recebidosetrans_valesoc = ?, resultadosetrans_valesoc = ?, analisadosetrans_valesoc = ?  where id_valesoc = ?";			
	
		stmt = con.prepareStatement(smtp);

		stmt.setString(1, vs.getRecebidosetrans_valesoc());
		stmt.setString(2, vs.getResultadosetrans_valesoc());
		stmt.setString(3, vs.getAnalisadosetrans_valesoc());
		stmt.setInt(4, vs.getId_valesoc());

		stmt.executeUpdate();

	}
	
	public void gravar(ValeSocial vs) throws Exception{	
		
		open();	
		
		String smtp = "INSERT INTO cid_valesocial (id_valesoc, data_valesoc, " +
		
		              "requerente_valesoc, sexo_valesoc, nascimento_valesoc, cpf_valesoc, cpfresp_valesoc, " + 
		              
                      "nomeresp_valesoc, pai_valesoc, mae_valesoc, identidade_valesoc, orgaoidt_valesoc, " + 
                      
                      "logradouro_valesoc, numero_valesoc, complemento_valesoc, bairro_valesoc, cidade_valesoc, " + 
                      
                      "cep_valesoc, uf_valesoc, telefone_valesoc, celular_valesoc, tipotransp_valesoc, " + 
                      
                      "origem1_valesoc, destino1_valesoc, tipotransp1_valesoc, origem2_valesoc, destino2_valesoc, " + 
                      
                      "tipotransp2_valesoc, origem3_valesoc, destino3_valesoc, tipotransp3_valesoc, enviadosetrans_valesoc, " + 
                      
                      "recebidosetrans_valesoc, resultadosetrans_valesoc, analisadosetrans_valesoc, analiseinicial_valesoc, tipodef_valesoc, " +
                      
                      "cid_valesoc, acompanhante_valesoc, frequenciatrat_valesoc, motindefer_valesoc, codposto_valesoc, " + 
                      
                      "nomeposto_valesoc, procsetrans_valesoc, tiporeq_valesoc, exigencia_valesoc, motexigencia_valesoc, " +
                      
                      "periciamed_valesoc, defpermtrans_valesoc, quantvales_valesoc, motindefermed_valesoc, medico_valesoc, " +
                      
                      "dataanalisemed_valesoc " + 
                      
                      ") values " +
					  "(null, DATE_FORMAT(sysdate(),'%d/%m/%Y'), " +
                      "?, ?, ?, ?, ?, " +
					  "?, ?, ?, ?, ?, " + 
                      "?, ?, ?, ?, ?, " +
					  "?, ?, ?, ?, ?, " +
					  "?, ?, ?, ?, ?, " +
					  "?, ?, ?, ?, ?, " +
					  "?, ?, ?, ?, ?, " +
					  "?, ?, ?, ?, ?, " +
					  "?, ?, ?, ?, ?, " +
					  "?, ?, ?, ?, ?, " +
					  "?)";	
	
		
	
		stmt = con.prepareStatement(smtp);
	
	//System.out.println(Biblioteca.LimpaStringCaracterSpecial(escola.getCnpj_escola()));

		stmt.setString(1, vs.getRequerente_valesoc());
		stmt.setString(2, vs.getSexo_valesoc());
		stmt.setString(3, vs.getNascimento_valesoc());
		stmt.setString(4, vs.getCpf_valesoc());
		
		if (vs.getCpfresp_valesoc()==null) {
			stmt.setString(5, vs.getCpf_valesoc());
		} else {
			stmt.setString(5, vs.getCpfresp_valesoc());
		}
		
		if (vs.getNomeresp_valesoc()==null) {
			stmt.setString(6, vs.getRequerente_valesoc());
		} else {
			stmt.setString(6, vs.getNomeresp_valesoc());
		}		
		
		stmt.setString(7, vs.getPai_valesoc());
		stmt.setString(8, vs.getMae_valesoc());
		stmt.setString(9, vs.getIdentidade_valesoc());
		stmt.setString(10, vs.getOrgaoidt_valesoc());
		stmt.setString(11, vs.getLogradouro_valesoc());
		stmt.setString(12, vs.getNumero_valesoc());
		stmt.setString(13, vs.getComplemento_valesoc());
		stmt.setString(14, vs.getBairro_valesoc());
		stmt.setString(15, vs.getCidade_valesoc());
		stmt.setString(16, vs.getCep_valesoc());
		stmt.setString(17, vs.getUf_valesoc());
		stmt.setString(18, vs.getTelefone_valesoc());
		stmt.setString(19, vs.getCelular_valesoc());
		stmt.setString(20, vs.getTipotransp_valesoc());
		stmt.setString(21, vs.getOrigem1_valesoc());
		stmt.setString(22, vs.getDestino1_valesoc());
		stmt.setString(23, vs.getTipotransp1_valesoc());
		stmt.setString(24, vs.getOrigem2_valesoc());
		stmt.setString(25, vs.getDestino2_valesoc());
		stmt.setString(26, vs.getTipotransp2_valesoc());
		stmt.setString(27, vs.getOrigem3_valesoc());
		stmt.setString(28, vs.getDestino3_valesoc());
		stmt.setString(29, vs.getTipotransp3_valesoc());
		stmt.setString(30, vs.getEnviadosetrans_valesoc());
		stmt.setString(31, vs.getRecebidosetrans_valesoc());
		stmt.setString(32, vs.getResultadosetrans_valesoc());
		stmt.setString(33, vs.getAnalisadosetrans_valesoc());
		stmt.setString(34, vs.getAnaliseinicial_valesoc());
		stmt.setString(35, vs.getTipodef_valesoc());
		stmt.setString(36, vs.getCid_valesoc());
		stmt.setString(37, vs.getAcompanhante_valesoc());
		
		if ((vs.getFrequenciatrat_valesoc()==null)||(vs.getFrequenciatrat_valesoc()==0)) {
			stmt.setNull(38, Types.INTEGER);
		} else {
			stmt.setInt(38, vs.getFrequenciatrat_valesoc());
		}		
		
		stmt.setString(39, vs.getMotindefer_valesoc());
		stmt.setString(40, vs.getCodposto_valesoc());
		
		stmt.setString(41, vs.getNomeposto_valesoc());
		stmt.setString(42, vs.getProcsetrans_valesoc());
		stmt.setString(43, vs.getTiporeq_valesoc());
		
		stmt.setString(44, vs.getExigencia_valesoc()); 
		stmt.setString(45, vs.getMotexigencia_valesoc()); 
		stmt.setString(46, vs.getPericiamed_valesoc()); 
		stmt.setString(47, vs.getDefpermtrans_valesoc()); 
		
		if (vs.getQuantvales_valesoc()==null) {
			stmt.setNull(48, Types.INTEGER);
		} else {
			stmt.setInt(48, vs.getQuantvales_valesoc()); 
		}		
		
		stmt.setString(49, vs.getMotindefermed_valesoc()); 
		stmt.setString(50, vs.getMedico_valesoc()); 
		stmt.setString(51, vs.getDataanalisemed_valesoc());

		stmt.executeUpdate();

	}
	
	public void gravaredicao(ValeSocial vs) throws Exception{	
		
		open();	
		
		String smtp = "update " +
		              "  cid_valesocial " +
				      "set " +
		              "  requerente_valesoc = ?, " +
				      "  sexo_valesoc = ?, " +
		              "  nascimento_valesoc = ?, " + 
                      "  cpf_valesoc = ?, cpfresp_valesoc = ?, nomeresp_valesoc = ?, " +
		              "  pai_valesoc = ?, mae_valesoc = ?, identidade_valesoc = ?, orgaoidt_valesoc = ?, " + 
                      "  logradouro_valesoc = ?, numero_valesoc = ?, complemento_valesoc = ?, bairro_valesoc = ?, cidade_valesoc = ?, cep_valesoc = ?, " + 
                      "  uf_valesoc = ?, telefone_valesoc = ?, celular_valesoc = ?, tipotransp_valesoc = ?, origem1_valesoc = ?, " + 
                      "  destino1_valesoc = ?, tipotransp1_valesoc = ?, origem2_valesoc = ?, destino2_valesoc = ?, tipotransp2_valesoc = ?, " + 
                      "  origem3_valesoc = ?, destino3_valesoc = ?, tipotransp3_valesoc = ?, enviadosetrans_valesoc = ?, " + 
                      "  recebidosetrans_valesoc = ?, resultadosetrans_valesoc = ?, analisadosetrans_valesoc = ?, analiseinicial_valesoc = ?, tipodef_valesoc = ?, " + 
                      "  cid_valesoc = ?, acompanhante_valesoc = ?, frequenciatrat_valesoc = ?, motindefer_valesoc = ?, codposto_valesoc = ?, " + 
                      "  nomeposto_valesoc = ?, procsetrans_valesoc = ?, tiporeq_valesoc = ?, " +
                      "  exigencia_valesoc = ?, motexigencia_valesoc = ?, periciamed_valesoc = ?, defpermtrans_valesoc = ?, " + 
                      "  quantvales_valesoc = ?, motindefermed_valesoc = ?, " +
                      "  medico_valesoc = ?, dataanalisemed_valesoc = ? " + 
                      "where " +
                      "  id_valesoc = ? ";	
	
		
	
		stmt = con.prepareStatement(smtp);


		stmt.setString(1, vs.getRequerente_valesoc());
		stmt.setString(2, vs.getSexo_valesoc());
		stmt.setString(3, vs.getNascimento_valesoc());
		stmt.setString(4, vs.getCpf_valesoc());
		stmt.setString(5, vs.getCpfresp_valesoc());
		stmt.setString(6, vs.getNomeresp_valesoc());
		stmt.setString(7, vs.getPai_valesoc());
		stmt.setString(8, vs.getMae_valesoc());
		stmt.setString(9, vs.getIdentidade_valesoc());
		stmt.setString(10, vs.getOrgaoidt_valesoc());
		stmt.setString(11, vs.getLogradouro_valesoc());
		stmt.setString(12, vs.getNumero_valesoc());
		stmt.setString(13, vs.getComplemento_valesoc());
		stmt.setString(14, vs.getBairro_valesoc());
		stmt.setString(15, vs.getCidade_valesoc());
		stmt.setString(16, vs.getCep_valesoc());
		stmt.setString(17, vs.getUf_valesoc());
		stmt.setString(18, vs.getTelefone_valesoc());
		stmt.setString(19, vs.getCelular_valesoc());
		stmt.setString(20, vs.getTipotransp_valesoc());
		stmt.setString(21, vs.getOrigem1_valesoc());
		stmt.setString(22, vs.getDestino1_valesoc());
		stmt.setString(23, vs.getTipotransp1_valesoc());
		stmt.setString(24, vs.getOrigem2_valesoc());
		stmt.setString(25, vs.getDestino2_valesoc());
		stmt.setString(26, vs.getTipotransp2_valesoc());
		stmt.setString(27, vs.getOrigem3_valesoc());
		stmt.setString(28, vs.getDestino3_valesoc());
		stmt.setString(29, vs.getTipotransp3_valesoc());
		stmt.setString(30, vs.getEnviadosetrans_valesoc());
		stmt.setString(31, vs.getRecebidosetrans_valesoc());
		stmt.setString(32, vs.getResultadosetrans_valesoc());
		stmt.setString(33, vs.getAnalisadosetrans_valesoc());
		stmt.setString(34, vs.getAnaliseinicial_valesoc());
		stmt.setString(35, vs.getTipodef_valesoc());
		stmt.setString(36, vs.getCid_valesoc());
		stmt.setString(37, vs.getAcompanhante_valesoc());
		
		if ((vs.getFrequenciatrat_valesoc()==null)||(vs.getFrequenciatrat_valesoc()==0)) {
			stmt.setNull(38, Types.INTEGER);
		} else {
			stmt.setInt(38, vs.getFrequenciatrat_valesoc());
		}		
		
		stmt.setString(39, vs.getMotindefer_valesoc());
		stmt.setString(40, vs.getCodposto_valesoc());
		stmt.setString(41, vs.getNomeposto_valesoc());
		stmt.setString(42, vs.getProcsetrans_valesoc());
		stmt.setString(43, vs.getTiporeq_valesoc());
		stmt.setString(44, vs.getExigencia_valesoc());
		stmt.setString(45, vs.getMotexigencia_valesoc());
		stmt.setString(46, vs.getPericiamed_valesoc());
		stmt.setString(47, vs.getDefpermtrans_valesoc());
		
		if ((vs.getQuantvales_valesoc()==null)||(vs.getQuantvales_valesoc()==0)) {
			stmt.setNull(48, Types.INTEGER);
		} else {
			stmt.setInt(48, vs.getQuantvales_valesoc());
		}

		stmt.setString(49, vs.getMotindefermed_valesoc());
		stmt.setString(50, vs.getMedico_valesoc());
		stmt.setString(51, vs.getDataanalisemed_valesoc());
		stmt.setInt(52, vs.getId_valesoc());

		stmt.executeUpdate();

	}
	
	public List<ValeSocial> findAllImpressao(ValeSocial vs) throws Exception {
		List<ValeSocial> lista = new ArrayList<ValeSocial>();
		
		open();
		
		String statement = 
		"select " +
		"  id_valesoc, data_valesoc, requerente_valesoc, " +
		"  case " +
		"    when sexo_valesoc = 'F' Then 'FEMININO' " +
		"    else 'MASCULINO' " +
		"  end as sexo_valesoc, " +
		"  nascimento_valesoc, cpf_valesoc, cpfresp_valesoc, " +
		"  nomeresp_valesoc, pai_valesoc, mae_valesoc, " +
		"  identidade_valesoc, " +
		"  case " +
		"    when orgaoidt_valesoc = 'D' Then 'DETRAN' " +
		"    when orgaoidt_valesoc = 'S' Then 'Secretaria de Segurança Pública (SSP)' " +
		"    when orgaoidt_valesoc = 'A' Then 'Min. Aeronáutica' " +
		"    when orgaoidt_valesoc = 'E' Then 'Min. Exército' " +
		"    when orgaoidt_valesoc = 'M' Then 'Min. Marinha' " +
		"    else 'Outros' " +
		"  end as orgaoidt_valesoc, " +
		"  logradouro_valesoc, numero_valesoc, complemento_valesoc, " +
		"  bairro_valesoc, 'NILOPOLIS' as cidade_valesoc, " +
		"  cep_valesoc, 'RJ' as uf_valesoc, telefone_valesoc, " +
		"  celular_valesoc, " +
		"  case " +
		"    when tipotransp_valesoc = 'T' Then 'TREM' " +
		"    when tipotransp_valesoc = 'O' Then 'ÔNIBUS INTERMUNICIPAL' " +
		"    when tipotransp_valesoc = 'B' Then 'BARCA' " +
		"    when tipotransp_valesoc = 'M' Then 'METRÔ' " +
		"  else 'OUTRO' " +
		"  end as tipotransp_valesoc, " +
		"  origem1_valesoc, " +
		"  destino1_valesoc, tipotransp1_valesoc, origem2_valesoc, " +
		"  destino2_valesoc, tipotransp2_valesoc, origem3_valesoc, " +
		"  destino3_valesoc, tipotransp3_valesoc, enviadosetrans_valesoc, " +
		"  recebidosetrans_valesoc, resultadosetrans_valesoc, " +
		"  analisadosetrans_valesoc, analiseinicial_valesoc, " +
		"  case " +
		"    when resultadosetrans_valesoc = 'D' Then 'DEFERIDO' " +
		"    when resultadosetrans_valesoc = 'I' Then 'INDEFERIDO' " +
		"  else '' " +
		"  end as resultadosetrans_valesoc, " + 
		"  case " +
		"    when tipodef_valesoc = 'F' Then 'Deficiente Físico' " +
		"    when tipodef_valesoc = 'M' Then 'Deficiente Mental' " +
		"    when tipodef_valesoc = 'V' Then 'Deficiente Visual' " +
		"    when tipodef_valesoc = 'A' Then 'Deficiente Auditivo' " +
		"    when tipodef_valesoc = 'C' Then 'Doente Crônico' " +
		"  else '' " +
		"  end as tipodef_valesoc, " +
		"  cid_valesoc, acompanhante_valesoc, frequenciatrat_valesoc, " +
		"  motindefer_valesoc, codposto_valesoc, nomeposto_valesoc, " +
		"  procsetrans_valesoc, tiporeq_valesoc, exigencia_valesoc, " +
		"  motexigencia_valesoc, periciamed_valesoc, " +
		"  defpermtrans_valesoc, quantvales_valesoc, motindefermed_valesoc, " +
		"  medico_valesoc, dataanalisemed_valesoc " +
		"from " +
		"  cid_valesocial " +
		"where " +
		"  1 = 1 ";
				  
		if ((vs.getProcsetrans_valesoc()!=null)&&(!vs.getProcsetrans_valesoc().equalsIgnoreCase(""))) {
			statement = statement + " and procsetrans_valesoc = '" + vs.getProcsetrans_valesoc() + "'";
		}
		
		if ((vs.getRequerente_valesoc()!=null)&&(!vs.getRequerente_valesoc().equalsIgnoreCase(""))) {
			statement = statement + " and requerente_valesoc like '%" + vs.getRequerente_valesoc() + "%'";
		}
		
		if ((vs.getCpf_valesoc()!=null)&&(!vs.getCpf_valesoc().equalsIgnoreCase(""))) {
			statement = statement + " and cpf_valesoc = '" + vs.getCpf_valesoc() + "'";
		}
		
		if ((vs.getCpfresp_valesoc()!=null)&&(!vs.getCpfresp_valesoc().equalsIgnoreCase(""))) {
			statement = statement + " and cpfresp_valesoc = '" + vs.getCpfresp_valesoc() + "'";
		}
		
		if ((vs.getBairro_valesoc()!=null)&&(!vs.getBairro_valesoc().equalsIgnoreCase(""))) {
			statement = statement + " and bairro_valesoc = '" + vs.getBairro_valesoc() + "'";
		}
		
		if ((vs.getCodposto_valesoc()!=null)&&(!vs.getCodposto_valesoc().equalsIgnoreCase(""))) {
			statement = statement + " and codposto_valesoc = '" + vs.getCodposto_valesoc() + "'";
		}
		
		if ((vs.getNomeposto_valesoc()!=null)&&(!vs.getNomeposto_valesoc().equalsIgnoreCase(""))) {
			statement = statement + " and nomeposto_valesoc like '%" + vs.getNomeposto_valesoc() + "'";
		}
		
		stmt = con.prepareStatement(statement);
		
		rs = stmt.executeQuery();
		
		while (rs.next()) {
			ValeSocial v = new ValeSocial(
					rs.getInt("id_valesoc"),
					rs.getString("data_valesoc"),
					rs.getString("requerente_valesoc"),
					rs.getString("sexo_valesoc"),
					rs.getString("nascimento_valesoc"),
					rs.getString("cpf_valesoc"),
					rs.getString("cpfresp_valesoc"),
					rs.getString("nomeresp_valesoc"),
					rs.getString("pai_valesoc"),
					rs.getString("mae_valesoc"),
					rs.getString("identidade_valesoc"),
					rs.getString("orgaoidt_valesoc"),
					rs.getString("logradouro_valesoc"),
					rs.getString("numero_valesoc"),
					rs.getString("complemento_valesoc"),
					rs.getString("bairro_valesoc"),
					rs.getString("cidade_valesoc"),
					rs.getString("cep_valesoc"),
					rs.getString("uf_valesoc"),
					rs.getString("telefone_valesoc"),
					rs.getString("celular_valesoc"),
					rs.getString("tipotransp_valesoc"),
					rs.getString("origem1_valesoc"),
					rs.getString("destino1_valesoc"),
					rs.getString("tipotransp1_valesoc"),
					rs.getString("origem2_valesoc"),
					rs.getString("destino2_valesoc"),
					rs.getString("tipotransp2_valesoc"),
					rs.getString("origem3_valesoc"),
					rs.getString("destino3_valesoc"),
					rs.getString("tipotransp3_valesoc"),
					rs.getString("enviadosetrans_valesoc"),
					rs.getString("recebidosetrans_valesoc"),
					rs.getString("resultadosetrans_valesoc"),
					rs.getString("analisadosetrans_valesoc"),
					rs.getString("analiseinicial_valesoc"),
					rs.getString("tipodef_valesoc"),
					rs.getString("cid_valesoc"),
					rs.getString("acompanhante_valesoc"),
					rs.getInt("frequenciatrat_valesoc"),
					rs.getString("motindefer_valesoc"),
					rs.getString("codposto_valesoc"),
					rs.getString("nomeposto_valesoc"),
					rs.getString("procsetrans_valesoc"),
					rs.getString("tiporeq_valesoc"),
					rs.getString("exigencia_valesoc"),
					rs.getString("motexigencia_valesoc"), 
					rs.getString("periciamed_valesoc"),
					rs.getString("defpermtrans_valesoc"), 
					rs.getInt("quantvales_valesoc"),
					rs.getString("motindefermed_valesoc"),
					rs.getString("medico_valesoc"), 
					rs.getString("dataanalisemed_valesoc"));
			
			lista.add(v);
		}						  
		
		close();
		
		return lista;
	}
	
	public List<ValeSocial> findAll(ValeSocial vs) throws Exception {
		List<ValeSocial> lista = new ArrayList<ValeSocial>();
		
		open();
		
		String statement = 
		"select " +
		"  id_valesoc, data_valesoc, requerente_valesoc, " +
		"  sexo_valesoc, " +
		"  nascimento_valesoc, cpf_valesoc, cpfresp_valesoc, " +
		"  nomeresp_valesoc, pai_valesoc, mae_valesoc, " +
		"  identidade_valesoc, " +
		"  orgaoidt_valesoc, " +
		"  logradouro_valesoc, numero_valesoc, complemento_valesoc, " +
		"  bairro_valesoc, 'NILOPOLIS' as cidade_valesoc, " +
		"  cep_valesoc, 'RJ' as uf_valesoc, telefone_valesoc, " +
		"  celular_valesoc, " +
		"  tipotransp_valesoc, " +
		"  origem1_valesoc, " +
		"  destino1_valesoc, tipotransp1_valesoc, origem2_valesoc, " +
		"  destino2_valesoc, tipotransp2_valesoc, origem3_valesoc, " +
		"  destino3_valesoc, tipotransp3_valesoc, enviadosetrans_valesoc, " +
		"  recebidosetrans_valesoc, resultadosetrans_valesoc, " +
		"  analisadosetrans_valesoc, analiseinicial_valesoc, " +
		"  resultadosetrans_valesoc, " + 
		"  tipodef_valesoc, " +
		"  cid_valesoc, acompanhante_valesoc, frequenciatrat_valesoc, " +
		"  motindefer_valesoc, codposto_valesoc, nomeposto_valesoc, " +
		"  procsetrans_valesoc, tiporeq_valesoc, exigencia_valesoc, " +
		"  motexigencia_valesoc, periciamed_valesoc, " +
		"  defpermtrans_valesoc, quantvales_valesoc, motindefermed_valesoc, " +
		"  medico_valesoc, dataanalisemed_valesoc " +
		"from " +
		"  cid_valesocial " +
		"where " +
		"  1 = 1 ";
				  
		if ((vs.getProcsetrans_valesoc()!=null)&&(!vs.getProcsetrans_valesoc().equalsIgnoreCase(""))) {
			statement = statement + " and procsetrans_valesoc = '" + vs.getProcsetrans_valesoc() + "'";
		}
		
		if ((vs.getRequerente_valesoc()!=null)&&(!vs.getRequerente_valesoc().equalsIgnoreCase(""))) {
			statement = statement + " and requerente_valesoc like '%" + vs.getRequerente_valesoc() + "%'";
		}
		
		if ((vs.getCpf_valesoc()!=null)&&(!vs.getCpf_valesoc().equalsIgnoreCase(""))) {
			statement = statement + " and cpf_valesoc = '" + vs.getCpf_valesoc() + "'";
		}
		
		if ((vs.getCpfresp_valesoc()!=null)&&(!vs.getCpfresp_valesoc().equalsIgnoreCase(""))) {
			statement = statement + " and cpfresp_valesoc = '" + vs.getCpfresp_valesoc() + "'";
		}
		
		if ((vs.getBairro_valesoc()!=null)&&(!vs.getBairro_valesoc().equalsIgnoreCase(""))) {
			statement = statement + " and bairro_valesoc = '" + vs.getBairro_valesoc() + "'";
		}
		
		if ((vs.getCodposto_valesoc()!=null)&&(!vs.getCodposto_valesoc().equalsIgnoreCase(""))) {
			statement = statement + " and codposto_valesoc = '" + vs.getCodposto_valesoc() + "'";
		}
		
		if ((vs.getNomeposto_valesoc()!=null)&&(!vs.getNomeposto_valesoc().equalsIgnoreCase(""))) {
			statement = statement + " and nomeposto_valesoc like '%" + vs.getNomeposto_valesoc() + "'";
		}
		
		stmt = con.prepareStatement(statement);
		
		rs = stmt.executeQuery();
		
		while (rs.next()) {
			ValeSocial v = new ValeSocial(
					rs.getInt("id_valesoc"),
					rs.getString("data_valesoc"),
					rs.getString("requerente_valesoc"),
					rs.getString("sexo_valesoc"),
					rs.getString("nascimento_valesoc"),
					rs.getString("cpf_valesoc"),
					rs.getString("cpfresp_valesoc"),
					rs.getString("nomeresp_valesoc"),
					rs.getString("pai_valesoc"),
					rs.getString("mae_valesoc"),
					rs.getString("identidade_valesoc"),
					rs.getString("orgaoidt_valesoc"),
					rs.getString("logradouro_valesoc"),
					rs.getString("numero_valesoc"),
					rs.getString("complemento_valesoc"),
					rs.getString("bairro_valesoc"),
					rs.getString("cidade_valesoc"),
					rs.getString("cep_valesoc"),
					rs.getString("uf_valesoc"),
					rs.getString("telefone_valesoc"),
					rs.getString("celular_valesoc"),
					rs.getString("tipotransp_valesoc"),
					rs.getString("origem1_valesoc"),
					rs.getString("destino1_valesoc"),
					rs.getString("tipotransp1_valesoc"),
					rs.getString("origem2_valesoc"),
					rs.getString("destino2_valesoc"),
					rs.getString("tipotransp2_valesoc"),
					rs.getString("origem3_valesoc"),
					rs.getString("destino3_valesoc"),
					rs.getString("tipotransp3_valesoc"),
					rs.getString("enviadosetrans_valesoc"),
					rs.getString("recebidosetrans_valesoc"),
					rs.getString("resultadosetrans_valesoc"),
					rs.getString("analisadosetrans_valesoc"),
					rs.getString("analiseinicial_valesoc"),
					rs.getString("tipodef_valesoc"),
					rs.getString("cid_valesoc"),
					rs.getString("acompanhante_valesoc"),
					rs.getInt("frequenciatrat_valesoc"),
					rs.getString("motindefer_valesoc"),
					rs.getString("codposto_valesoc"),
					rs.getString("nomeposto_valesoc"),
					rs.getString("procsetrans_valesoc"),
					rs.getString("tiporeq_valesoc"),
					rs.getString("exigencia_valesoc"),
					rs.getString("motexigencia_valesoc"), 
					rs.getString("periciamed_valesoc"),
					rs.getString("defpermtrans_valesoc"), 
					rs.getInt("quantvales_valesoc"),
					rs.getString("motindefermed_valesoc"),
					rs.getString("medico_valesoc"), 
					rs.getString("dataanalisemed_valesoc"));
			
			lista.add(v);
		}						  
		
		close();
		
		return lista;
	}
	
	public List<ValeSocial> findAllenviados() throws Exception {
		List<ValeSocial> lista = new ArrayList<ValeSocial>();
		
		open();
		
		String statement = 
		"select " +
		"  id_valesoc, data_valesoc, requerente_valesoc, " +
		"  sexo_valesoc, " +
		"  nascimento_valesoc, cpf_valesoc, cpfresp_valesoc, " +
		"  nomeresp_valesoc, pai_valesoc, mae_valesoc, " +
		"  identidade_valesoc, " +
		"  orgaoidt_valesoc, " +
		"  logradouro_valesoc, numero_valesoc, complemento_valesoc, " +
		"  bairro_valesoc, 'NILOPOLIS' as cidade_valesoc, " +
		"  cep_valesoc, 'RJ' as uf_valesoc, telefone_valesoc, " +
		"  celular_valesoc, " +
		"  tipotransp_valesoc, " +
		"  origem1_valesoc, " +
		"  destino1_valesoc, tipotransp1_valesoc, origem2_valesoc, " +
		"  destino2_valesoc, tipotransp2_valesoc, origem3_valesoc, " +
		"  destino3_valesoc, tipotransp3_valesoc, enviadosetrans_valesoc, " +
		"  recebidosetrans_valesoc, resultadosetrans_valesoc, " +
		"  analisadosetrans_valesoc, analiseinicial_valesoc, " +
		"  resultadosetrans_valesoc, " + 
		"  tipodef_valesoc, " +
		"  cid_valesoc, acompanhante_valesoc, frequenciatrat_valesoc, " +
		"  motindefer_valesoc, codposto_valesoc, nomeposto_valesoc, " +
		"  procsetrans_valesoc, tiporeq_valesoc, exigencia_valesoc, " +
		"  motexigencia_valesoc, periciamed_valesoc, " +
		"  defpermtrans_valesoc, quantvales_valesoc, motindefermed_valesoc, " +
		"  medico_valesoc, dataanalisemed_valesoc " +
		"from " +
		"  cid_valesocial " +
		"where " +
		"  enviadosetrans_valesoc is not null and " +
		"  recebidosetrans_valesoc is null ";
		
		stmt = con.prepareStatement(statement);
		
		rs = stmt.executeQuery();
		
		while (rs.next()) {
			ValeSocial v = new ValeSocial(
					rs.getInt("id_valesoc"),
					rs.getString("data_valesoc"),
					rs.getString("requerente_valesoc"),
					rs.getString("sexo_valesoc"),
					rs.getString("nascimento_valesoc"),
					rs.getString("cpf_valesoc"),
					rs.getString("cpfresp_valesoc"),
					rs.getString("nomeresp_valesoc"),
					rs.getString("pai_valesoc"),
					rs.getString("mae_valesoc"),
					rs.getString("identidade_valesoc"),
					rs.getString("orgaoidt_valesoc"),
					rs.getString("logradouro_valesoc"),
					rs.getString("numero_valesoc"),
					rs.getString("complemento_valesoc"),
					rs.getString("bairro_valesoc"),
					rs.getString("cidade_valesoc"),
					rs.getString("cep_valesoc"),
					rs.getString("uf_valesoc"),
					rs.getString("telefone_valesoc"),
					rs.getString("celular_valesoc"),
					rs.getString("tipotransp_valesoc"),
					rs.getString("origem1_valesoc"),
					rs.getString("destino1_valesoc"),
					rs.getString("tipotransp1_valesoc"),
					rs.getString("origem2_valesoc"),
					rs.getString("destino2_valesoc"),
					rs.getString("tipotransp2_valesoc"),
					rs.getString("origem3_valesoc"),
					rs.getString("destino3_valesoc"),
					rs.getString("tipotransp3_valesoc"),
					rs.getString("enviadosetrans_valesoc"),
					rs.getString("recebidosetrans_valesoc"),
					rs.getString("resultadosetrans_valesoc"),
					rs.getString("analisadosetrans_valesoc"),
					rs.getString("analiseinicial_valesoc"),
					rs.getString("tipodef_valesoc"),
					rs.getString("cid_valesoc"),
					rs.getString("acompanhante_valesoc"),
					rs.getInt("frequenciatrat_valesoc"),
					rs.getString("motindefer_valesoc"),
					rs.getString("codposto_valesoc"),
					rs.getString("nomeposto_valesoc"),
					rs.getString("procsetrans_valesoc"),
					rs.getString("tiporeq_valesoc"),
					rs.getString("exigencia_valesoc"),
					rs.getString("motexigencia_valesoc"), 
					rs.getString("periciamed_valesoc"),
					rs.getString("defpermtrans_valesoc"), 
					rs.getInt("quantvales_valesoc"),
					rs.getString("motindefermed_valesoc"),
					rs.getString("medico_valesoc"), 
					rs.getString("dataanalisemed_valesoc"));
			
			lista.add(v);
		}						  
		
		close();
		
		return lista;
	}

}
