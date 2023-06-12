package aula_04;

import java.util.Scanner;

public class ElementosImparesDoIndice {
	public static void main(String[] args) {
		int arr[] = new int[10];
		Scanner leia = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Informe um número válido: ");
			arr[i] = leia.nextInt();
		}

		float aux = 0;
		int isPar = 0;

		System.out.println("\nElementos nos índices ímpares: ");
		for (int indicesImpares = 0; indicesImpares < arr.length; indicesImpares++) {
			if (indicesImpares % 2 == 1) {
				System.out.print(arr[indicesImpares] + ", ");
			}
		}

		System.out.println("\n\nElementos pares: ");
		for (int i = 0; i < arr.length; i++) {
			isPar = arr[i];
			if (isPar % 2 == 0) {
				System.out.print(isPar + ", ");
			}

			aux += arr[i];
		}

		System.out.printf("\n\nSoma: %.0f", aux);
		System.out.printf("\nMédia: %.2f", (aux / 10f));

		leia.close();
	}
}