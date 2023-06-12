package aula_02;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		String nomeColaborador;
		int codigoColaborador;
		float salario, novoSalario;

		Scanner leia = new Scanner(System.in);

		System.out.println("Informe o nome do colaborador");
		nomeColaborador = leia.next();

		System.out.println("Informe o código do cargo do colaborador");
		codigoColaborador = leia.nextInt();

		System.out.println("Informe o salário");
		salario = leia.nextFloat();

		switch (codigoColaborador) {
		case 1:
			novoSalario = (salario * 10) / 100;
			System.out.println("Nome: " + nomeColaborador + "\nID: Gerente");
			System.out.printf("%.2f", novoSalario + salario);
			break;
		case 2:
			novoSalario = (salario * 7) / 100;
			System.out.println("Nome: " + nomeColaborador + "\nID: Vendedor");
			System.out.printf("%.2f", novoSalario + salario);
			break;
		case 3:
			novoSalario = (salario * 9) / 100;
			System.out.println("Nome: " + nomeColaborador + "\nID: Supervisor");
			System.out.printf("%.2f", novoSalario + salario);
			break;
		case 4:
			novoSalario = (salario * 6) / 100;
			System.out.println("Nome: " + nomeColaborador + "\nID: Motorista");
			System.out.printf("%.2f", novoSalario + salario);
			break;
		case 5:
			novoSalario = (salario * 5) / 100;
			System.out.println("Nome: " + nomeColaborador + "\nID: Estoquista");
			System.out.printf("%.2f", novoSalario + salario);
			break;
		case 6:
			novoSalario = (salario * 8) / 100;
			System.out.println("Nome: " + nomeColaborador + "\nID: Técnico de TI");
			System.out.printf("%.2f", novoSalario + salario);
			break;
		default:
			System.out.println("Dado inválido");
		}
		leia.close();
	}
}
