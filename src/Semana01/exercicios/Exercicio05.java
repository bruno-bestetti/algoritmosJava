package exercicios;

public class Exercicio05 {
	
	/*
	 Exercício de Conversão de Tipos: 
	 
	 • Declare uma variável numeroDouble do tipo double e atribua a ela o valor 10.5.

	 • Declare uma variável numeroInteiro do tipo int,
	   e converta o valor de numeroDouble para um inteiro.
	
	 • Imprima o valor de numeroInteiro.
	 */

	public static void main(String[] args) {
				

		//Declaração double
		double numeroDouble = 10.5;
		
		
		//Convertendo double para inteiro
		int doubleConvertido  = (int) numeroDouble;
		
		
		//Imprimindo numeroInteiro
		System.out.println(doubleConvertido);
		
	}

}
