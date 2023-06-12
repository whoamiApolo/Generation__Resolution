package aula_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrContemNumeroSete {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<Integer> number = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			System.out.print("Informe um número: ");
			Integer n = leia.nextInt();
			number.add(n);
		}

		Collections.sort(number);
		System.out.println(number);

		if (number.contains(7)) {
			System.out.print("O número 7 está localizado na posição: " + number.indexOf(7));
		} else if (number.contains(40)) {
			System.out.print("O número 40 não foi encontrado!");
		}

		leia.close();
	}
}
