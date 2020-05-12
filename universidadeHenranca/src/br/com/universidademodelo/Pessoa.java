package br.com.universidademodelo;

public class Pessoa {	//Super Classe
	private String nome;
	private String email;
	private String fone;
	
	
	// Getters e Setters individuais
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	// Construtor cheio
	public Pessoa(String nome, String email, String fone) {
		super();
		this.nome = nome;
		this.email = email;
		this.fone = fone;
	}
	
	// Get All
	public String getAll () {
		return nome+"\n"+email+"\n"+fone;
	}
	
	// Set All ( Semelhante ao Construtor cheio)
	public void setAll(String nome, String email, String fone) {
		this.nome = nome;
		this.email = email;
		this.fone = fone;
	}
	
	// Construtor vazio
	public Pessoa() {
		super();
	}
	
	
}
