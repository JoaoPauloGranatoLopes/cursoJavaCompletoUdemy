package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int number;
		int work_hours;
		float hour_rate;
		float salary;

		number = sc.nextInt(); // number
		sc.nextLine();
		work_hours = sc.nextInt(); // work hours
		hour_rate = sc.nextFloat(); // hour rate
		salary = work_hours * hour_rate;

		System.out.println("Number = " + number);
		System.out.printf("Salary = U$ %.2f%n", salary);

		sc.close();

	}

}
