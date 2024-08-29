package exercicios;

import java.util.Scanner;

public class Exercicio09 {

	/*
	 * Comparação de Idades:
	 * 
	 * • Peça ao usuário para inserir duas idades.
	 * 
	 * • Use operadores lógicos para verificar se a primeira pessoa é mais velha que
	 * a segunda e se a segunda pessoa é maior de idade.
	 * 
	 * • Imprima o resultado.
	 */

	public static void main(String[] args) {

		// Inserir duas idades
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite uma idade: ");
		int idade1 = leia.nextInt();

		System.out.println("Digite outra idade: ");
		int idade2 = leia.nextInt();

		// Verificar primeira idade maior que segunda idade
		Boolean idadeMaior = (idade1 > idade2);
		
		// Verificar se a segunda pessoa é maior de idade
		Boolean segundoMaiorIdade = (idade2 >= 18);
		
		// Imprimir
		System.out.println("Primeira idade: " + idade1);
		System.out.println("Segunda idade: " + idade2);
		System.out.println("Primeira idade é maior que a segunda: " + idadeMaior);
		System.out.println("Segunda idade é maior de idade: " + segundoMaiorIdade);

		leia.close();

	}

}
