package entity;

public class ValeSocial {
	private Integer id_valesoc;
	private String data_valesoc;
	private String requerente_valesoc;
	private String sexo_valesoc;
	private String nascimento_valesoc;
	private String cpf_valesoc;
	private String cpfresp_valesoc;
	private String nomeresp_valesoc;
	private String pai_valesoc;
	private String mae_valesoc;
	private String identidade_valesoc;
	private String orgaoidt_valesoc;
	private String logradouro_valesoc;
	private String numero_valesoc;
	private String complemento_valesoc;
	private String bairro_valesoc;
	private String cidade_valesoc;
	private String cep_valesoc;
	private String uf_valesoc;
	private String telefone_valesoc;
	private String celular_valesoc;
	private String tipotransp_valesoc;
	private String origem1_valesoc;
	private String destino1_valesoc;
	private String tipotransp1_valesoc;
	private String origem2_valesoc;
	private String destino2_valesoc;
	private String tipotransp2_valesoc;
	private String origem3_valesoc;
	private String destino3_valesoc;
	private String tipotransp3_valesoc;
	private String enviadosetrans_valesoc;
	private String recebidosetrans_valesoc;
	private String resultadosetrans_valesoc;
	private String analisadosetrans_valesoc;
	private String analiseinicial_valesoc;
	private String tipodef_valesoc;	
	private String cid_valesoc;
	private String acompanhante_valesoc;
	private Integer frequenciatrat_valesoc;
	private String motindefer_valesoc;
	private String codposto_valesoc;
	private String nomeposto_valesoc;
	private String procsetrans_valesoc;
	private String tiporeq_valesoc;
	private String exigencia_valesoc;
	private String motexigencia_valesoc;
	private String periciamed_valesoc;
	private String defpermtrans_valesoc;
	private Integer quantvales_valesoc;
    private String motindefermed_valesoc;
    private String medico_valesoc;
    private String dataanalisemed_valesoc;
    
    private String datanasc_ini;
    private String datanasc_fim;
	
	public ValeSocial() {
		super();
	}

	public ValeSocial(Integer id_valesoc, String data_valesoc, String requerente_valesoc, String sexo_valesoc,
			String nascimento_valesoc, String cpf_valesoc, String cpfresp_valesoc, String nomeresp_valesoc,
			String pai_valesoc, String mae_valesoc, String identidade_valesoc, String orgaoidt_valesoc,
			String logradouro_valesoc, String numero_valesoc, String complemento_valesoc, String bairro_valesoc,
			String cidade_valesoc, String cep_valesoc, String uf_valesoc, String telefone_valesoc,
			String celular_valesoc, String tipotransp_valesoc, String origem1_valesoc, String destino1_valesoc,
			String tipotransp1_valesoc, String origem2_valesoc, String destino2_valesoc, String tipotransp2_valesoc,
			String origem3_valesoc, String destino3_valesoc, String tipotransp3_valesoc, String enviadosetrans_valesoc,
			String recebidosetrans_valesoc, String resultadosetrans_valesoc, String analisadosetrans_valesoc,
			String analiseinicial_valesoc, String tipodef_valesoc, String cid_valesoc, String acompanhante_valesoc,
			Integer frequenciatrat_valesoc, String motindefer_valesoc, String codposto_valesoc,
			String nomeposto_valesoc, String procsetrans_valesoc, String tiporeq_valesoc, String exigencia_valesoc,
			String motexigencia_valesoc, String periciamed_valesoc, String defpermtrans_valesoc,
			Integer quantvales_valesoc, String motindefermed_valesoc, String medico_valesoc,
			String dataanalisemed_valesoc) {
		super();
		this.id_valesoc = id_valesoc;
		this.data_valesoc = data_valesoc;
		this.requerente_valesoc = requerente_valesoc;
		this.sexo_valesoc = sexo_valesoc;
		this.nascimento_valesoc = nascimento_valesoc;
		this.cpf_valesoc = cpf_valesoc;
		this.cpfresp_valesoc = cpfresp_valesoc;
		this.nomeresp_valesoc = nomeresp_valesoc;
		this.pai_valesoc = pai_valesoc;
		this.mae_valesoc = mae_valesoc;
		this.identidade_valesoc = identidade_valesoc;
		this.orgaoidt_valesoc = orgaoidt_valesoc;
		this.logradouro_valesoc = logradouro_valesoc;
		this.numero_valesoc = numero_valesoc;
		this.complemento_valesoc = complemento_valesoc;
		this.bairro_valesoc = bairro_valesoc;
		this.cidade_valesoc = cidade_valesoc;
		this.cep_valesoc = cep_valesoc;
		this.uf_valesoc = uf_valesoc;
		this.telefone_valesoc = telefone_valesoc;
		this.celular_valesoc = celular_valesoc;
		this.tipotransp_valesoc = tipotransp_valesoc;
		this.origem1_valesoc = origem1_valesoc;
		this.destino1_valesoc = destino1_valesoc;
		this.tipotransp1_valesoc = tipotransp1_valesoc;
		this.origem2_valesoc = origem2_valesoc;
		this.destino2_valesoc = destino2_valesoc;
		this.tipotransp2_valesoc = tipotransp2_valesoc;
		this.origem3_valesoc = origem3_valesoc;
		this.destino3_valesoc = destino3_valesoc;
		this.tipotransp3_valesoc = tipotransp3_valesoc;
		this.enviadosetrans_valesoc = enviadosetrans_valesoc;
		this.recebidosetrans_valesoc = recebidosetrans_valesoc;
		this.resultadosetrans_valesoc = resultadosetrans_valesoc;
		this.analisadosetrans_valesoc = analisadosetrans_valesoc;
		this.analiseinicial_valesoc = analiseinicial_valesoc;
		this.tipodef_valesoc = tipodef_valesoc;
		this.cid_valesoc = cid_valesoc;
		this.acompanhante_valesoc = acompanhante_valesoc;
		this.frequenciatrat_valesoc = frequenciatrat_valesoc;
		this.motindefer_valesoc = motindefer_valesoc;
		this.codposto_valesoc = codposto_valesoc;
		this.nomeposto_valesoc = nomeposto_valesoc;
		this.procsetrans_valesoc = procsetrans_valesoc;
		this.tiporeq_valesoc = tiporeq_valesoc;
		this.exigencia_valesoc = exigencia_valesoc;
		this.motexigencia_valesoc = motexigencia_valesoc;
		this.periciamed_valesoc = periciamed_valesoc;
		this.defpermtrans_valesoc = defpermtrans_valesoc;
		this.quantvales_valesoc = quantvales_valesoc;
		this.motindefermed_valesoc = motindefermed_valesoc;
		this.medico_valesoc = medico_valesoc;
		this.dataanalisemed_valesoc = dataanalisemed_valesoc;
	}

