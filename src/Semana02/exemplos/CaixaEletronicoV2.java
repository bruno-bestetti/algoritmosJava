package exemplos;


// COM SWITCH CASE

import java.util.Scanner;

public class CaixaEletronicoV2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		// Login e senha corretas
		String login = "admin";
		String senha = "admin";
		
		System.out.println("Digite seu login: ");
		String tentativaLogin = leia.nextLine();
		
		System.out.println("Digite sua senha: ");
		String tentativaSenha = leia.nextLine();
		
		if (login.equals(tentativaLogin) && tentativaSenha.equals(senha)){
			
			// Acessou o sistema
			System.out.println("------Bem vindo " + login + "------");
			System.out.println("1. Sacar");
			System.out.println("2. Depositar");
			System.out.println("3. Saldo");
			System.out.println("4. Sair");
			System.out.println("Digite a opção desejada");
	
			// Lendo a opção
			int opcao = leia.nextInt();
	
			// Valor na conta
			double saldoConta = 5000;
	
			// Analisar as opçoes via estrutura condicional
			switch (opcao) {
	
				case 1: 
					System.out.println("Digite o valor em R$");
					double saque = leia.nextDouble();
		
					if (saque <= saldoConta && saque > 0) {
						saldoConta = saldoConta - saque;
						System.out.println("Saque de R$" + saque + " reais realizado com sucesso");
		
						System.out.println("Saldo atual: " + saldoConta);
					} else {
						System.out.println("Valor inválido ou saldo insuficiente");
					}
				break;
	
				case 2: 	
					System.out.println("Digite o valor a depositar");
					double deposito = leia.nextDouble();
		
					if (deposito > 0) {
						saldoConta = saldoConta + deposito;
						System.out.println("Deposito de " + "R$" + deposito + " Reais realizado com sucesso");
						System.out.println("Saldo atual: " + saldoConta);
					} else {
						System.out.println("Valor inválido");
					}
				break;			
				
				case 3:
					System.out.println("Saldo atual: " + saldoConta);
					break;
					
				case 4:				
					System.out.println("Saindo do sistema");
					break;
				default:
				System.out.println("Opção inválida");
				break;
			}
			
			
		} else {
			System.out.println("Credenciais inválidas");
		}	
		
	}

}
		
		

		
		
		
		
		

		


