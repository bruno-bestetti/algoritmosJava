package exemplos;

import java.util.Locale;
import java.util.Scanner;

// Biblioteca matematica
public class Programa12 {

	public static void main(String[] args) {
		
//		Locale.setDefault(Locale.US);
		
		// Calculo de potencia
		double potencia = Math.pow(2, 3);
		System.out.println(potencia);
		
		// Raiz quadrada
		double raizQuadrada = Math.sqrt(25);
		System.out.println(raizQuadrada);
		
		int num1 = 500;
		int num2 = 1600;
		
		// Numero máximo entre dois numeros
		int maior = Math.max(num1, num2);
		
		// Numero minimo entre dois numeros
		int menor = Math.min(num1, num2);
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		
		// Arredondamento para cima
		double valor = 1.5589992;
		valor = Math.ceil(valor);
		System.out.println(valor);
		
		// Arredondamento para baixo
		valor = 1.5589992;
		valor = Math.floor(valor);
		System.out.println(valor);
		
		// Formatação do numero decimal
		valor = 1.5589992;
		System.out.printf("Valor: %.3f", valor);
		System.out.println("\nOlá mundo");
		

	}

}
