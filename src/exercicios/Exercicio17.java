package exercicios;

import java.util.Scanner;

public class Exercicio17 {
	/*
	    Média de Notas:
		• Solicite ao usuário que insira três notas.
		• Calcule a média aritmética das notas.
		• Imprima a média.
	*/
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		// Leitor de notas 
		System.out.println("Digite primeira nota: ");
		int nota1 = leia.nextInt();
		
		System.out.println("Digite segunda nota: ");
		int nota2 = leia.nextInt();
		
		System.out.println("Digite terceira nota: ");
		int nota3 = leia.nextInt();
		
		leia.close();
		
		//Cauculo de média
		int mediaNotas = (nota1 + nota2 + nota3) / 3;
		
		//Saida
		System.out.println("Sua média de notas é: " + mediaNotas);
	}

}
