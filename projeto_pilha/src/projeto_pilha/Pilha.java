package projeto_pilha;

public class Pilha {
	private int topo; // indice
	private int vetor[]; //vetor

	// Metodo que cria a pilha
	public Pilha() {
		vetor=new int[10]; // instancia o objeto
		topo=-1; //pilha iniciando em 0. 0 j� � uma posi��o da pilha, por isso o -1
	}

	//Metodo que verifica se a pilha est� vazia
	public boolean vazio() { //metodo booleano pois ou � verdadeiro ou falso
		return (topo==1);
	}

	//Metodo que verifica se a pilha est� cheia
	public boolean cheio() {
		return (topo==9);			// 9 pois a pilha contem 10 elementos de 0 a 9
	}

	// Metodo para inserir na pilha
	public void inserir(int valor) {
		if(!cheio()) {
			topo++;
			vetor[topo]=valor;
		}
		else {
			System.out.println("Pilha cheia!");
		}
	}

	// Metodo para retirar da pilha
	public int retirar() {
		if(!vazio()) {
			int valor=vetor[topo];
			topo--;
			return valor;
		}
		return -1;
	}



















}
