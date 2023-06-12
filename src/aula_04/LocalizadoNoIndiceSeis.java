package aula_04;

import java.util.Arrays;

public class LocalizadoNoIndiceSeis {

	public static void main(String[] args) {
		int arr[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println("\n");

		int n = Arrays.binarySearch(arr, 7);

		if (n >= 0) {
			System.out.println(n);
		} else {
			System.out.println("O número não foi encontrado!");
		}

	}
}
