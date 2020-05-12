package teste;

import javax.swing.JOptionPane;

import modelo.Aluno;
import modelo.Endereco;

public class TesteSetIndividual {

	public static void main(String[] args) {

		Endereco objetoEndereco = new Endereco();
		Aluno objetoAluno = new Aluno();
		
		
		objetoAluno.setNome(JOptionPane.showInputDialog("Digite o Nome").toUpperCase());
		objetoAluno.setNumeroMatricula(Integer.parseInt(JOptionPane.showInputDialog("Entre com a Matricula ")));
		objetoAluno.setEmail(JOptionPane.showInputDialog("Entre com o email: ").toLowerCase());
		
		
		objetoEndereco.setAll("Rua Augusta Santel","39","Jardim Celeste","SP","Sao Paulo","04195120");
		objetoAluno.setAll("Caio",90602,"caio.moreti@gmail.com",objetoEndereco);
		objetoEndereco.setLogradouro("abcde");
		objetoEndereco.setUf("SP");
		System.out.println(objetoAluno.getAll());
		
			
		System.out.println("O numero de matricula digitado foi: " + objetoAluno.getNumeroMatricula());		
		System.out.println("O nome escrito eh: " + objetoAluno.getNome());
		System.out.println("O email digitado foi: " + objetoAluno.getEmail());
		
	}

}