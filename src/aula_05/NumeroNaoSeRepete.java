package aula_05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class NumeroNaoSeRepete {
	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Informe um número: ");
			Integer n = leia.nextInt();
			numbers.add(n);
		}

		// uma forma mais elegante de exibir os resultados
		Iterator<Integer> iNumbers = numbers.iterator();


		while (iNumbers.hasNext()) {
			System.out.print(iNumbers.next() + ", ");
		}

		/*	alternativa ao Iterator
		 for (int test : numbers) {
			System.out.println(test);
		}
		*/

		leia.close();
	}
}
