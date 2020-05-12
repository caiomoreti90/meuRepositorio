package br.com.universidademodelo;

public class Aluno extends Pessoa{ // Indica que a classe Aluno é filho de Pessoa

	private int numeroMatricula;
	private String responsavel;

	// Construtor Vazio
	public Aluno() {
		super();
	}

	// Construtor cheio
	public Aluno(String nome, String email, String fone, int numeroMatricula, String responsavel) {
		super(nome, email, fone);
		this.numeroMatricula = numeroMatricula;
		this.responsavel = responsavel;
	}

	// Getters e Setters individuais
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	// Set All -> Toma como referencia o construtor cheio
	public void setAll(String nome, String email, String fone, int numeroMatricula, String responsavel) {
		super.setAll(nome, email, fone);
		this.numeroMatricula = numeroMatricula;
		this.responsavel = responsavel;
	}

	// Get All
	public String getAll () {
		return numeroMatricula+"\n"+responsavel+"\n"+ super.getAll();
	}

}
