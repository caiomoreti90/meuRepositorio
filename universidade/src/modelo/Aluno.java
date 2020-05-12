package modelo;

public class Aluno {
	private String nome;
	private int numeroMatricula;
	private String email;
	private Endereco endereco;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}



	// construtor vazio
	public Aluno() {
		System.out.println("Instanciou um aluno");
	}

	public void setAll(String nome, int NumeroMatricula, String email, Endereco endereco) {
		this.nome = nome;
		this.numeroMatricula = NumeroMatricula;
		this.email = email;
		this.endereco=endereco;
	}
	
	public String getAll() {
		return nome + "\n" + numeroMatricula + "\n" + email + "\n" + endereco.getAll();
//		return nome + "\n" + numeroMatricula + "\n" + email + "\n" + endereco.getCep();
			
	}
/*	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public String getEmail() {
		return email;
	}
*/
	
	
	
}
