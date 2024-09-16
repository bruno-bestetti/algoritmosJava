package exemplos;

import java.util.Scanner;

public class Programa02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero = leia.nextInt();

		// quero analisar se o número está entre 10 e 20
		boolean resultado = numero >= 10 && numero < 20;
		System.out.println(resultado);
		
		// usando if e else
		if (numero >= 10 && numero < 20) {
			System.out.println("O número está dentro da faixa requerida.");
		} else {
			System.out.println("O número está fora da faixa.");
		}
			
		// Análise de média de um aluno
		System.out.println("Digite a primeira nota:");
		double nota1 = leia.nextDouble();
	
		System.out.println("Digite a segunda nota:");
		double nota2 = leia.nextDouble();
		
		//Calculando a média do aluno
		double media = (nota1 + nota2)/2.0;
		
		//Estrutura condicional
		if ( media >= 5 ) {
			System.out.println("Aluno aprovado com média: " + media);
		} else {
			System.out.println("Aluno reprovado com média: " + media);

		}
		
		leia.close();
	}
}
