package exercicios;

import java.util.Scanner;

public class Exercicio25 {
/*
	Conversão de Maiúsculas e Minúsculas:
		• Peça ao usuário que insira uma palavra ou frase.
		• Converta todas as letras para maiúsculas e, em seguida, para minúsculas.
		• Imprima as duas versões da string
*/
	public static void main(String[] args) {
		
		// Leia uma palavra
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = leia.nextLine();
        leia.close();
        
        //Converte em MAIÚSCULA
        String palavraMaiuscula = palavra.toUpperCase();
        
        //Converte em minuscula
        String palavraMinuscula = palavra.toLowerCase();
        
        //Saída
        System.out.println(palavraMaiuscula);
        System.out.println(palavraMinuscula);

	}

}
