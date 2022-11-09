package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int idade = 72;
		String nome = "João Paulo Granato Lopes";
		double altura = 1.64;
		char sexo = 'M';
		double x = 10.35784;
		double renda = 40000.0;
		System.out.println("Olá mundo !");
		System.out.println("A idade é: " + idade + "anos");
		System.out.println("O nome é: "+nome);
		System.out.println("O sexo é: "+sexo);
		System.out.printf("%.3f%n", altura);	//%n - quebra de linha   %.2f - duas casas decimais na saída
		System.out.printf("%.2f%n", altura);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", altura);
		System.out.printf("Resultado = %.4f metros\n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais.\n", nome, idade, renda);
	}

}
