package projeto_fila;

public class Fila {
	private int inicio;
	private int fim;
	private int vetor[];
	private int total;
	
	public Fila() {
		vetor=new int[10];
		inicio=-1;
		fim=-1;	// uma fila que nao existe possui o ponto de partida e o destino iguais
	}
	
	public boolean vazio() {
		return (total==0);
	}
	public boolean cheio() {
		return (total==9);
	}
	
	// Metodo para inserir o dado na fila
	public void inserir(int valor) {
		if(!cheio()) {
			fim++;
			vetor[fim]=valor;
			total++;
		}
	}
	
	// Metodo para retirar o dado na fila
	public int atender() {
		if(!vazio()) {
			inicio++;
			int valor = vetor[inicio];
			total--;
			return valor;
		}else {
			return -1;
		}
	}
	
	
	
	
	

}
