package exercicios_estrutura_condicional;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();

		if (a > b && a % b == 0) {
			System.out.println("São multiplos");

		} else if (b > a && b % a == 0) {
			System.out.println("São multiplos");

		} else {
			System.out.println("Não são multiplos");

		}
		sc.close();
	}
}
