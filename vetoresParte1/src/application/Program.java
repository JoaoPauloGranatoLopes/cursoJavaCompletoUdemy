package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of samples n: ");
		int n = sc.nextInt();
		double[] vect = new double[n];

		System.out.println("Enter the value of each height:");
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		double sum = 0.0;
		for(int i = 0; i < n; i++) {
			sum += vect[i];
		}
		
		double average = sum / n;
		System.out.printf("Average height: %.2f%n", average);
		
		sc.close();
		

	}

}
