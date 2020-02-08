package implementacao;

public class Pilha {

	private int topo = -1;
	final int TAMANHO = 8;
	
	int[] americaSul = new int[TAMANHO];
	
	public String vazio() {
		if(topo == -1) {
			return "Não há Contêiner(s) no Navio!";
		}
		return "Há Contêiner(s) no Navio! ";
	}
	
	public String cheio() {
		if(topo >= TAMANHO - 1) {
			return "Navio lotado de Conteiners!";
		}
		return "Ainda há vagas para Conteiners no Navio!";
	}
	
	public String top() {
		if(topo > -1) {
			return "O Conteiner " + americaSul[topo] + " está no Topo!";
		}
		return "Não há Contêiner(s) no Navio!";
	}
	
	public String push(int elemento) {
		if(topo < TAMANHO - 1) {
			topo++;
			americaSul[topo] = elemento;
			return "Conteiner " + elemento + " adicionado com Sucesso!";
		}
		return "Navio lotado de Conteiners - Não foi possível adicionar " + elemento + "!";
	}
	
	public String pop() {
		if(topo == -1) {
			return "Não há Contêiner(s) no Navio!";
		}
		if(topo == 0) {
			int auxiliar = americaSul[0];
			americaSul[0] = 0;
			topo--;
			return "Conteiner " + auxiliar + " removido do navio com Sucesso!";
		}
		int auxiliar = americaSul[topo]; 
		americaSul[topo] = 0;
		topo--;
		return "Conteiner " + auxiliar + " removido do navio com Sucesso";
	}
	
	public void listar() {
		for(int i = TAMANHO - 1; i >= 0; i--) {
			if(americaSul[i] != 0) {
				System.out.println("|" + americaSul[i] + "|\n");
			}
		}
	}
	
	public void listarInsertion() {
		for(int i = 1; i < americaSul.length; i++) {
			int j = i - 1;
			int key = americaSul[i];
			
			while((j >= 0) && (americaSul[j] >= key)) {
				americaSul[j + 1] = americaSul[j];
				j--;
			}
			americaSul[j + 1] = key;
		}
		
		System.out.println("Contêiner América do Sul - Listado Ordenado Insertion Sort: ");
		for(int i = 0; i < americaSul.length; i++) {
			System.out.println(americaSul[i]);
		}
	}
	
	public void listarSelection() {
		int indice = 0, menorNumero = 0;
		
		for(int i = 0; i < americaSul.length - 1; i++) {
			indice = i;
			for(int j = i + 1; j < americaSul.length; j++) {
				if(americaSul[j] < americaSul[indice]) {
					indice = j;
				}
			}
			menorNumero = americaSul[indice];
			americaSul[indice] = americaSul[i];
			americaSul[i] = menorNumero;
		}
		
		System.out.println("Contêiner América do Sul - Listado Ordenado Selection Sort: ");
		for(int i = 0; i < americaSul.length; i++) {
			System.out.println(americaSul[i]);
		}
	}
	
	
}
