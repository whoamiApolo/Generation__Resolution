package aula_01;

import java.util.Scanner;

public class CalcSalarioBruto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salarioBruto, addNoturno, hrExtras, descontos, salarioLiquido;

		Scanner leia = new Scanner(System.in);

		System.out.println("Informe um salário bruto: ");
		salarioBruto = leia.nextFloat();

		System.out.println("Informe o adicional noturno: ");
		addNoturno = leia.nextFloat();

		System.out.println("Informe as horas extras: ");
		hrExtras = leia.nextFloat();

		System.out.println("Informe os descontos: ");
		descontos = leia.nextFloat();

		salarioLiquido = salarioBruto + addNoturno + (hrExtras * 5) - descontos;

		System.out.println(salarioLiquido);
		// 2000,00, 500,00, 100,00, 200,00 = 2800,00
		
		leia.close();
	}

}
