package exercicios;

import java.util.Scanner;

public class Exercicio13 {

	/*
	 * Fazer um programa que leia o número de um funcionário, seu número de horas
	 * trabalhadas, o valor que recebe por hora e calcula o salário desse
	 * funcionário.
	 * 
	 * A seguir, mostre o número e o salário do funcionário, com duas casas
	 * decimais.
	 */
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o número de horas trabalhadas: ");
		double horasTrabalhadas = leia.nextDouble();
		
		double valorHora = 10.0;
		
		double salario = horasTrabalhadas * valorHora;
		
		System.out.printf("Salário: R$ %.2f", salario);
		
		leia.close();

	}

}
