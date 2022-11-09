package exercicios_estrutura_for;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int fat = 1;

		for (int i = 1; i <= n; i++) {

			if (n == 0) {
				fat = 1;

			} else {
				fat = fat * i;

			}

			sc.close();
		}
		System.out.println(fat);

	}
}
