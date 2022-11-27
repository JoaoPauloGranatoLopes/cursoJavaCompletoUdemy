package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números voce vai digitar ?: ");
		int n = sc.nextInt();

		int[] vector = new int[n];
		for (int i = 0; i < vector.length; i++) {
			System.out.print("Digite um número: ");
			vector[i] = sc.nextInt();
		}

		System.out.println("\nNUMEROS PARES: ");
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] % 2 == 0) {
				System.out.printf("%d ", vector[i]);

			}
		}

		int npares = 0;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] % 2 == 0) {
				npares = npares + 1;
			}

		}

		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", npares);

		sc.close();

	}

}
