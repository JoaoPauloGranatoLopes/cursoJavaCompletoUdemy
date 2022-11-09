package exercicios_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		double imposto;

		if (salario >= 0.00 && salario <= 2000.00) {
			System.out.println("Isento");
		} else if (salario >= 2000.01 && salario <= 3000.00) {
			imposto = (salario - 2000.01) * 0.08;
			System.out.printf("R$%.2f%n", imposto);
		} else if (salario >= 3000.01 && salario <= 4500.00) {
			imposto = (3000.00 - 2000.01) * 0.08 + (salario - 3000.01) * 0.18;
			System.out.printf("R%.2f%n", imposto);
		} else if (salario > 4500.00) {
			imposto = (3000.00 - 2000.01) * 0.08 + (4500.00 - 3000.01) * 0.18 + (salario - 4500.00) * 0.28;
			System.out.printf("R$%.2f%n", imposto);

			sc.close();
		}
	}
}
