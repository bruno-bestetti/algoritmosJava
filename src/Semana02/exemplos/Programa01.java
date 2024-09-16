package exemplos;

import java.util.Scanner;

public class Programa01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = leia.nextInt();
		
		//Estrutura condicional simples
		if (numero > 10) {
			// Condicional verdadeira
			System.out.println("Número alto");
		}
		
		//Estrutura condicional composta
		if (numero>=10) {
			System.out.println("Número alto");

		} else {
			System.out.println("Número baixo");

		}
		System.out.println("Programa encerrado");
		leia.close();
	}
}
