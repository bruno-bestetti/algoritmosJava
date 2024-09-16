package exercicios;

import java.util.Scanner;

public class Exercicio01 {

	// Fórmula peso ideal
	// Para homens: Peso ideal = (72,7 * altura) - 58
	// Para mulheres: Peso ideal = (62,1 * altura) - 44,7
	// Fazer um algoritmo que calcule o peso ideal inserindo: Altura e Sexo
	
	public static void main(String[] args) {

		System.out.println("Calculadora Peso Ideal");
		System.out.println("------");

		Scanner leia = new Scanner(System.in);
		
		// Usuário digita altura e gênero
		System.out.println("Qual é o seu gênero: Masculino ou Feminino? [M/F]");
		char genero = leia.nextLine().toUpperCase().charAt(0);
		
		System.out.println("Digite sua altura em metros: ");
		Double altura = leia.nextDouble();
		
		//Formula
		Double pesoIdealMasc =  (72.7 * altura) - 58;
		Double pesoIdealFem =  (62.1 * altura) - 44.7;

		// Estrutura condicional 
		if (genero == 'M') { //Para homens
			System.out.printf("Gênero Masculino. Seu peso ideal em quilos é: %.2fkg    %n", pesoIdealMasc);
			
		}else{ //Para mulheres
			System.out.printf("Gênero Feminino. Seu peso ideal em quilos é: %.2fkg    %n", pesoIdealFem);
		};
		
		leia.close();
	}
// M 1,70 = 65,59
// F 1,70 = 60,87
}
