package collection_framework;

public class Cargo implements Comparable<Cargo>{
	private String nome;
	private String nivel;
	private double salario;

	/*public int compareTo(Cargo outro) {
		if(this.salario<outro.salario) {
			return -1;
		}else if (this.salario>outro.salario) {
			return 1;
		}
		return 0;
	}*/
	
	
	public int compareTo(Cargo outro) {
		return nome.compareTo(outro.nome);
	}
	
	// Construtor vazio
	public Cargo() {
		super();
	}

	// Construtor cheio
	public Cargo(String nome, String nivel, double salario) {
		super();
		this.nome = nome;
		this.nivel = nivel;
		this.salario = salario;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	//setAll
	public void setAll(String nome, String nivel, double salario) {
		this.nome = nome;
		this.nivel = nivel;
		this.salario = salario;
	}

	// getAll
	public String getAll() {
		return nome + "\n" + nivel +"\n" + salario;
	}
}