	public String getDatanasc_ini() {
		return datanasc_ini;
	}

	public void setDatanasc_ini(String datanasc_ini) {
		this.datanasc_ini = datanasc_ini;
	}

	public String getDatanasc_fim() {
		return datanasc_fim;
	}

	public void setDatanasc_fim(String datanasc_fim) {
		this.datanasc_fim = datanasc_fim;
	}

	public String getAnaliseinicial_valesoc() {
		return analiseinicial_valesoc;
	}

	public void setAnaliseinicial_valesoc(String analiseinicial_valesoc) {
		this.analiseinicial_valesoc = analiseinicial_valesoc;
	}

	public String getExigencia_valesoc() {
		return exigencia_valesoc;
	}

	public void setExigencia_valesoc(String exigencia_valesoc) {
		this.exigencia_valesoc = exigencia_valesoc;
	}

	public String getMotexigencia_valesoc() {
		return motexigencia_valesoc;
	}

	public void setMotexigencia_valesoc(String motexigencia_valesoc) {
		this.motexigencia_valesoc = motexigencia_valesoc;
	}

	public String getPericiamed_valesoc() {
		return periciamed_valesoc;
	}

	public void setPericiamed_valesoc(String periciamed_valesoc) {
		this.periciamed_valesoc = periciamed_valesoc;
	}

	public String getDefpermtrans_valesoc() {
		return defpermtrans_valesoc;
	}

	public void setDefpermtrans_valesoc(String defpermtrans_valesoc) {
		this.defpermtrans_valesoc = defpermtrans_valesoc;
	}

	public Integer getQuantvales_valesoc() {
		return quantvales_valesoc;
	}

	public void setQuantvales_valesoc(Integer quantvales_valesoc) {
		this.quantvales_valesoc = quantvales_valesoc;
	}

	public String getMotindefermed_valesoc() {
		return motindefermed_valesoc;
	}

	public void setMotindefermed_valesoc(String motindefermed_valesoc) {
		this.motindefermed_valesoc = motindefermed_valesoc;
	}

	public String getMedico_valesoc() {
		return medico_valesoc;
	}

