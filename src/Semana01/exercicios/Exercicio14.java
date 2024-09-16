package exercicios;

import java.util.Scanner;

public class Exercicio14 {
	
/*
	Fazer um programa para ler: 
	o código de uma peça 1
	o número de peças 1 
	o valor unitário de cada peça 1
	
	o código de uma peça 2
	o número de peças 2 
	e o valor unitário de cada peça 2 
	
	Calcule e mostre o valor a ser pago.
*/
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		// Peças 1
		System.out.println("Digite o código da peça 1: ");
		int codPeça1 = leia.nextInt();
		
		System.out.println("Digite o número de peças 1: ");
		int numPeça1 = leia.nextInt();
		
		System.out.println("Digite o valor unitário de peças 1: ");
		int valorPeça1 = leia.nextInt();
		
		// Peças 2
		System.out.println("Digite o código da peça 2: ");
		int codPeça2 = leia.nextInt();
		
		System.out.println("Digite o número de peças 2: ");
		int numPeça2 = leia.nextInt();
		
		System.out.println("Digite o valor unitário de peças 2: ");
		int valorPeça2 = leia.nextInt();
		
		leia.close();
		
		//Valor Peças 1
		int valorPago1 = numPeça1 * valorPeça1;
		
		//Valor Peças 2
		int valorPago2 = numPeça2 * valorPeça2;
		
		//Valor total
		int valorTotal = valorPago1 + valorPago2;
		
		System.out.println("Valor Peças 1: R$ " + valorPago1);
		System.out.println("Valor Peças 2: R$ " + valorPago2);
		System.out.println("Valor Total das Peças: R$ " + valorTotal);
	}

}
