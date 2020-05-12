package br.com.Beans;

public class Livro extends Produto{
	private String isbn;
	private String autor;
	
	public double calcularValorFinal() {
		return super.getPreco()*1.05;
	}
	
	
	// Construtor vazio
	public Livro() {
		super();
	}

	// Construtor Cheio
	public Livro(int codigo, double preco, String descricao, String isbn, String autor) {
		super(codigo, preco, descricao);
		this.isbn = isbn;
		this.autor = autor;
	}

	
	// Getters e Setters individuais
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	// Getters totais
	public String getAll () {
		return isbn+"\n"+autor+"\n"+ super.getAll();
	}

	// Setters totais
	public void setAll(int codigo, double preco, String descricao, String isbn, String autor) {
		super.setAll(codigo, preco, descricao);
		this.isbn = isbn;
		this.autor = autor;
	}	
	
}