	public void setMedico_valesoc(String medico_valesoc) {
		this.medico_valesoc = medico_valesoc;
	}

	public String getDataanalisemed_valesoc() {
		return dataanalisemed_valesoc;
	}

	public void setDataanalisemed_valesoc(String dataanalisemed_valesoc) {
		this.dataanalisemed_valesoc = dataanalisemed_valesoc;
	}

	public String getTelefone_valesoc() {
		return telefone_valesoc;
	}

	public void setTelefone_valesoc(String telefone_valesoc) {
		this.telefone_valesoc = telefone_valesoc;
	}

	public String getCelular_valesoc() {
		return celular_valesoc;
	}

	public void setCelular_valesoc(String celular_valesoc) {
		this.celular_valesoc = celular_valesoc;
	}

	public String getCep_valesoc() {
		return cep_valesoc;
	}

	public void setCep_valesoc(String cep_valesoc) {
		this.cep_valesoc = cep_valesoc;
	}

	public String getCodposto_valesoc() {
		return codposto_valesoc;
	}

	public void setCodposto_valesoc(String codposto_valesoc) {
		this.codposto_valesoc = codposto_valesoc;
	}

	public String getNomeposto_valesoc() {
		return nomeposto_valesoc;
	}

	public void setNomeposto_valesoc(String nomeposto_valesoc) {
		this.nomeposto_valesoc = nomeposto_valesoc;
	}

	public String getProcsetrans_valesoc() {
		return procsetrans_valesoc;
	}

	public void setProcsetrans_valesoc(String procsetrans_valesoc) {
		this.procsetrans_valesoc = procsetrans_valesoc;
	}

	public String getTiporeq_valesoc() {
		return tiporeq_valesoc;
	}

	public void setTiporeq_valesoc(String tiporeq_valesoc) {
		this.tiporeq_valesoc = tiporeq_valesoc;
	}

	public String getData_valesoc() {
		return data_valesoc;
	}

	public void setData_valesoc(String data_valesoc) {
		this.data_valesoc = data_valesoc;
	}

	public Integer getId_valesoc() {
		return id_valesoc;
	}

	public void setId_valesoc(Integer id_valesoc) {
		this.id_valesoc = id_valesoc;
	}

	public String getRequerente_valesoc() {
		return requerente_valesoc;
	}

	public void setRequerente_valesoc(String requrente_valesoc) {
		this.requerente_valesoc = requrente_valesoc;
	}

	public String getSexo_valesoc() {
		return sexo_valesoc;
	}

	public void setSexo_valesoc(String sexo_valesoc) {
		this.sexo_valesoc = sexo_valesoc;
	}

	public String getNascimento_valesoc() {
		return nascimento_valesoc;
	}

	public void setNascimento_valesoc(String nascimento_valesoc) {
		this.nascimento_valesoc = nascimento_valesoc;
	}

	public String getCpf_valesoc() {
		return cpf_valesoc;
	}

	public void setCpf_valesoc(String cpf_valesoc) {
		this.cpf_valesoc = cpf_valesoc;
	}

	public String getCpfresp_valesoc() {
		return cpfresp_valesoc;
	}

	public void setCpfresp_valesoc(String cpfresp_valesoc) {
		this.cpfresp_valesoc = cpfresp_valesoc;
	}

	public String getNomeresp_valesoc() {
		return nomeresp_valesoc;
	}

	public void setNomeresp_valesoc(String nomeresp_valesoc) {
		this.nomeresp_valesoc = nomeresp_valesoc;
	}

	public String getPai_valesoc() {
		return pai_valesoc;
	}

	public void setPai_valesoc(String pai_valesoc) {
		this.pai_valesoc = pai_valesoc;
	}

	public String getMae_valesoc() {
		return mae_valesoc;
	}

	public void setMae_valesoc(String mae_valesoc) {
		this.mae_valesoc = mae_valesoc;
	}

	public String getIdentidade_valesoc() {
		return identidade_valesoc;
	}

	public void setIdentidade_valesoc(String identidade_valesoc) {
		this.identidade_valesoc = identidade_valesoc;
	}

	public String getOrgaoidt_valesoc() {
		return orgaoidt_valesoc;
	}

	public void setOrgaoidt_valesoc(String orgaoidt_valesoc) {
		this.orgaoidt_valesoc = orgaoidt_valesoc;
	}

	public String getLogradouro_valesoc() {
		return logradouro_valesoc;
	}

	public void setLogradouro_valesoc(String logradouro_valesoc) {
		this.logradouro_valesoc = logradouro_valesoc;
	}

