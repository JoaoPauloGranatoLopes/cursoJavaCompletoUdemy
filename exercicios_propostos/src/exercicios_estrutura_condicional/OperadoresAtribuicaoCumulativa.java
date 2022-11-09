package exercicios_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresAtribuicaoCumulativa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double conta = 50.00;
		int consumo = sc.nextInt();
		

		if (consumo <= 100) {
			conta = 50.00;

		} else {
			conta += (consumo - 100) * 2.0;
		}

		System.out.printf("Valor a pagar: R$%.2f%n", conta);

		sc.close();
	}

}
