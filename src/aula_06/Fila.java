package aula_06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		Scanner leia = new Scanner(System.in);

		while (true) {
			System.out.print("\n1 - Adicionar Cliente na Fila\t2 - Listar\t3 - Remover\t0 - Sair\n");

			String menu = leia.nextLine();

			switch (menu) {
			case "0":
				System.out.println("Programa finalizado!");
				return;
			case "1":
				System.out.println("\nAdicione a Fila: \n");
				menu = leia.nextLine();

				fila.add(menu);
				System.out.print("\n" + fila + "\n\nCliente Adicionado!\n");
				break;
			case "2":
				System.out.println("\nLista de Clientes na Fila: \n" + fila);
				break;
			case "3":
				if (fila.poll() != null) {
					System.out.println("\nFila:\n\n" + fila + "\n\nRemovido da Fila!");
				} else {
					System.out.println("A Pilha está vazia!");
				}

				fila.poll();
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
			leia.close();
		}

	}
}
