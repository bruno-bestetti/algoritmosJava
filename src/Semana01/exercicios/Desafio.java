package exercicios;

import java.util.Scanner;

public class Desafio {
	/*
	Considere dois pontos no plano cartesiano, o Ponto 1 eo Ponto 2, e suas respectivas coordenadas.
	As	coordenadas do Ponto 1 são definidas pelas variáveis x1 e y1,
	 e as coordenadas do Ponto 2 são definidas pelas variáveis x2 e y2.
	 
	 Faça um programa que calcule a distância euclidiana (d) entre dois pontos 
	considerando os	valores digitados pelo usuário pelas variáveis x1, y1, x2 e y2.
		d = √(x1 − x2)² + (y1 + y2)²
	Exemplo:
	Ponto 1: (2,3)
	Ponto 2: (4,5)
	Distância: 2,82
*/
	public static void main(String[] args) {
		System.out.println("Calculadora de distância euclidiana (d)");
		System.out.println("---------");

		Scanner leia = new Scanner(System.in);
		
		//Solicitar pontos x1 e x2
		System.out.println("Informe os valores para o Eixo X");
		System.out.println("Insira o valor do ponto x1: ");
		int x1 = leia.nextInt();
		
		System.out.println("Insira o valor do ponto x2: ");
		int x2 = leia.nextInt();
		System.out.println("---------");

		//Solicitar pontos y1 e y2
		System.out.println("Informe os valores para o Eixo Y");
		System.out.println("Insira o valor do ponto y1: ");
		int y1 = leia.nextInt();
		
		System.out.println("Insira o valor do ponto y2: ");
		int y2 = leia.nextInt();
		leia.close();
		System.out.println("---------");

		// Formula: d = √(x1 − x2)² + (y1 + y2)²
		
		//Potencia x
		double parentesesX = (x1 - x2) * (x1 - x2);
		
		//Potencia y
		double parentesesY = (y1 + y2) * (y2 + y2);
		
		//Resultado dos parenteses
		double resultadoParenteses = parentesesX * parentesesY;

		//Calculo distancia
		double distancia = Math.sqrt(resultadoParenteses);
		
		//Saída
		System.out.println("Resultado: ");
		System.out.println("X: (" + x1 + "," + x2 +")");
		System.out.println("Y: (" + y1 + "," + y2 +")");
		System.out.printf("d = %.2f", distancia);

	}

}
