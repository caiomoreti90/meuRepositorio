package br.com.Beans;

public abstract class Formacao {

	private String descricao;
	private int periodo;
	private double mensalidade;
	private int duracao;

	// Construtor Vazio
	public Formacao() {
		super();
	}


	//Construtor cheio
	public Formacao(String descricao, int periodo, double mensalidade, int duracao) {
		super();
		this.descricao = descricao;
		this.periodo = periodo;
		this.mensalidade = mensalidade;
		this.duracao = duracao;
	}

	// Getters and Setters
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public double getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	// getAll
	public String getAll() {
		return descricao + "\n" + periodo + "\n" + mensalidade + "\n" + duracao;
	}
	public void setAll(String descricao, int periodo, double mensalidade, int duracao) {
		this.descricao = descricao;
		this.periodo = periodo;
		this.mensalidade = mensalidade;
		this.duracao = duracao;
	}

	// Criando o metodo exibirMedia com Polimorfismo
	public double exibirMedia(double ps1, double ps2) { //media aritimetica
		return (ps1+ps2)/2;
	}
	public double exibirMedia (double ps1, double nac1, double ps2, double nac2) {
		return (ps1*0.8 + nac1*0.2 + ps2*0.8 + nac2*0.2)/2;
	}
	public double exibirMedia(double ps1, double nac1, double ps2, double nac2, double am1, double am2) {
		return (ps1*0.5 + nac1*0.2 + am1*0.3 + ps2*0.5 + nac2*0.2 + am2*0.3)/2;
	}

	// definirDuracao
	public void definirDuracao() {
		if(this instanceof Medio) {
			duracao=36;
		}else if(this instanceof Tecnologo) {
			duracao=24;
		}else if(this instanceof Bacharelado) {
			if (descricao.toUpperCase().indexOf("ENGENHARIA")>=0){
				duracao=60;
			}else {
				duracao=0;
			}
		}else {
			duracao=0;
		}
	}

	// calcularMensalidade
	public void calcularMensalidade(double fator) {
		setMensalidade(0);
	}

}
