package aula_03;

import java.util.Scanner;

public class ForDivisivelPorTresECinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int primeiroNumero, ultimoNumero;

		Scanner leia = new Scanner(System.in);

		System.out.println("Informe o número");
		primeiroNumero = leia.nextInt();

		System.out.println("Informe o número");
		ultimoNumero = leia.nextInt();
		leia.close();

		if (primeiroNumero < ultimoNumero) {
			for (; primeiroNumero <= ultimoNumero; primeiroNumero++) {
				if (primeiroNumero % 3 == 0 && primeiroNumero % 5 == 0) {
					System.out.println(primeiroNumero);
				}
			}
		} else {
			System.out.println("Intervalo inválido");
		}
		
	}
}