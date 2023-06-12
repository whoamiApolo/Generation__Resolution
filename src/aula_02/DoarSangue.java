package aula_02;

import java.util.Scanner;

public class DoarSangue {

	public static void main(String[] args) {
		int idadeDoador;
		String nomeDoDoador;
		boolean primeiraDoacao = true;

		Scanner leia = new Scanner(System.in);

		System.out.println("Informe um nome");
		nomeDoDoador = leia.next();

		System.out.println("Informe uma idade válida");
		idadeDoador = leia.nextInt();

		System.out.println("Primeira doação?");
		primeiraDoacao = leia.nextBoolean();

		if (idadeDoador > 17 && idadeDoador < 59) {
			System.out.println(nomeDoDoador + " está apto(a) para doar sangue!");
		} else if ((idadeDoador > 59 && idadeDoador < 70) && primeiraDoacao == false) {
			System.out.println(nomeDoDoador + " está apto(a) para doar sangue!");
		} else {
			System.out.println(nomeDoDoador + " não está apto(a) para doar sangue!");
		}

		leia.close();
	}
}
