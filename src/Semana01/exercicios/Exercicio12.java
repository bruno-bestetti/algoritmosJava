package exercicios;

import java.util.Scanner;

public class Exercicio12 {

	/*
	 * 12. Calculadora Simples: • Crie um programa que permita ao usuário inserir
	 * dois números. • Realize as operações de soma, subtração, multiplicação e
	 * divisão. • Imprima os resultados.
	 */

	public static void main(String[] args) {

		// Inserir dois números
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		double num1 = leia.nextDouble();

		System.out.println("Digite o segundo número: ");
		double num2 = leia.nextDouble();

		// Operações matemáticas
		double soma = num1 + num2;
		double subtracao = num1 - num2;
		double multiplicacao = num1 * num2;
		double divisao = num1 / num2;

		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + subtracao);
		System.out.println("Multiplicação: " + multiplicacao);
		System.out.println("Divisão: " + divisao);

		leia.close();

	}

}
