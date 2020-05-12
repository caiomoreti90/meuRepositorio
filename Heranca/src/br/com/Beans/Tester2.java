package br.com.Beans;

import javax.swing.JOptionPane;

public class Tester2 {
	
	public static String texto(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	public static int inteiro(String msg) {
		return Integer.parseInt(texto(msg));
	}
	
	public static double decimal(String msg) {
		return Double.parseDouble(texto(msg));
	}

	public static void main(String[] args) {
		
		Produto produto=null;
		
		// Primeira validação
		//Livro livro = new Livro(171,25,"Iracema","Pearson", "Jose de Alencar");
		//System.out.println(livro.getAll());
		
		// Segunda validacao
		Livro livro = new Livro();
		CompactDisc cd = new CompactDisc();
		// Produto objeto3 = new Produto(); // a classe Produto está abstrata e nao pode ser instanciada
		
		String resposta = texto("Digite: \n<L> para Livro ou\n<C> para CD");
		
		if (resposta.equals("L")) {
			produto = new Livro(
					//Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo:")),
					inteiro("Digite o codigo:"),
					//Double.parseDouble(JOptionPane.showInputDialog("Digite o valor:")),
					decimal("Digite o valor:"),
					//JOptionPane.showInputDialog("Digite a descricao").toUpperCase(),
					texto("Digite a descricao"),
					//JOptionPane.showInputDialog("Digite o ISBN:").toUpperCase(), 
					texto("Digite o ISBN:"),
					//JOptionPane.showInputDialog("Digite o autor:").toUpperCase()
					texto("Digite o autor:")
					);
			System.out.println(livro.getAll());
			System.out.println(livro.calcularValorFinal());
		}
		else if(resposta.equals("C")) {
			produto = new CompactDisc(
					inteiro("Codigo"),
					decimal("Preco"),
					texto("Descricao"),
					texto("Gravadora"),
					texto("Artista")
					);
			System.out.println(cd.getAll());
			System.out.println(cd.calcularValorFinal());
		}
		else {
			System.out.println("Opcao invalida");
		}
		System.out.println(produto.getAll());
		System.out.println(produto.calcularValorFinal());
				
	}

}
