package teste;

import modelo.Aluno;
import modelo.Endereco;

public class TesteSetAll {

	public static void main(String[] args) {

		Endereco objetoEndereco = new Endereco();
		Aluno objetoAluno = new Aluno();
		
	
		objetoEndereco.setAll("Rua Augusta Santel","39","Jardim Celeste","SP","Sao Paulo","04195120");
		objetoAluno.setAll("Caio",90602,"caio.moreti@gmail.com",objetoEndereco);
		System.out.println(objetoAluno.getAll());
		System.out.println("Até logo ...");
		}

}
