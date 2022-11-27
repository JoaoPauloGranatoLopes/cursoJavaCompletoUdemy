package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		Employee employee = new Employee();
		
		employee.name = sc.nextLine();
		employee.grossSalary = sc.nextDouble();
		employee.tax = sc.nextDouble();
		
		System.out.println("Name: " + employee.name);
		System.out.printf("Gross salary: %.2f%n", employee.grossSalary);
		System.out.printf("Tax: %.2f%n", employee.tax);
		
		System.out.println();
	
		System.out.println("Employee: "  + employee);
		System.out.println();
		System.out.println("Which percentage to increase salary ? ");
		employee.percentage = sc.nextDouble();
		
		System.out.println();
		employee.increaseSalary();
		System.out.println("Updated data: "  + employee);
		sc.close();

	}

}