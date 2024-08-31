package exercicios;

import java.util.Scanner;

public class Exercicio23 {
/*
	 Contagem de Caracteres:
		 • Solicite ao usuário que insira uma palavra.
		 • Conte e imprima o número de caracteres na palavra.
*/
	
	public static void main(String[] args) {
		//Inserir nome 
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String palavra = leia.nextLine();
		leia.close();
		
		//Contagem de caracteres:
		int numeroCaracteres = palavra.length();
		
		// Imprimir o número de caracteres da palavra
		System.out.println("O número de caracteres na palavra é: " + numeroCaracteres);
	}

}
