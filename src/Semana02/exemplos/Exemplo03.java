package exemplos;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual seu genero? [M/F]");
		char genero = leia.nextLine().toUpperCase().charAt(0);
		// Leia o que foi digitado no teclado, coloque em maiusculo e
		// pegue apenas a primeira letra (0)
		
		System.out.println("Digite sua altura em metros");
		double altura = leia.nextDouble();	
		
		// processamento
		if (genero == 'M') {
			double pesoIdeal = (72.7 * altura) - 58;
			System.out.println("Genero: Masculino");
			System.out.println("Peso ideal: " + pesoIdeal);
		} else if (genero == 'F') {
			double pesoIdeal = (62.1 * altura) - 44.7;
			System.out.println("Genero: Feminino");
			System.out.println("Peso ideal: " + pesoIdeal);
		} else {
			System.out.println("Opção inválida");
		}
		
		
		
		
		
		leia.close();
		

	}

}
