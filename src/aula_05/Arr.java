package aula_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arr {
	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite uma cor: ");
			String cor = leia.nextLine();
			cores.add(cor);

		}

		Collections.sort(cores);
		System.out.println("Ordem crescente: " + cores);
		
		System.out.println("Tamanho: " + cores.size());
		System.out.println("Index: " + cores.indexOf("azul"));
		System.out.println("Remover: " + cores.remove("azul"));
		System.out.println("Contém: " + cores.contains("amarelo"));
		
		Collections.sort(cores, Collections.reverseOrder());
		System.out.println("Ordem decrescente " + cores);
		
		leia.close();
	}
}