	public String getNumero_valesoc() {
		return numero_valesoc;
	}

	public void setNumero_valesoc(String numero_valesoc) {
		this.numero_valesoc = numero_valesoc;
	}

	public String getComplemento_valesoc() {
		return complemento_valesoc;
	}

	public void setComplemento_valesoc(String complemento_valesoc) {
		this.complemento_valesoc = complemento_valesoc;
	}

	public String getBairro_valesoc() {
		return bairro_valesoc;
	}

	public void setBairro_valesoc(String bairro_valesoc) {
		this.bairro_valesoc = bairro_valesoc;
	}

	public String getCidade_valesoc() {
		return cidade_valesoc;
	}

	public void setCidade_valesoc(String cidade_valesoc) {
		this.cidade_valesoc = cidade_valesoc;
	}

	public String getUf_valesoc() {
		return uf_valesoc;
	}

	public void setUf_valesoc(String uf_valesoc) {
		this.uf_valesoc = uf_valesoc;
	}

	public String getTipotransp_valesoc() {
		return tipotransp_valesoc;
	}

	public void setTipotransp_valesoc(String tipotransp_valesoc) {
		this.tipotransp_valesoc = tipotransp_valesoc;
	}

	public String getOrigem1_valesoc() {
		return origem1_valesoc;
	}

	public void setOrigem1_valesoc(String origem1_valesoc) {
		this.origem1_valesoc = origem1_valesoc;
	}

	public String getDestino1_valesoc() {
		return destino1_valesoc;
	}

	public void setDestino1_valesoc(String destino1_valesoc) {
		this.destino1_valesoc = destino1_valesoc;
	}

	public String getTipotransp1_valesoc() {
		return tipotransp1_valesoc;
	}

	public void setTipotransp1_valesoc(String tipotransp1_valesoc) {
		this.tipotransp1_valesoc = tipotransp1_valesoc;
	}

	public String getOrigem2_valesoc() {
		return origem2_valesoc;
	}

	public void setOrigem2_valesoc(String origem2_valesoc) {
		this.origem2_valesoc = origem2_valesoc;
	}

	public String getDestino2_valesoc() {
		return destino2_valesoc;
	}

	public void setDestino2_valesoc(String destino2_valesoc) {
		this.destino2_valesoc = destino2_valesoc;
	}

	public String getTipotransp2_valesoc() {
		return tipotransp2_valesoc;
	}

	public void setTipotransp2_valesoc(String tipotransp2_valesoc) {
		this.tipotransp2_valesoc = tipotransp2_valesoc;
	}

	public String getOrigem3_valesoc() {
		return origem3_valesoc;
	}

	public void setOrigem3_valesoc(String origem3_valesoc) {
		this.origem3_valesoc = origem3_valesoc;
	}

	public String getDestino3_valesoc() {
		return destino3_valesoc;
	}

	public void setDestino3_valesoc(String destino3_valesoc) {
		this.destino3_valesoc = destino3_valesoc;
	}

	public String getTipotransp3_valesoc() {
		return tipotransp3_valesoc;
	}

	public void setTipotransp3_valesoc(String tipotransp3_valesoc) {
		this.tipotransp3_valesoc = tipotransp3_valesoc;
	}

	public String getEnviadosetrans_valesoc() {
		return enviadosetrans_valesoc;
	}

	public void setEnviadosetrans_valesoc(String enviadosetrans_valesoc) {
		this.enviadosetrans_valesoc = enviadosetrans_valesoc;
	}

	public String getRecebidosetrans_valesoc() {
		return recebidosetrans_valesoc;
	}

	public void setRecebidosetrans_valesoc(String recebidosetrans_valesoc) {
		this.recebidosetrans_valesoc = recebidosetrans_valesoc;
	}

	public String getResultadosetrans_valesoc() {
		return resultadosetrans_valesoc;
	}

	public void setResultadosetrans_valesoc(String resultadosetrans_valesoc) {
		this.resultadosetrans_valesoc = resultadosetrans_valesoc;
	}

	public String getAnalisadosetrans_valesoc() {
		return analisadosetrans_valesoc;
	}

	public void setAnalisadosetrans_valesoc(String analisadosetrans_valesoc) {
		this.analisadosetrans_valesoc = analisadosetrans_valesoc;
	}

	public String getTipodef_valesoc() {
		return tipodef_valesoc;
	}

	public void setTipodef_valesoc(String tipodef_valesoc) {
		this.tipodef_valesoc = tipodef_valesoc;
	}

