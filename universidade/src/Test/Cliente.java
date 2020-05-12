package Test;

public class Cliente {
	
	private String nome;
	private String cpf;
	private Endereco endereco;

	public String getAll() {
		return nome + cpf + endereco.getAll();
	}
	
	public void setAll() {
		this.nome=nome;
		this.cpf=cpf;
		
	}
	
	
}
