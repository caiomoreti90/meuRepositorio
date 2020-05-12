package Test;

public class Conta {
	
	private double saldo;
	private Cliente titular;
	
	//Construtor vazio
	public Conta() {
		super();
	}

	
	//Construtor cheio
	public Conta(double saldo, Cliente titular) {
		super();
		this.saldo = saldo;
		this.titular = titular;
	}

	// Getters e Setters individuais
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	//Getter total
	public String getAll () {
		return saldo+"\n"+titular;
	}
	
	//Setter total	
	public void setAll(double saldo, Cliente titular) {
		this.saldo = saldo;
		this.titular = titular;
	}
}
