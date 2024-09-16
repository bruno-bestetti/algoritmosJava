package exercicios;

import java.util.Scanner;

public class Desafio {
	/*
	 * Faça um código que recebe um login e senha via teclado(scanner). Compare o
	 * que foi digitado com duas Strings já predefinidas com login e senha. Utilize
	 * uma estrutura condicional para obter o resultado da autenticação
	 */
	public static void main(String[] args) {

		// Scanner
		Scanner leia = new Scanner(System.in);

		// Setando login e senha
		String login = "user";
		String senha = "senha1234";

		// Usuário digita login e senha
		System.out.println("Digite seu login: ");
		String loginUsuario = leia.nextLine();

		System.out.println("Digite sua senha: ");
		String senhaUsuario = leia.nextLine();

		// Estrutura condicional
		if (login == loginUsuario && senha == senhaUsuario) {
			System.out.println("Login efetuado com sucesso!");
		} else {
			System.out.println("Acesso não concedido");
		}

		leia.close();

	}
}
