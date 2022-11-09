package exercicio_concatenar;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String product1 = "Computer";
		String product2 = "Office desk";

		byte age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products:");
		System.out.printf("%s, which price is $%.2f\n", product1, price1);
		System.out.printf("%s, which price is $%.2f\n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		System.out.println();
		System.out.printf("Measure with decimal places: %.8f\n", measure);
		System.out.printf("Rounded (three decimal places): %.3f\n", measure);

		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f\n", measure);
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String x;
		double a;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		a = sc.nextDouble();
		System.out.printf("Você digitou: %.2f\n", a);
		sc.close();

	}

}
