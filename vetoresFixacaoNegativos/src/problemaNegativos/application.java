package problemaNegativos;

import java.util.Scanner;

public class application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números voce vai digitar ?: ");
		int n = sc.nextInt();

		if (n <= 10) {

			int[] vect = new int[n];
			for (int i = 0; i < vect.length; i++) {
				System.out.print("Digite um número: ");
				vect[i] = sc.nextInt();

			}
			System.out.println("NÚMEROS NEGATIVOS:");
			for (int i = 0; i < vect.length; i++) {
				if (vect[i] < 0) {
					System.out.println(vect[i]);
				}
			}

		} else {
			System.out.println("O valor máximo de n é 10");
		}
		sc.close();
	}

}
