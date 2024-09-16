package exercicios;

import java.util.Scanner;

public class Exercicio01 {

	// Faça um algoritmo para mostrar o resultado da divisão de dois números.
	// Utilize o Scanner para armazenar os dois números

	public static void main(String[] args) {

		// Scanner para ler a entrada do teclado (System.in) no console
		Scanner leia = new Scanner(System.in);
		
		//Inserir números
		System.out.println("Digite o primeiro número: ");
		double num1 = leia.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double num2 = leia.nextDouble();
		
		double divisao = (num1 / num2);
		System.out.println("O resultado da divisão é: " + divisao);
		
		leia.close();
	}

}
