package Beans;

import javax.swing.JOptionPane;

import br.com.Beans.Bacharelado;
import br.com.Beans.Formacao;
import br.com.Beans.Medio;
import br.com.Beans.Tecnologo;

public class Teste {

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
		Formacao objeto = null;
		char resposta = JOptionPane.showInputDialog("Escolha:\n<1> Medio\n<2> Tecnologo\n<3> Bacharelado").charAt(0);
		if (resposta=='1') {
			objeto = new Medio(
					texto("Descricao"),
					inteiro("Periodo"),
					0,
					0,
					texto("Tipo")
					);
		}else if (resposta=='2') {
			objeto = new Tecnologo(
					texto("Descricao"),
					inteiro("Periodo"),
					0,
					0,
					true //miss�o criar o metodo est�tico para boolean
					);
		}else if(resposta=='3') {
			objeto = new Bacharelado(
					texto("Descricao"),
					inteiro("Periodo"),
					0,
					0,
					texto("Projeto de Conclusao"),
					inteiro("Carga Hor�ria Estagio")
					);
		}else {
			System.out.println("Op��o Inv�lida!!!");
		}
		objeto.definirDuracao();
		objeto.calcularMensalidade(0.15);
		System.out.println(objeto.getAll());
	}

}
