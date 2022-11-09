package exercicios_estrutura_condicional;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int inicio = sc.nextInt();
		int fim = sc.nextInt();
		int duracao;

		if (inicio < fim) {
			duracao = fim - inicio;

		} else {
			duracao = (24 - inicio) + fim;

		}

		System.out.println("O jogo durou " + duracao + " horas(s)");

		sc.close();

	}
}