package br.com.Beans;

public abstract class Produto {
	private int codigo;
	private double preco;
	private String descricao;

	// Poliformisto: usando instance of nao precisaria dos metodos nas subclasses
	// Por�m, para uma eventual mudan�a de qualquer mudan�a iria impactar a super e TODAS as subclasses
	public double calcularValorFinal() {
		if(this instanceof Livro) {
			return preco*1.05;		
		}else if (this instanceof CompactDisc) {
			return preco*1.15;
		}else {
			return preco;
		}	

	}

	// CD tem um imposto de 15%
	// Livro tem imposto de 5%
	// Metodo a ser criado: calcularValorFinal()



	// Construtor vazio
	public Produto() {
		super();
	}

	// Construtor cheio	
	public Produto(int codigo, double preco, String descricao) {
		super();
		this.codigo = codigo;
		this.preco = preco;
		this.descricao = descricao;
	}

	// Getters e Setters individuais
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	// Getters Totais
	public String getAll () {
		return codigo+"\n"+preco+"\n"+ descricao;
	}

	// Setters Totais
	public void setAll(int codigo, double preco, String descricao) {
		this.codigo = codigo;
		this.preco = preco;
		this.descricao = descricao;
	}
}
