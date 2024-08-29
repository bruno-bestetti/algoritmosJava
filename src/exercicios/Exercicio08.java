package exercicios;

import java.util.Scanner;

public class Exercicio08 {
	
	/*
	 Exercício com Operadores Lógicos: 
	 
	 • Crie um programa que verifique se um número é positivo e ímpar. 
	 
	 • Solicite ao usuário que insira um número e forneça o resultado.
	 */

	public static void main(String[] args) {
		
		//Numero positivo e ímpar
		
		int num = 0;
		int impar = (num % 2 == 1);
		


		//Inserir o numero e resultado
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num = leia.nextInt();
		
		leia.close();
		
	}

}
