package exercicios;

import java.util.Scanner;

public class Exercicio19 {
/*
	Calculadora de Desconto: Crie um programa que calcule o preço final de um produto com desconto.
		
		Solicite ao usuário que insira o preço original e a porcentagem de desconto.
		 
		Calcule o preço final e imprima o resultado.
		
		*** valor do desconto = preço original x (porcentagem de desconto / 100%).
*/
	public static void main(String[] args) {

		//Inserir preço original
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o preço do produto: ");
		double precoOriginal = leia.nextDouble();
		
		//Inserir porcentagem desconto
		System.out.println("Insira a porcentagem de desconto: ");
		double porcentagemDesconto = leia.nextDouble();
		
		leia.close();

		//Calcular velor do desconto
        double valorDesconto = precoOriginal * (porcentagemDesconto / 100);
		
		//Calcular preço final
		double precoFinal = (precoOriginal - valorDesconto);
		
		//Imprimir resultado
		System.out.printf("O preço final com desconto é: R$ %.2f%n ", precoFinal);
		
	}

}
