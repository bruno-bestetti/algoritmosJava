package exercicios;

import java.util.Scanner;

public class Exercicio27 {
/*	
	Faça um programa que calcule a distância em quilômetros (km) percorrida por um carro. 
	
	Solicite ao usuário a velocidade em quilômetros por hora (km/h) e o tempo da viagem em horas.
	
	O programa deve	apresentar a velocidade e o tempo informados pelo usuário, bem como a distância calculada. 
	
	Exemplo
	Velocidade: 1000 km/h
	Tempo de viagem: 3 horas
	Distância percorrida: 300 km
*/
	public static void main(String[] args) {

		//Solicitar velocidade
		Scanner leia = new Scanner(System.in);
        System.out.println("Insira a velocidade da viagem em km/h: ");
        Double velocidade = leia.nextDouble();
        
		//Solicitar tempo
        System.out.println("Insira o tempo em durou a viagem em horas: ");
        Double tempo = leia.nextDouble();
        leia.close();
        
		//Calcular distância
		Double distancia = (velocidade * tempo);
        
		//Saídas
		System.out.println("Velocidade: " + velocidade + " km/h");
        System.out.println("Tempo de viagem: " + tempo + " horas");
        System.out.println("Distância percorrida: " + distancia + " km");
	}

}
