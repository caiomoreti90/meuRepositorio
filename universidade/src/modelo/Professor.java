package modelo;

public class Professor {
	private String nome;
	private String apelido;
	private String materia;
	private Endereco endereco;
	
	
	public Professor() {}
	
	// metodo Constutor
	public Professor(String nome, String apelido, String materia, Endereco endereco) {
		this.nome=nome;
		this.apelido=apelido;
		this.materia=materia;
		this.endereco=endereco;
	}
	
	public String getAll() {
		return nome + "\n" + apelido + "\n" + materia + "\n" + endereco.getAll();
//		return nome + "\n" + apelido + "\n" + materia + "\n" + endereco.getcep();
//		return nome + "\n" + apelido + "\n" + materia + "\n" + endereco.getcep()+endereco.getcep();
	}
	public void setAll(String nome, String apelido, String materia, Endereco endereco) {
		this.nome=nome;
		this.apelido=apelido;
		this.materia=materia;
		this.endereco=endereco;
	}

}
