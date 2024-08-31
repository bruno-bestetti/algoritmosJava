package exercicios;

import java.text.DecimalFormat;

public class Exercicio18 {
/*
	Faça um programa que defina duas variáveis do tipo double (x e y)
	 com os valores 3,5 e 4,64 respectivamente. 
	 
	 Imprima os valores das variáveis com a seguinte forma:
		Valor de X: 3,5
		Valor de Y: 4,64
*/
	public static void main(String[] args) {

		//Declaração de variáveis
		double x = 3.5 ;
		double y = 4.65;
		
		//Saída com DecimalFormat
		System.out.println("Com DecimalFormat:");
		
		DecimalFormat df1 = new DecimalFormat("#.0");
		DecimalFormat df2 = new DecimalFormat("#.00");
		
		System.out.println("Valor de X = " + df1.format(x));
		System.out.println("Valor de Y = " + df2.format(y));
		
		System.out.println("-------------");
		
		//Saída
		System.out.printf("%.1f%n" , x);
		System.out.printf("%.2f" , y);

		
	}

}
