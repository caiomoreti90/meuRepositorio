package projeto_pilha;

public class Teste {

	public static void main(String[] args) {
		
	Pilha idades = new Pilha();

	System.out.println("Vazio? " + idades.vazio());
	System.out.println("Cheio? " + idades.cheio());

	System.out.println(idades.retirar());
	idades.inserir(18);
	idades.inserir(25);
	idades.inserir(44);

	System.out.println(idades.retirar());
	System.out.println(idades.retirar());
	System.out.println(idades.retirar());
	System.out.println(idades.retirar());
}

}
