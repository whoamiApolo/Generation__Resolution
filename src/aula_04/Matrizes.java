package aula_04;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		float matriz[][] = new float[10][4];
		Scanner leia = new Scanner(System.in);

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				System.out.print("Informe todas as notas dos bimestres desse ano: ");
				matriz[linha][coluna] = leia.nextFloat();
			}
		}
		// float[] linhaSoma = new float[matriz.length];
		for (int linha = 0; linha < matriz.length; linha++) {
			float sum = 0;
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				sum += matriz[linha][coluna];
				System.out.print(matriz[linha][coluna] + "\t");
			}
			// linhaSoma[linha] = sum;
			System.out.printf("Total: %.1f", sum / 4);
			System.out.print("\tLinha: " + linha + "\n");
		}

		leia.close();
	}
}