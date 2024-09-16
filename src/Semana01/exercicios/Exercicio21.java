package exercicios;

import java.util.Scanner;

public class Exercicio21 {
	
/*
	Cálculo do IMC (Índice de Massa Corporal):
		• Peça ao usuário que insira seu peso (em kg) e altura (em metros).
		• Calcule o IMC utilizando a fórmula: IMC = peso / (altura * altura).
		• Imprima o IMC.
*/
	public static void main(String[] args) {

		//Scanner ler peso e altura
        Scanner leia = new Scanner(System.in);
		System.out.println("Digite seu peso em kg: ");
		double peso = leia.nextDouble();
		
		System.out.println("Digite sua altura em metros: ");
		double altura = leia.nextDouble();
		leia.close();
		
		//Calculo IMC
		double IMC = peso / (altura * altura);
		
		//Imprime IMC
		System.out.printf("O seu IMC é: %.2f", IMC);

	}

}
