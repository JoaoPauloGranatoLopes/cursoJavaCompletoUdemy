package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas?: ");

		int n = sc.nextInt();
		Pessoa[] vect = new Pessoa[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i + 1) + "a. pessoa: ");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();

			vect[i] = new Pessoa(nome, idade, altura);
		}
		double somaAlturas = 0.0;
		for (int i = 0; i < vect.length; i++) {
			somaAlturas += vect[i].getAltura();
		}
		double avg = somaAlturas / n;
		System.out.println();
		System.out.printf("Altura média: %.2f%n", avg);

		int menor = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				menor = menor + 1;				
			}
		}
		double taxa = ((double)menor / n) * 100;
		System.out.println();
		System.out.printf("Pessoas com menos de 16 anos: %.1f", taxa);
		System.out.println("%");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());				
			}
		
		}
		sc.close();
	}
}
