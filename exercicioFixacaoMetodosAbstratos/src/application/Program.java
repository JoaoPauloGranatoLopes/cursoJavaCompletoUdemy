package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.TaxPayer;
import entities.Individual;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<TaxPayer>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Annual income: ");
			Double annualIncome = sc.nextDouble();

			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();

				Individual individual = new Individual(name, annualIncome, healthExpenditures);
				list.add(individual);

			} else {
				System.out.print("Number of employees: ");
				Integer numberEmployees = sc.nextInt();

				Company company = new Company(name, annualIncome, numberEmployees);
				list.add(company);

			}
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer taxPayer : list) {

			System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.tax()));
		}

		System.out.println();
		double sum = 0.0;
		for (TaxPayer taxPayer : list) {
			sum += taxPayer.tax();

		}
		System.out.print("TOTAL TAXES: $  " + String.format("%.2f", sum));
		sc.close();
	}

}
