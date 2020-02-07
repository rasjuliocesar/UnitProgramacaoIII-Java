package implementacao;

public class Pilha {

	private int topo = -1;
	final int TAMANHO = 5;
	
	String[] conteiner = new String[TAMANHO];
	
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
			return "O Conteiner " + conteiner[topo] + " está no Topo!";
		}
		return "Não há Contêiner(s) no Navio!";
	}
	
	public String push(String elemento) {
		if(topo < TAMANHO - 1) {
			topo++;
			conteiner[topo] = elemento;
			return "Conteiner " + elemento + " adicionado com Sucesso!";
		}
		return "Navio lotado de Conteiners - Não foi possível adicionar " + elemento + "!";
	}
	
	public String pop() {
		if(topo == -1) {
			return "Não há Contêiner(s) no Navio!";
		}
		if(topo == 0) {
			String auxiliar = conteiner[0];
			conteiner[0] = null;
			topo--;
			return "Conteiner " + auxiliar + " removido do navio com Sucesso!";
		}
		String auxiliar = conteiner[topo]; 
		conteiner[topo] = null;
		topo--;
		return "Conteiner " + auxiliar + " removido do navio com Sucesso";
	}
	
	public void listar() {
		for(int i = TAMANHO - 1; i >= 0; i--) {
			if(conteiner[i] != null) {
				System.out.println("--------");
				System.out.println("| " + conteiner[i] + " |");
				System.out.println("--------");
			}
		}
	}
	
}
