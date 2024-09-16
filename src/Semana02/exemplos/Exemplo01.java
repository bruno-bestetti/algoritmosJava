package exemplos;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// Login e senha corretas
		String login = "rogerio@gmail.com";
		String senha = "admin123";
		
		System.out.println("Digite seu login: ");
		String tentativaLogin = leia.nextLine();
		
		System.out.println("Digite sua senha: ");
		String tentativaSenha = leia.nextLine();
		
		if (tentativaLogin.equals(login) && tentativaSenha.equals(senha)){
			System.out.println("Bem vindo");			
		} else {
			System.out.println("Credenciais inválidas");
		}	
		
		leia.close();
		
		

	}

}
