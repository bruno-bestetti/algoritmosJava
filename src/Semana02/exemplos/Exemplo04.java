package exemplos;

import java.util.Scanner;

public class Exemplo04 {

	public static void main(String[] args) {
		
		// Entradas
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nivel do professor: ");
		int nivel = leia.nextInt();
		
		System.out.println("Quantas horas trabalhadas? ");
		int horas = leia.nextInt();
		
		// Processamento
		if (nivel == 1) {
			double salario = 30 * horas;
			
			//saida
			System.out.println("O salario do professor foi R$" + salario);
		} 
		else if (nivel == 2) {
			double salario = 37.50 * horas;
			
			//saida
			System.out.println("O salario do professor foi R$" + salario);
		} 
		else if (nivel == 3) {
			double salario = 40 * horas;
			
			//saida
			System.out.println("O salario do professor foi R$" + salario);
		} 
		else {
			
			//saida
			System.out.println("Opção inválida");
		}
		
		
		
		
		
		
		
		leia.close();
		
		

	}

}
