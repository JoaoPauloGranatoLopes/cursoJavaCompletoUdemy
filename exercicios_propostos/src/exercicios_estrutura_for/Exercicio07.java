package exercicios_estrutura_for;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n <= 0) {
			System.out.println("número inválido !");

		} else {
			for (int i = 1; i <= n; i++) {

				System.out.println(i +" "+ i * i +" "+ i * i * i);

			}
		}

		sc.close();
	}

}
