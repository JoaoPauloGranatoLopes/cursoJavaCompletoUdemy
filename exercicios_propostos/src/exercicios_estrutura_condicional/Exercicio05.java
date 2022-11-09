package exercicios_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		int qtd = sc.nextInt();
		double preco = 0, total;
		
		if(cod == 1) {
			preco = 4.00; 
		}else if(cod == 2) {
			preco = 4.50;
		}else if(cod == 3) {
			preco = 5.00;
		}else if(cod == 4) {
			preco = 2.00;
		}else if(cod == 5) {
			preco = 1.50;
		}
		
		total = qtd * preco;
		
		System.out.printf("Total: R$%.2f%n",  total);

		sc.close();

	}

}
