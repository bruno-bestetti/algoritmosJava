package exemplos;

import java.util.Random;

public class Programa09 {

	public static void main(String[] args) {

		//Chamando biblioteca de números aleatórios
		Random aleatorio = new Random();
		
		//Gerando um número aleatório qualquer
		int num = aleatorio.nextInt();
		System.out.println(num);
		
		//Gerando números aleatórios de 0 a 100
		num = aleatorio.nextInt(100);
		System.out.println(num);

		
		double num2 = aleatorio.nextDouble(150);
		System.out.println(num2);
	}

}
