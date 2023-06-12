package aula_02;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1, n2, calculo;
		int opcao;

		Scanner leia = new Scanner(System.in);

		System.out.println("Informe o 1° número: ");
		n1 = leia.nextFloat();

		System.out.println("Informe o 2° número: ");
		n2 = leia.nextFloat();

		System.out.println("Informe a operação");
		opcao = leia.nextInt();

		switch (opcao) {
		case 1:
			calculo = n1 + n2;
			System.out.println(calculo);
			break;
		case 2:
			calculo = n1 - n2;
			System.out.println(calculo);
			break;
		case 3:
			calculo = n1 * n2;
			System.out.println(calculo);
			break;
		case 4:
			calculo = n1 / n2;
			System.out.println(calculo);
			break;
		default:
			System.out.println("Opção inválida!");
		}
		leia.close();
	}
}
