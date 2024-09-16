package exemplos;

public class Programa07 {

	public static void main(String[] args) {

		String senha = "admin";
		String tentativaSenha = "admin";

		String login = "root";
		String tentativaLogin = "root";

		boolean A = senha == tentativaSenha;
		boolean B = login == tentativaLogin;
		System.out.println(A + " - " + B);
		boolean AeB = A & B;
		System.out.println(AeB);
		
		//Em uma linha só:
		AeB = (senha == tentativaSenha) && (login == tentativaLogin);
		
		// Analisando se um número especifico está dentro da faixa de 10 a 20
		int numero = 25;
		boolean resultado = (numero >= 10) || (numero <= 20);
		System.out.println("O número " + numero + " está dentro da faixa? " + resultado);
		
	}

}
