package aplicacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import implementacao.Pilha;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Pilha navio = new Pilha();

		int loopAplicacao = 1;

		while (loopAplicacao != 0) {
			System.out.println("1 - Listar Pilha");
			System.out.println("2 - Empilhar");
			System.out.println("3 - Desempilhar");
			System.out.println("4 - Verificar Topo");
			System.out.println("5 - Vazia");
			System.out.println("6 - Cheia");
			System.out.println("7 - Listar Insertion Sort");
			System.out.println("8 - Listar Selection Sort");
			System.out.println("0 - SAIR");
			int opcaoMenu = teclado.nextInt();
			switch (opcaoMenu) {
			case 1:
				navio.listar();
				break;
			case 2:
				System.out.println(navio.push(55));// Brasil
				System.out.println(navio.push(54));// Argentina
				System.out.println(navio.push(56));// Chile
				System.out.println(navio.push(57));// Colômbia
				System.out.println(navio.push(598));// Uruguai
				System.out.println(navio.push(595));// Paraguai
				System.out.println(navio.push(51));// Peru
				System.out.println(navio.push(591));// Bolivia
				System.out.println(navio.push(593));// Equador
				break;
			case 3:
				System.out.println(navio.pop());
				break;
			case 4:
				System.out.println(navio.top());
				break;
			case 5:
				System.out.println(navio.vazio());
				break;
			case 6:
				System.out.println(navio.cheio());
				break;
			case 7:
				navio.listarInsertion();
				break;
			case 8:
				navio.listarSelection();
				break;
			case 0:
				System.out.println("Sistema Encerrado!");
				loopAplicacao = 0;
				break;
			default:
				System.out.println("Valor Inválido.");
				break;
			}

		}

		teclado.close();

	}

}
