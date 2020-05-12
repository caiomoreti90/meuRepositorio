package teste;

import javax.swing.JOptionPane;

import modelo.Endereco;
import modelo.Professor;

public class TesteConstrutorCheio {
	
	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg);
		}
		
	public static void main(String[] args) {

		Professor objetoProfessor = new Professor(
				s("Entre com o nome do professor"),		// Criado um metodo estatico antes do main para nao ter que escrever o JOptionPane toda vez.
				s("Entre com o apelido do professor"),
				s("Entre com a materia do professor"), 
				new Endereco(
						s("Entre com a rua do professor"),
						s("Entre com o numero da rua do professor"),
						s("Entre com o bairro do professor"),
						s("Entre com a cidade do professor"), 
						s("Entre com Estado do professor"),
						s("Entre com o CEP do professor")
						)
				);
		//Professor objetoProfessor = new Professor("Madruga","Madruguinha","Filosofia", new Endereco("Rua x","1A","Centro","Sao Paulo", "SP","04195120"));
		
						
		System.out.println(objetoProfessor.getAll());
		
	}

}
