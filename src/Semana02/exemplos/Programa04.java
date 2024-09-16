package exemplos;

public class Programa04 {

	public static void main(String[] args) {

		int x = 5; // Variável com escopo de bloco
		
		if (x > 0) {
			int y = 10; // variável com escopo de bloco inferior
			System.out.println(x + y);
		}
		//System.out.println(y); // erro, a variavel y não existe fora do bloco if

	}

}
