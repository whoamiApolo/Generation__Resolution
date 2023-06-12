package aula_01;

import java.util.Scanner;

public class AbonoSalarial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float salario;
		float abono;
		float resultado;

		Scanner novoSalario = new Scanner(System.in);

		System.out.println("Informe o salário: ");
		salario = novoSalario.nextFloat();

		System.out.println("Informe o abano");
		abono = novoSalario.nextFloat();

		resultado = salario + abono;
		System.out.printf("%.2f", resultado);
		// 10000,00, 1000,00 = 11000,00
		novoSalario.close();
	}
}
