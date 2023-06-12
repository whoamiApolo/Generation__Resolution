package aula_05;

import java.util.HashSet;
import java.util.Set;

public class ContemNumeroSete {
	public static void main(String[] args) {
		Set<Integer> number = new HashSet<Integer>();
		
		number.add(2);
		number.add(5);
		number.add(1);
		number.add(3);
		number.add(4);
		number.add(9);
		number.add(7);
		number.add(8);
		number.add(10);
		number.add(6);
		
		for (Integer i : number) {
			if (i.equals(7)) {				
			System.out.println("O número " + i.hashCode() + " foi encontrado!");
			} else if (i.equals(40)) {
				System.out.println("O número " + i.hashCode() + " não foi encontrado!");
			}
		}
		
	}
}
