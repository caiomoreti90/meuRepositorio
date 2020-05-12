package br.com.Beans;

public class Medio extends Formacao {
	private String tipo;

	public Medio() {
		super();
	}

	public Medio(String descricao, int periodo, double mensalidade, int duracao, String tipo) {
		super(descricao, periodo, mensalidade, duracao);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getAll() {
		return tipo + "\n" + super.getAll();
	}

	public void setAll(String descricao, int periodo, double mensalidade, int duracao, String tipo) {
		super.setAll(descricao, periodo, mensalidade, duracao);
		this.tipo = tipo;
	}
	public void calcularMensalidade(double fator) {
		super.setMensalidade(super.getDuracao() * fator *500);
	}

}
