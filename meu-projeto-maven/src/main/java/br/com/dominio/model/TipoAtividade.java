package br.com.dominio.model;

public enum TipoAtividade {
	
	APRESENTACAO("Apresenta��o"), CURSO("Curso"), MINICURSO("Minicurso"), PALESTRA("Palestra"), SEMININARIO("Semin�rio"), SIMPOSIO("Simp�sio"), OUTRA("Outras");
	
	private String descricao;

	private TipoAtividade(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
}
