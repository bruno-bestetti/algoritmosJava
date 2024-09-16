package exercicios;

public class Exercicio02 {

	/*
	 * Imprima o resultado da seguinte expressão: 10 % 3 * 2² + 1 - 10 * 4 / 2
	 * Observe como a prioridade das operações é importante.
	 * 
	 * Imprima agora 10 % (3 * 2²) + 1 - (10 * 4 / 2)
	 */

	public static void main(String[] args) {

		double potencia = Math.pow(2, 2);
		
		//Definindo expressões
		double expressao1 = (10 % 3 * potencia + 1 - 10 * 4 / 2);
		double expressao2 = (10 % (3 * potencia) + 1 - (10 * 4 / 2));
		
		System.out.println("Resultado da Expressão 1 (sem uso de parênteses): " + expressao1);
		System.out.println("Resultado da Expressão 2 (com parênteses): " + expressao2);

	}

}
