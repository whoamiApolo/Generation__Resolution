package aula_01;
import java.util.Scanner;

public class Media {
	public static void main(String []args) {
		
	float n1, n2, n3, n4, media;

	Scanner leia = new Scanner(System.in);
	System.out.println("Informe o 1° número");
	n1 = leia.nextFloat();
	System.out.println("Informe o 2° número");
	n2 = leia.nextFloat();
	System.out.println("Informe o 3° número");
	n3 = leia.nextFloat();
	System.out.println("Informe o 4° número");
	n4 = leia.nextFloat();
	
	media = (n1 + n2 + n3 + n4) / 4;

	System.out.printf("%.1f", media);
	// 	10.0, 8.0, 7.0, 7.5 = 8.1
	
	leia.close();
	}
}
