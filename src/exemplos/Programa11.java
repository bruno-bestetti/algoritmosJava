package exemplos;

import java.util.Scanner;

public class Programa11 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		/*
		 * System.out.println("Digite seu nome: "); // String nome = leia.nextLine();
		 * System.out.println(nome); //
		 * System.out.println("Digite seu nome novamente: "); // nome = leia.next(); //
		 * System.out.println(nome);
		 */

		System.out.println("Digite um numero: ");
		int num = leia.nextInt();

		// LIMPEZA DE BUFFER
		leia.nextLine();

		System.out.println("Digite um nome: ");
		String nome = leia.nextLine();

		System.out.println("Digite outro nome");
		nome = leia.nextLine();

		leia.close();

	}

}
