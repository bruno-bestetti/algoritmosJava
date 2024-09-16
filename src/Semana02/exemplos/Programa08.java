package exemplos;

import java.util.Scanner;

public class Programa08 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do dia da semana");
		String dia = leia.next();
		
		switch (dia) {
			case "domingo":
				System.out.println("Voc~e escolheu domingo");
				break;
			case "segunda":
				System.out.println("Voc~e escolheu segunda");
				break;
			case "terça":
				System.out.println("Voc~e escolheu terça");
				break;
			default:
				System.out.println("Não existe esse dia da semana");
				break;
		}
		
		
		

	}

}
