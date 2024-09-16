package exemplos;

import java.util.Scanner;

public class Programa03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		//Programação defensiva
		System.out.print("Você é estudante? [s/n]");
		char opcao = leia.nextLine().toLowerCase().charAt(0);
		
		System.out.println("Digite sua idade: ");
		int idade = leia.nextInt();
		
		//Declarando o valor do ingresso
		double valorIngresso = 40.0;
		
		if(idade <= 16 || opcao == 's') {
			valorIngresso = valorIngresso/2.0;
			System.out.println("Paga meia entrada. " + valorIngresso);
		} else {
			System.out.println("Paga inteira. " + valorIngresso);
		}
		leia.close();
	}

}
