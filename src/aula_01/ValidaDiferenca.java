package aula_01;

import java.util.Scanner;

public class ValidaDiferenca {
	public static void main(String[] args) {
		float n1, n2, n3, n4, diferenca;

		Scanner leia = new Scanner(System.in);

		System.out.println("Informe o 1° número");
		n1 = leia.nextFloat();

		System.out.println("Informe o 2° número");
		n2 = leia.nextFloat();

		System.out.println("Informe o 3° número");
		n3 = leia.nextFloat();

		System.out.println("Informe o 4° número");
		n4 = leia.nextFloat();

		diferenca = (n1 * n2) - (n3 * n4);

		System.out.printf("%.1f", diferenca);
		// 5.0, 6.0, 7.0, 8.0 = - 26.0
		// 5.0, 6.0, -7.0, 8.0 = 86.0
		leia.close();
	}
}
