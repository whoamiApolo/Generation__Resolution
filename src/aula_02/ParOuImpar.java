package aula_02;

import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args) {
		int number = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("Informe um número");
		number = leia.nextInt();

		if (number > 0) {
			if (number % 2 == 0 && number >= 0) {
				System.out.println("O número " + number + " é par e positivo!");
			} else {
				System.out.println("O número " + number + " é ímpar e positivo!");
			}
		} else {
			if (number % 2 == 0 && number < 0) {
				System.out.println("O número " + number + "é par e negativo!");
			} else {
				System.out.println("O número " + number + " é ímpar e negativo!");
				
			}
		}
		leia.close();
	}
}