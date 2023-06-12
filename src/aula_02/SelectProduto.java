package aula_02;

import java.util.Scanner;

public class SelectProduto {

	public static void main(String[] args) {
		int item, qntProduto, calculo;

		Scanner leia = new Scanner(System.in);

		System.out.println("Informe o item do produto:");
		item = leia.nextInt();

		System.out.println("Informe a quantidade de produtos:");
		qntProduto = leia.nextInt();

		switch (item) {
		case 1:
			calculo = 10 * qntProduto;
			System.out.println(calculo + ",00");
			break;
		case 2:
			calculo = 15 * qntProduto;
			System.out.println(calculo + ",00");
			break;
		case 3:
			calculo = 18 * qntProduto;
			System.out.println(calculo + ",00");
			break;
		case 4:
			calculo = 12 * qntProduto;
			System.out.println(calculo + ",00");
			break;
		case 5:
			calculo = 8 * qntProduto;
			System.out.println(calculo + ",00");
			break;
		case 6:
			calculo = 13 * qntProduto;
			System.out.println(calculo + ",00");
			break;
		default:
			System.out.println("Dados inválidos");
		}
	
		leia.close();
	}
}
