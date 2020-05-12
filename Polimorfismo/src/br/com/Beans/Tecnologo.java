package br.com.Beans;

public class Tecnologo extends Formacao{
	private boolean planoEstendido;

	//Construtor vazio
	public Tecnologo() {
		super();
	}

	// Construtor cheio
	public Tecnologo(String descricao, int periodo, double mensalidade, int duracao, boolean planoEstendido) {
		super(descricao, periodo, mensalidade, duracao);
		this.planoEstendido = planoEstendido;
	}

	// Getters and Setters
	public boolean isPlanoEstendido() {
		return planoEstendido;
	}
	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}

	// getAll
	public String getAll(){
		return planoEstendido + "\n" + super.getAll();
	}
	
	//setAll
	public void setAll(String descricao, int periodo, double mensalidade, int duracao, boolean planoEstendido) {
		super.setAll(descricao, periodo, mensalidade, duracao);
		this.planoEstendido = planoEstendido;
	}

	// M�todo calcularMensalidade
	public void calcularMensalidade(double fator) {
		super.setMensalidade(super.getDuracao()*fator*600);
	}

}
