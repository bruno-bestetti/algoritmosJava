package exercicios;

import java.util.Scanner;

public class Exercicio20 {
/*
	Tempo de Viagem:
		• Solicite ao usuário que insira a distância de uma viagem 
		em quilômetros e a velocidade média.
		
		• Calcule o tempo necessário para a viagem.
		 Use a fórmula: tempo = distância / velocidade.
		• Imprima o tempo de viagem.
*/
	public static void main(String[] args) {

		// Leia distancia e velocidade
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a distância em Km: ");
		double distancia = leia.nextDouble();
		
		System.out.println("Digite a velocidade média: ");
		double velocidade = leia.nextDouble();
		leia.close();
		
		//Formula tempo viagem
		double tempo = (distancia / velocidade);
		
		//Imprimir resultado
		System.out.println("Seu tempo de viagem será: " + tempo);
	}

}
