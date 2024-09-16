package exemplos;

public class Programa03 {

	public static void main(String[] args) {

		int idade = 10;
		Integer numero = 20;
		
		// Isto é uma String não um numero inteiro!
		String valor = "50";
		
		// Convertendo "50" para o tipo inteiro
		int valorConvertido = Integer.parseInt(valor);
		
		String valorProduto = "2.50";
		
		// Convertendo "2.50" para o tipo double
		Double valorProdutoConvertido =
				Double.parseDouble(valorProduto);
		
		// operações interessantes com String
		String texto = "Hello, World!";
		
		// Calculando o comprimento do meu texto
		int tamanho = texto.length();
		System.out.println(tamanho);
		
		// Alterando caracteres do meu texto
		String novoTexto = texto.replace('l', 'j'); 
		System.out.println(novoTexto);
		
		
		String genero = "Masculino";
		
		// Pegando o primeiro caracter da String genero
		char letra = genero.charAt(0);
		System.out.println(letra);
		
		String frase = "Programador Java";
		
		// Deixando a String tudo em maiusculo
		String emMaiusculas = frase.toUpperCase();
		System.out.println(emMaiusculas);
		
		// Deixando a String tudo em minusculo
		String emMinusculas = frase.toLowerCase();
		System.out.println(emMinusculas);
		
		String senha = "     Java        ";
		System.out.println(senha);
		// Tirando os espaços em branco da String senha
		String senhaSemEspacos = senha.trim();
		System.out.println(senhaSemEspacos);
		
		// Analisando se existe tal palavra dentro da variavel frase
		boolean existe = frase.contains("Java");
		System.out.println(existe);
		
		// Comparando duas Strings
		String passwd = "admin";
		String tentativa = "adminn";
		boolean saoIguais = passwd.equals(tentativa);
		System.out.println(saoIguais);
		
		
		String nome = "Rogério";
		String sobreNome = "Pereira";
		
		// Operador de concatenação: +
		String nomeCompleto = nome + " " + sobreNome;
		System.out.println(nomeCompleto);
		
		System.out.println("O nome do professor é " + nomeCompleto);


		double preco = 20.5;
		char letters = 'O';

	}

}
