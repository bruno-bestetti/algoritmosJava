package exercicios;

import java.util.Scanner;

public class Exercicio11 {

	/*
	 * Crie um programa que simule o login em um site. • Solicite ao usuário que
	 * insira sua idade.
	 * 
	 * • Utilize operadores lógicos para permitir o login apenas se o usuário tiver
	 * 18 anos ou mais.
	 * 
	 * • Imprima se o login foi bem-sucedido ou não (True ou False).
	 */

	public static void main(String[] args) {

		// Usuário insere a idade
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		int idade = leia.nextInt();
		
		// Login maior que idade
		boolean login = (idade >= 18);
		
		// Pode logar
		System.out.println("O usuário pode logar: " + login);
		
		leia.close();
	}

}
