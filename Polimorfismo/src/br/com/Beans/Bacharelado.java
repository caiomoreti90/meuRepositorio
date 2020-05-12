package br.com.Beans;

public class Bacharelado extends Formacao{
	private String projetoConclusao;
	private int cargaHorariaEstagio;

	//Construtor vazio
	public Bacharelado() {
		super();
	}

	//Construtor cheio
	public Bacharelado(String descricao, int periodo, double mensalidade, int duracao, String projetoConclusao,	int cargaHorariaEstagio) {
		super(descricao, periodo, mensalidade, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}

	// Getters and Setters
	public String getProjetoConclusao() {
		return projetoConclusao;
	}
	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}
	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}
	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}

	// getAll
	public String getAll() {
		return projetoConclusao + "\n" + cargaHorariaEstagio + "\n" + super.getAll();
	}
	// setAll
	public void setAll(String descricao, int periodo, double mensalidade, int duracao, String projetoConclusao,
			int cargaHorariaEstagio) {
		super.setAll(descricao, periodo, mensalidade, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	// Método calcularMensalidade
	public void calcularMensalidade(double fator) {
		super.setMensalidade(super.getDuracao()*fator*600 + 12*cargaHorariaEstagio);
	}

}
