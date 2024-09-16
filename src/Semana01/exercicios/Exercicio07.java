package exercicios;

import java.util.Scanner;

public class Exercicio07 {

	/*
	 * Exercício de Entrada de Dados: • Crie um programa que solicite ao usuário que
	 * insira seu nome e idade.
	 * 
	 * • Armazene as informações em variáveis adequadas.
	 * 
	 * • Imprima uma mensagem utilizando essas variáveis.
	 */

	public static void main(String[] args) {

		// Scanner para ler a entrada do teclado (System.in) no console
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = leia.nextLine();

		System.out.println("Digite sua idade: ");
		int idade = leia.nextInt();
		
		System.out.println("Olá " + nome + "! Sua idade é: " + idade + " anos.");

		leia.close();
	}

}
