package br.com.dominio.model;

public enum TipoAtividade {
	
	APRESENTACAO("Apresentação"), CURSO("Curso"), MINICURSO("Minicurso"), PALESTRA("Palestra"), SEMININARIO("Seminário"), SIMPOSIO("Simpósio"), OUTRA("Outras");
	
	private String descricao;

	private TipoAtividade(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
}
