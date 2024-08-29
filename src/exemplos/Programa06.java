package exemplos;

//Operadores relacionais
public class Programa06 {

	public static void main(String[] args) {
		
		int idade = 18;
		int limiteIdade = 18;
		
		//Operador > (maior)
		boolean resultado = idade > limiteIdade;
		System.out.println("Ele vai poder tirar a carteira? " + resultado);
	
		//Operador >= (maior igual)
		resultado = idade >= limiteIdade;
		System.out.println("Ele vai poder tirar a carteira? " + resultado);
		
		//Operador <= (menor igual)
		int idadeMeia = 16;
		resultado = idade <= idadeMeia;
		System.out.println("Vai pagar meia? " + resultado);
		
		//Operador == (igualdade) // se for string usar equals
		int num1 = 500;
		int num2 = 500;
		resultado = (num1 == num2);
		System.out.println("Os números são iguais? " + resultado);
		
		//Testando com Strings (TEM QUE USAR .EQUALS)
		String senha = "admin";
		String tentativa = "admins0";
		resultado = (senha == tentativa);
		System.out.println("Acesso concedido " + resultado);

		
	}

}
