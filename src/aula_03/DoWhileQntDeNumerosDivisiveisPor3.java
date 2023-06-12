package aula_03;

import java.util.Scanner;

public class DoWhileQntDeNumerosDivisiveisPor3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num, sum = 0, aux = 0;
		
		do {
			System.out.println("Digite o(s) número(s)");
			num = leia.nextInt();

			if ( num % 3 == 0) {
				sum += num;
				aux++;
			}
		} while (num != 0);
		
		if (aux > 0) {		
			double testando = (double) sum / (aux - 1); /* add o -1, pois assim evitamos 
			que o número zero seja considerado na contagem de números divisiveis por 3.*/
			System.out.println("São números múltimos por 3 e a média é: " + testando);
		} else {
			System.out.println("não é multiplo de 3");
		}

		leia.close();
	}
}
