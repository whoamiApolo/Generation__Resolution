package aula_02;

import java.util.Scanner;

public class IsHumano {

	public static void main(String[] args) {
		String primeiraPalavra, segundaPalavra, terceiraPalavra;
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe a 1° palavra");
		primeiraPalavra = leia.next();

		if (primeiraPalavra.equals("vertebrado")) {
//			System.out.println(primeiraPalavra);

			System.out.println("Informe a 2° palavra");
			segundaPalavra = leia.next();

			if (segundaPalavra.equals("ave")) {
//					System.out.println(segundaPalavra);

				System.out.println("Informe a 3° palavra");
				terceiraPalavra = leia.next();

				if (terceiraPalavra.equals("carnivoro")) {
					System.out.println("Águia");
				} else if (terceiraPalavra.equals("onivoro")) {
					System.out.println("Pomba");
				} else {
					System.out.println("Dado inválido");
				}

			} else if (segundaPalavra.equals("mamifero")) {
//					System.out.println("Mamífero");

				System.out.println("Informe a 3° palavra");
				terceiraPalavra = leia.next();

				if (terceiraPalavra.equals("onivoro")) {
					System.out.println("Homem");
				} else if (terceiraPalavra.equals("herbivoro")) {
					System.out.println("Vaca");
				} else {
					System.out.println("Dado inválido");
				}

			} else {
				System.out.println("Dado inválido");
			}

		} else if (primeiraPalavra.equals("invertebrado")) {
//			System.out.println(primeiraPalavra);

			System.out.println("Informe a 2° palavra");
			segundaPalavra = leia.next();

			if (segundaPalavra.equals("inseto")) {
//				System.out.println(segundaPalavra);

				System.out.println("Informe a 3° palavra");
				terceiraPalavra = leia.next();

				if (terceiraPalavra.equals("hematofago")) {
					System.out.println("Pulga");
				} else if (terceiraPalavra.equals("herbivoro")) {
					System.out.println("Lagarta");
				} else {
					System.out.println("Dado inválido");
				}

			} else if (segundaPalavra.equals("anelideo")) {
//				System.out.println(segundaPalavra);

				System.out.println("Informe a 3° palavra");
				terceiraPalavra = leia.next();

				if (terceiraPalavra.equals("hematofago")) {
					System.out.println("Sanguessuga");
				} else if (terceiraPalavra.equals("onivoro")) {
					System.out.println("Minhoca");
				} else {
					System.out.println("Dado inválido");
				}

			} else {
				System.out.println("Dado inválido");
			}

		} else {
			System.out.println("Dado inválido");
		}

		leia.close();
//		if ( (primeiraPalavra.equalsIgnoreCase("vertebrado")) && (segundaPalavra.equalsIgnoreCase("Mamifero")) && (terceiraPalavra.equalsIgnoreCase("Onivoro")) ) {
//			System.out.println("Homem");
//		} else if ( primeiraPalavra.equalsIgnoreCase("invertebrado") && (segundaPalavra.equalsIgnoreCase("inseto")) && (terceiraPalavra.equalsIgnoreCase("herbivoro")) ) {
//			System.out.println("Lagarta");
//		} 
	}
}
