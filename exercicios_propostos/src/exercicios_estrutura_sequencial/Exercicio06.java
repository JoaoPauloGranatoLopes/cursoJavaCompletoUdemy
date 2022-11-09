package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c;
		double triangulo, circulo, trapezio, quadrado, retangulo;
		double pi = 3.14159;

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		triangulo = (a * c) / 2;
		circulo = pi * c * c;
		trapezio = ((a + b) / 2) * c;
		quadrado = b * b;
		retangulo = a * b;

		System.out.println("Dados de entrada digitados:");
		System.out.printf("%.1f %.1f %.1f%n", a, b, c);
		System.out.println();
		System.out.println("Saída:");
		System.out.printf("triangulo: %.3f%n", triangulo);
		System.out.printf("circulo: %.3f%n", circulo);
		System.out.printf("trapezio: %.3f%n", trapezio);
		System.out.printf("quadrado: %.3f%n", quadrado);
		System.out.printf("retangulo: %.3f%n", retangulo);

		sc.close();
	}

}
