package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int codigo1, codigo2, qtd1, qtd2;

		double valor1, valor2, total;

		codigo1 = sc.nextInt();
		qtd1 = sc.nextInt();
		valor1 = sc.nextDouble();

		codigo2 = sc.nextInt();
		qtd2 = sc.nextInt();
		valor2 = sc.nextDouble();

		total = (qtd1 * valor1) + (qtd2 * valor2);

		System.out.printf("%d  %d  %.2f%n", codigo1, qtd1, valor1);
		System.out.printf("%d  %d  %.2f%n", codigo2, qtd2, valor2);
		System.out.printf("Valor a pagar: R$%.2f%n", total);

		sc.close();

	}

}
