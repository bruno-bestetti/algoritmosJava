package exercicios;

import java.util.Scanner;

public class Exercicio16 {
	/*
	Fazer um programa para ler um número inteiro, 
	e depois dizer se este número é negativo ou não 
	(True ou False)
	*/

	public static void main(String[] args) {

		 Scanner leia = new Scanner(System.in);
			
			// Leia número inteiro
			System.out.println("Digite um número: ");
			int num = leia.nextInt();
		
			leia.close();
			
			// Se positivo = true
			// Se negativo = false
			boolean positivo = (num >= 0);
			
			//Saida
			System.out.println("O número é positivo: " + positivo);
	}

}
