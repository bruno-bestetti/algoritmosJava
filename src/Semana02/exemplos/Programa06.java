package exemplos;

import java.util.Scanner;

public class Programa06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = leia.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = leia.nextDouble();
		
		// Media
		double media = (nota1 + nota2)/2.0;
		
		if (media >= 5) {
			System.out.println("APROVADO. MÉDIA =  " + media);
		} else if ( media >=3.5  && media <= 4.9) {
			System.out.println("RECUPERAÇÃO. Média atual: " + media);
		} else {
			System.out.println("Aluno reprovado");
		}
		
		leia.close();
		
		

	}

}
