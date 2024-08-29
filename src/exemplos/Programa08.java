package exemplos;

//Operador OU e NOT
public class Programa08 {

	public static void main(String[] args) {
		
		//Operador OU |
		int idade = 16;
		boolean ehEstudante = false;
		
		//Vou analisar se o usuário vai pagar meia entrada:
		boolean pagaMeia = (idade < 18) || (ehEstudante == true);
		System.out.println("O usuário vai pagar meia? " + pagaMeia);
		
		//Operador NOT !
		boolean negacao = !pagaMeia;
		System.out.println(negacao);
		
	}

}
