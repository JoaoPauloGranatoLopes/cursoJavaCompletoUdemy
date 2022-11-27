package appication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números voce vai digitar ?: ");
		int n = sc.nextInt();

		double[] vector = new double[n];
		for (int i = 0; i < vector.length; i++) {
			System.out.print("Digite um número: ");
			vector[i] = sc.nextDouble();
		}
		System.out.print("VALORES = ");
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("%.1f ", vector[i]);			
		} 
		
		double soma = 0.0;
		for(int i=0; i<vector.length; i++) {
			soma += vector[i];
		}
		System.out.printf("\nSOMA = %.2f%n", soma);
		double media = soma / n;
		System.out.printf("MEDIA = %.2f%n", media);
		sc.close();
	}

}
