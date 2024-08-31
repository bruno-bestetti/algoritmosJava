package exercicios;

import java.util.Scanner;

public class Exercicio15 {
/*
	 Fazer um programa que leia três valores (double): A, B e C. 
	 Em seguida, calcule e mostre:
		 a) a área do triângulo retângulo que tem A por base e C por altura.
		 – Formula: (A * C)/2
		 
		 b) a área do círculo de raio C.
		 – Formula: π ∗ C²
		 
		 c) a área do trapézio que tem A e B por bases e C por altura.
		 – Formula: ((A + B) * C)/2
		 
		 d) a área do quadrado que tem lado B.
		 – B * B;
		 
		 e) a área do retângulo que tem lados A e B.
		 – A * B;
*/
	public static void main(String[] args) {
		
		//Scanner ler valores  A, B, C
        Scanner leia = new Scanner(System.in);
		System.out.println("Digite o valor A: ");
		double A = leia.nextDouble();
		
		System.out.println("Digite o valor A: ");
		double B = leia.nextDouble();
		
		System.out.println("Digite o valor A: ");
		double C = leia.nextDouble();
		
		leia.close();
		
		// a) Área triangulo retângulo
		double trianguloRetangulo = (A * C) / 2;
		
		// b) Área circulo
		double circulo = 3.14 * (C * C);
		//circulo = Math.PI * Math.pow(C, 2);
		
		// c) Área trapézio
		double trapezio = ((A + B) * C) / 2;
		
		// d) Área quadrado
		double quadrado = B * B;
		
		// e) Área retângulo
		double retangulo = A * B;
		
		// Saídas:
		System.out.println("a) Área do triângulo retângulo: " + trianguloRetangulo);
		System.out.println("b) Área do círculo: " + circulo);
		System.out.println("c) Área do trapézio: " + trapezio);
		System.out.println("d) Área do quadrado: " + quadrado);
		System.out.println("e) Área do retângulo: " + retangulo);

	}

}
