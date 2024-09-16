package exercicios;

import java.util.Scanner;

public class Exercicio22 {
	
/*
	Calculadora de Juros Simples:
		• Solicite ao usuário que insira:
		o capital, a taxa de juros e o tempo de aplicação.
		
		• Calcule o montante usando a fórmula de juros simples: 
		  montante = capital * (taxa * tempo).
		• Imprima o montante.
*/
	public static void main(String[] args) {

		//Inserir capital, taxa de juros e o tempo de aplicação
        Scanner leia = new Scanner(System.in);
		System.out.println("Insira o capital investido: ");
		double capital = leia.nextDouble();
		
		System.out.println("Digite a taxa de juros: ");
		double taxa = leia.nextDouble();
		
		System.out.println("Digite o tempo de aplicação em meses: ");
		double tempo = leia.nextDouble();
		leia.close();
		
		//Calculo montante
		taxa = taxa / 100;
		double montante = capital * (taxa * tempo);
		
		//Imprimir montante
		System.out.println("O montante da aplicação será " + montante + " após " + tempo + " meses de investimento." );
		
	}

}
