package exercicios;

import java.util.Scanner;

public class Exercicio26 {
/*
	Remoção de Espaços em Branco:
		• Solicite ao usuário que insira uma frase com espaços em branco no início e no final.
		• Remova os espaços em branco extras e imprima a frase resultante.
*/
	public static void main(String[] args) {

		// Leia uma palavra
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite uma frase com espaços em branco no início e final: ");
        String fraseEspacos = leia.nextLine();
        leia.close();
        
        //Remoção espaços
        String fraseSemEspacos = fraseEspacos.trim();
        
        //Saída
        System.out.println(fraseSemEspacos);
	}

}
