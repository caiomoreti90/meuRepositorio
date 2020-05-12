package br.com.universidademodelo;

public class Professor extends Pessoa{
	
	private String apelido;
	private String materia;
	
	// Construtor Vazio
	public Professor() {
		super();
	}
	
	//Construtor cheio
	public Professor(String nome, String email, String fone, String apelido, String materia) {
		super(nome, email, fone);
		this.apelido = apelido;
		this.materia = materia;
	}

	// Getters e Setters individuais
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	// Get All
	public String getAll () {
		return apelido+"\n"+materia+"\n"+ super.getAll();
	}
	
	// Set All
	public void setAll(String nome, String email, String fone, String apelido, String materia) {
		super.setAll(nome, email, fone);
		this.apelido = apelido;
		this.materia = materia;
	}	

}
