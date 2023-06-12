package aula_02;

import java.util.Scanner;

public class AeBMaiorQueC {
	public static void main(String[] args) {
		int n1, n2, n3, somaValores;

		Scanner leia = new Scanner(System.in);

		System.out.println("Informe o 1° número");
		n1 = leia.nextInt();

		System.out.println("Informe o 2° número");
		n2 = leia.nextInt();

		System.out.println("Informe o 3° número");
		n3 = leia.nextInt();

		somaValores = n1 + n2;

		if (somaValores > n3) {
			System.out.println("A soma de A + B é maior que C");
		} else if (somaValores < n3) {
			System.out.println("A soma de A + B é menor que C");
		} else {
			System.out.println("A soma de A + B é igual a C");
		}
		leia.close();
	}
}
