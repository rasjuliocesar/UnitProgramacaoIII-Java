package aplicacao;

import implementacao.Pilha;

public class Main {

	public static void main(String[] args) {
		
		Pilha navio = new Pilha();

		System.out.println(navio.push("Chile"));
		System.out.println(navio.push("Sudao"));
		System.out.println(navio.push("Egito"));
		System.out.println(navio.push("India"));
		System.out.println(navio.push("China"));
		navio.listar();
		System.out.println(navio.cheio());
		System.out.println(navio.vazio());
		System.out.println(navio.top());
		System.out.println(navio.pop());

		navio.listar();
		

	}

}
