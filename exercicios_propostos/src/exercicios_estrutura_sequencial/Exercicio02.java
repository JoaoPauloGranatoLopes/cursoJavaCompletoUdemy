package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		double raio;
		double pi = 3.14159;
		double area;
		
		System.out.println("Digite o valo do raio: ");

		raio = sc.nextDouble();
		area = pi * Math.pow(raio, 2.0);
		
		System.out.printf("A = %.4f%n", area);
		
		sc.close();

	}

}
