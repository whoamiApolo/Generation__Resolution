package aula_03;

import java.util.Scanner;

public class DoWhileSomaDosNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, aux = 0;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Digite o(s) números");
			i = leia.nextInt();

			if (i > 0) {
				aux += i;
			}
		} while (i != 0);
		System.out.println("A soma dos números positivos é: " + aux);

		leia.close();
	}
}
