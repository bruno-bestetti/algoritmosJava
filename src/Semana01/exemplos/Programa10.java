package exemplos;

import java.util.Scanner;

public class Programa10 {

	public static void main(String[] args) {

		//Scanner para ler a entrada do teclado (System.in) no console
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = leia.nextLine();
		
		System.out.println("Qual a sua idade? ");
		int idade = leia.nextInt();

		System.out.println("Qual a sua altura? ");
		double altura = leia.nextDouble();
		
		//Saídas
		System.out.println("Bem vindo " + nome +"!");
		System.out.println("Sua idade é: " + idade);
		System.out.println("Sua altura é: " + altura);
	
		leia.close();
	}

}
