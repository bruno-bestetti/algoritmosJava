package exercicios;

import java.util.Scanner;

public class Exercicio24 {

    /*
     * 4. Extração de Substring: 
     * • Solicite ao usuário que insira uma frase. 
     * • Extraia e imprima a primeira palavra da frase.
     */

    public static void main(String[] args) {
        // Leia uma frase
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = leia.nextLine();
        leia.close();

        // Encontra o índice do primeiro espaço, ou o comprimento da frase se não houver espaço
        int indexEspaco = frase.indexOf(" ");
        indexEspaco = (indexEspaco == -1) ? frase.length() : indexEspaco;
       // O método indexOf(" ") procura o primeiro espaço na string. Se não houver espaço, ele retorna -1.

        // Extrai a primeira palavra usando substring
        String primeiraPalavra = frase.substring(0, indexEspaco);
        //A substring(0, indexEspaco) extrai a parte da string que vai do início até o valor de indexEspaco. 
        //Se indexEspaco é o comprimento da frase, toda a frase é considerada como a primeira palavra.

        // Imprime a primeira palavra
        System.out.println(primeiraPalavra);
    }
}
