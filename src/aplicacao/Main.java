package aplicacao;

import java.util.Scanner;

import implementacao.Pilha;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Pilha navio = new Pilha();

		int loopAplicacao = 1;

		System.out.println("Navegue pelo Menu em busca de adicionar/remover/listar elementos na Pilha.\n");

		while (loopAplicacao != 0) {
			System.out.println("\n-=-=-=-=-=-=-=-=-=-= NAVIO DAS AMERICAS -=-=-=-=-=-=-=-=-=-=");
			System.out.println("------------------------------------------------------------\n");
			System.out.println("[1] - Listar Pilha          [2] - Empilhar ");
			System.out.println("[3] - Desempilhar           [4] - Verificar Topo ");
			System.out.println("[5] - Verificar Pilha Vazia [6] - Verificar Pilha Cheia ");
			System.out.println("[0] - SAIR \n");
			System.out.println("[ ] - Listas Ordenadas: ");
			System.out.println("[7] - Bubble Sort ");
			System.out.println("[8] - Lista Ordenada Insertion Sort ");
			System.out.println("[9] - Lista Ordenada Selection Sort ");
			System.out.print("\nPor favor informa uma Opção presente no Menu acima: ");
			int opcaoMenu = teclado.nextInt();
			switch (opcaoMenu) {
			case 1:
				if(navio.vazio() == true) {
					System.out.println("\nNão há Contêiner(s) no Navio!\n");
				}else {
					navio.listar();
				}
				break;
			case 2:
				int opcaoEmpilhar = 1;
				while (opcaoEmpilhar != 0) {
					System.out.print("\nInforme o nome do País de origem do Contêiner que será empilhado no Navio: ");
					System.out.println(navio.push(teclado.next().toUpperCase()));
					System.out.print("\nDeseja Empilhar outro Contêiner (1 - SIM / 0 - NÃO): ");
					opcaoEmpilhar = teclado.nextInt();
					System.out.println();
				}
				break;
			case 3:
				System.out.println(navio.pop());
				break;
			case 4:
				System.out.println(navio.top());
				break;
			case 5:
				if (navio.vazio()) {
					System.out.println("\nNão há Contêiner(s) no Navio!\n");
				} else {
					System.out.println("\nHá Contêiner(s) no Navio!\n");
				}
				break;
			case 6:
				if (navio.cheio()) {
					System.out.println("\nNavio lotado de Conteiners!\n");
				} else {
					System.out.println("\nAinda há vagas para Conteiners no Navio!\n");
				}
				break;
			case 7:
				navio.listarBubbleSort();
				break;
			case 8:
				navio.listarInsertion();
				break;
			case 9:
				navio.listarSelection();
				break;
			case 0:
				System.out.println("\nSistema Encerrado!");
				loopAplicacao = 0;
				break;
			default:
				System.out.println("\nValor Inválido.");
				break;
			}

		}

		teclado.close();

	}

}