	public String getCid_valesoc() {
		return cid_valesoc;
	}

	public void setCid_valesoc(String cid_valesoc) {
		this.cid_valesoc = cid_valesoc;
	}

	public String getAcompanhante_valesoc() {
		return acompanhante_valesoc;
	}

	public void setAcompanhante_valesoc(String acompanhante_valesoc) {
		this.acompanhante_valesoc = acompanhante_valesoc;
	}

	public Integer getFrequenciatrat_valesoc() {
		return frequenciatrat_valesoc;
	}

	public void setFrequenciatrat_valesoc(Integer frequenciatrat_valesoc) {
		this.frequenciatrat_valesoc = frequenciatrat_valesoc;
	}

	public String getMotindefer_valesoc() {
		return motindefer_valesoc;
	}

	public void setMotindefer_valesoc(String motindefer_valesoc) {
		this.motindefer_valesoc = motindefer_valesoc;
	}

	@Override
	public String toString() {
		return "ValeSocial [id_valesoc=" + id_valesoc + ", data_valesoc=" + data_valesoc + ", requerente_valesoc="
				+ requerente_valesoc + ", sexo_valesoc=" + sexo_valesoc + ", nascimento_valesoc=" + nascimento_valesoc
				+ ", cpf_valesoc=" + cpf_valesoc + ", cpfresp_valesoc=" + cpfresp_valesoc + ", nomeresp_valesoc="
				+ nomeresp_valesoc + ", pai_valesoc=" + pai_valesoc + ", mae_valesoc=" + mae_valesoc
				+ ", identidade_valesoc=" + identidade_valesoc + ", orgaoidt_valesoc=" + orgaoidt_valesoc
				+ ", logradouro_valesoc=" + logradouro_valesoc + ", numero_valesoc=" + numero_valesoc
				+ ", complemento_valesoc=" + complemento_valesoc + ", bairro_valesoc=" + bairro_valesoc
				+ ", cidade_valesoc=" + cidade_valesoc + ", cep_valesoc=" + cep_valesoc + ", uf_valesoc=" + uf_valesoc
				+ ", telefone_valesoc=" + telefone_valesoc + ", celular_valesoc=" + celular_valesoc
				+ ", tipotransp_valesoc=" + tipotransp_valesoc + ", origem1_valesoc=" + origem1_valesoc
				+ ", destino1_valesoc=" + destino1_valesoc + ", tipotransp1_valesoc=" + tipotransp1_valesoc
				+ ", origem2_valesoc=" + origem2_valesoc + ", destino2_valesoc=" + destino2_valesoc
				+ ", tipotransp2_valesoc=" + tipotransp2_valesoc + ", origem3_valesoc=" + origem3_valesoc
				+ ", destino3_valesoc=" + destino3_valesoc + ", tipotransp3_valesoc=" + tipotransp3_valesoc
				+ ", enviadosetrans_valesoc=" + enviadosetrans_valesoc + ", recebidosetrans_valesoc="
				+ recebidosetrans_valesoc + ", resultadosetrans_valesoc=" + resultadosetrans_valesoc
				+ ", analisadosetrans_valesoc=" + analisadosetrans_valesoc + ", analiseinicial_valesoc="
				+ analiseinicial_valesoc + ", tipodef_valesoc=" + tipodef_valesoc + ", cid_valesoc=" + cid_valesoc
				+ ", acompanhante_valesoc=" + acompanhante_valesoc + ", frequenciatrat_valesoc="
				+ frequenciatrat_valesoc + ", motindefer_valesoc=" + motindefer_valesoc + ", codposto_valesoc="
				+ codposto_valesoc + ", nomeposto_valesoc=" + nomeposto_valesoc + ", procsetrans_valesoc="
				+ procsetrans_valesoc + ", tiporeq_valesoc=" + tiporeq_valesoc + ", exigencia_valesoc="
				+ exigencia_valesoc + ", motexigencia_valesoc=" + motexigencia_valesoc + ", periciamed_valesoc="
				+ periciamed_valesoc + ", defpermtrans_valesoc=" + defpermtrans_valesoc + ", quantvales_valesoc="
				+ quantvales_valesoc + ", motindefermed_valesoc=" + motindefermed_valesoc + ", medico_valesoc="
				+ medico_valesoc + ", dataanalisemed_valesoc=" + dataanalisemed_valesoc + ", datanasc_ini="
				+ datanasc_ini + ", datanasc_fim=" + datanasc_fim + "]";
	}
}
