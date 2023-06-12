package aula_02;

import java.util.Scanner;

public class OperacaoBancaria {

	public static void main(String[] args) {
		int opcao;
		float saldo = 1000f, saque, calc, deposito;

		Scanner leia = new Scanner(System.in);

		System.out.println("Informe o tipo de operação");
		opcao = leia.nextInt();

		switch (opcao) {
		case 1:
			System.out.printf("R$ %.2f", saldo);
			break;
		case 2:
			System.out.println("Informe o valor do saque");
			saque = leia.nextFloat();
			if (saldo > saque) {
				calc = saldo - saque;
				System.out.println(calc);
			} else {
				System.out.println("Saldo insuficiente!");
			}
			break;
		case 3:
			System.out.println("Informe o deposito: ");
			deposito = leia.nextInt();

			System.out.println(deposito + saldo);
			break;
		default:
			System.out.println("Operação inválida!");
		}
		leia.close();
	}
}
