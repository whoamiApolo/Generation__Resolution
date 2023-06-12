package aula_01;

import java.util.Scanner;

public class DistanciaPercorrida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		float distancia;
		String result; 
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe um nome");
		nome = leia.next();

		System.out.println("Informe uma distância");
		distancia = leia.nextFloat();
		
		System.out.print("Parabéns, " + nome + ", a sua distância percorrida foi de ");
		
		result = "%.2f"; 
		System.out.printf(result, distancia);
		
		leia.close();
	}
}
