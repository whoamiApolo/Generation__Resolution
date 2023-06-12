package aula_03;

import java.util.Scanner;

public class WhileQntDePessoasDevs {
	public static void main(String[] args) {

		int idade = 0, sexo, stack, pessoaDevBackend = 0, mulherDevFront = 0, homemDevMobile = 0, mulherFullStack = 0;
		boolean pesquisa = true;

		Scanner leia = new Scanner(System.in);

		while (pesquisa == true) {
			System.out.println("Qual a sua idade?");
			idade = leia.nextInt();

			System.out.println("Qual seu genero?");
			sexo = leia.nextInt();

			if (sexo == 1) {
				System.out.println("Masculino");
			} else if (sexo == 2) {
				System.out.println("Feminino");
			} else if (sexo == 3) {
				System.out.println("Outros");
			} else {
				System.out.println("Dado inválido");
			}

			System.out.println("Informe a Stack");
			stack = leia.nextInt();

			if (stack == 1) {
				pessoaDevBackend++;
			} else if (stack == 2) {
				pessoaDevBackend++;
				mulherDevFront++;
			} else if (stack == 3) {
				pessoaDevBackend++;
				homemDevMobile++;
			} else if (stack == 4) {
				pessoaDevBackend++;
				mulherFullStack++;
			} else {
				System.out.println("Dados inválidos");
			}

			System.out.println("Continuar?");
			pesquisa = leia.nextBoolean();

			if (pesquisa == false) {
				if (sexo == 1 && sexo == 2) {
					System.out.println("O número de pessoas desenvolvedoras Backend " + pessoaDevBackend + "\n");
				} else if (sexo == 2 && stack == 2) {
					System.out.println("O número de mulheres desenvolvedoras Frontend " + mulherDevFront + "\n");
				} else if (sexo == 1 && stack == 3 && idade > 40) {
					System.out.println(
							"O número de homens desenvolvedores Mobile maiores de 40 anos " + homemDevMobile + "\n");
				} else if (sexo == 2 && stack == 4 && idade < 30) {
					System.out.println("O número de mulheres desenvolvedoras FullStack menores de 30 anos "
							+ mulherFullStack + "\n");
				} else {
					System.out.println("Programa finalizado!");
				}
			}

		}
		leia.close();
	}
}
