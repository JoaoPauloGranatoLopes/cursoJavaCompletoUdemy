package exercicios_estrutura_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double divisao;

		for (int i = 0; i < n; i++) {

			double x = sc.nextInt();
			double y = sc.nextInt();

			if (y == 0) {
				System.out.println("divisâo impossível");

			} else {
				divisao = x /y;

				System.out.println(divisao);

			}

		}
		sc.close();

	}
}