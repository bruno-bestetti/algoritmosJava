package exemplos;

public class OperadoresLogicos {

	public static void main(String[] args) {
			
		boolean verdadeiro = true;
		boolean  falso = false;
		
		// Operador E (&&)
		boolean resultadoE = verdadeiro && falso;
		
		// Operador OU (||)
		boolean resultadoOU = verdadeiro || falso;
		
		// Operador NOT (!)
		boolean resultadoNOT = !verdadeiro;
		
		// Combinação de operadores lógicos
		boolean combinacao = (verdadeiro && falso) || !verdadeiro;
		
		// Exibindo resultados
		System.out.println("E: "+ resultadoE);
		System.out.println("OU: "+ resultadoOU);
		System.out.println("NOT: "+ resultadoNOT);
		System.out.println("Combinacao: "+ combinacao);
		
	}

}
