package aula_06;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<>();

		while (true) {
			System.out.println(
					"1 - Adicionar Livro na pilha\t2 - Listar todos os Livros\t3 - Retirar Livro da pilha\t0 - Sair");
			String menu = leia.nextLine();

			switch (menu) {
			case "0":
				System.out.println("Programa Finalizado!");
				return;
			case "1":
				System.out.print("Informe o nome do livro: ");
				menu = leia.nextLine();

				pilha.push(menu);
				System.out.println("Livro adicionado!\n");
				break;
			case "2":
				System.out.println("\nPilha: " + pilha + "\n\nLivro adicionado!\n");
				break;
			case "3":
				if (pilha.isEmpty()) {
					System.out.println("\nA Pilha está vazia!\n");
				} else {
					pilha.pop();
					System.out.println(pilha);
				}

				break;
			default:
				System.out.println("Opção inválida\n");

			}
			leia.close();
		}

	}
}
