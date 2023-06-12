package aula_03;

import java.util.Scanner;

public class ForQntParOuImpar {

	public static void main(String[] args) {
		int number, pares = 0, impares = 0;

		Scanner leia = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "° número.");
			number = leia.nextInt();

			if (number % 2 == 0) {
				pares++;
				System.out.println(number);
			} else if(number % 2 == 1) {
				impares++;
				System.out.println(number);
			} else {
				System.out.println("Dado inválido.");
			}
		}
		System.out.println("A quantidade de números pares digitados foi: " + pares);
		System.out.println("A quantidade de números pares digitados foi: " + impares);
		
		leia.close();
	}
}
