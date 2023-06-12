package aula_03;

import java.util.Scanner;

public class WhileQntDePessoasComIdadeX {
	public static void main(String[] args) {

		int idade = 0, maiorQue = 0, menorQue = 0;

		Scanner leia = new Scanner(System.in);

		while (idade >= 0) {
			System.out.println("Informe uma idade válida: ");
			idade = leia.nextInt();

			if (idade < 21 && idade >= 0) {
				menorQue++;
			} else if (idade > 50 && idade <= 100) {
				maiorQue++;
			} else {
				System.out.println("Idade inválida");
			}
		}

		System.out.println("Total de pessoas menores de 21 anos: " + menorQue
				+ "\nTotal de pessoas maiores de 50 anos: " + maiorQue);

		leia.close();
	}
}
