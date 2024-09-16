package exemplos;

import java.util.Scanner;

public class Programa05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		double num1 = leia.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		double num2 = leia.nextDouble();
		
		// limpeza de buffer
		leia.nextLine();
		
		System.out.println("Digite qual operação"
				+ " voce quer fazer com esses dois numeros [+,-,*,/]");
		char operacao = leia.nextLine().charAt(0);
		
		if (operacao == '+') {
			double soma = num1 + num2;
			System.out.println("Soma: " + soma);
		} else if (operacao == '-') {
			double sub = num1 - num2;
			System.out.println("Diferença: " + sub);
		} else if (operacao == '*') {
			double produto = num1 * num2;
			System.out.println("Produto: " + produto);
		} else if (operacao == '/') {
			
			double divisao = num1 / num2;
			System.out.println("Divisão: " + divisao);
		} else {
			System.out.println("Opção inválida");
		}
		
		
		
		

	}

}
