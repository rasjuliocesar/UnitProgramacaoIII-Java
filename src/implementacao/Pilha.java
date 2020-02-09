package implementacao;

public class Pilha {

	private int topo = -1;
	final int TAMANHO = 8;

	String[] americaSul = new String[TAMANHO];

	public boolean vazio() {
		if (topo == -1) {
			return true;
		}
		return false;
	}

	public boolean cheio() {
		if (topo >= TAMANHO - 1) {
			return true;
		}
		return false;
	}

	public String top() {
		if (topo > -1) {
			return "\nO Conteiner " + americaSul[topo] + " está no Topo!";
		}
		return "\nNão há Contêiner(s) no Navio!";
	}

	public String push(String elemento) {
		if (topo < TAMANHO - 1) {
			topo++;
			americaSul[topo] = elemento;
			return "\nConteiner " + elemento + " adicionado com Sucesso!";
		}
		return "\nNavio lotado de Conteiners - Não foi possível adicionar " + elemento + "!";
	}

	public String pop() {
		if (topo == -1) {
			return "\nNão há Contêiner(s) no Navio!";
		}
		if (topo == 0) {
			String auxiliar = americaSul[0];
			americaSul[0] = null;
			topo--;
			return "\nConteiner " + auxiliar + " removido do navio com Sucesso!";
		}
		String auxiliar = americaSul[topo];
		americaSul[topo] = null;
		topo--;
		return "\nConteiner " + auxiliar + " removido do navio com Sucesso";
	}

	public void listar() {
		
		System.out.println("\nLista de Cotêinerers no Navio América do Sul: \n");
		
		for (int i = TAMANHO - 1; i >= 0; i--) {
			if (americaSul[i] != null) {
				System.out.println("|" + americaSul[i] + "|");
			}
		}
	}

	public void listarBubbleSort() {
		String aux = null;

		for (int i = 0; i <= americaSul.length - 1; i++) {
			for (int j = 1; j <= americaSul.length - 1 - i; j++) {
				if (americaSul[j] != null) {
					if (americaSul[j - 1].charAt(0) > americaSul[j].charAt(0)) {
						aux = americaSul[j - 1];
						americaSul[j - 1] = americaSul[j];
						americaSul[j] = aux;
					}
				}
			}
		}

		System.out.println("\nCotêiner América do Sul - Listado Ordenado Bubble Sort: \n");

		for (int i = 0; i <= americaSul.length - 1; i++) {
			if (americaSul[i] != null) {
				System.out.println(americaSul[i]);
			}
		}
	}

	public void listarInsertion() {
		for (int i = 1; i < americaSul.length; i++) {

			int j = i - 1;
			String key = americaSul[i];

			if (americaSul[i] != null) {
				char elementoUm = americaSul[i].charAt(0);
				char elementoDois = americaSul[j].charAt(0);

				while ((j >= 0) && (elementoDois >= elementoUm)) {
					americaSul[j + 1] = americaSul[j];
					j--;
					if (j >= 0) {
						elementoDois = americaSul[j].charAt(0);
					}
				}
				americaSul[j + 1] = key;
			}
		}

		System.out.println("\nContêiner América do Sul - Listado Ordenado Insertion Sort: \n");

		for (int i = 0; i < americaSul.length; i++) {
			if (americaSul[i] != null) {
				System.out.println(americaSul[i]);
			}
		}
	}

	public void listarSelection() {
		int indice = 0;
		String menorNumero = null;

		for (int i = 0; i < americaSul.length - 1; i++) {
			indice = i;

			for (int j = i + 1; j < americaSul.length; j++) {
				if (americaSul[j] != null) {
					if (americaSul[j].charAt(0) < americaSul[indice].charAt(0)) {
						indice = j;
					}
				}
			}
			menorNumero = americaSul[indice];
			americaSul[indice] = americaSul[i];
			americaSul[i] = menorNumero;
		}

		System.out.println("\nContêiner América do Sul - Listado Ordenado Selection Sort: \n");

		for (int i = 0; i < americaSul.length; i++) {
			if (americaSul[i] != null) {
				System.out.println(americaSul[i]);
			}
		}
	}

}
