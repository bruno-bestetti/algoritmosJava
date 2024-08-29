package exercicios;

public class Exercicio10 {
	
	/*
	 Escreva uma expressão que será utilizada para decidir se um aluno foi ou não aprovado (True ou False).
	 
	 • Para ser aprovado, todas as médias do aluno devem ser maiores que 7.
	 
	 • Considere que o aluno cursa apenas três matérias, e que a nota de cada uma está armazenada nas seguintes variáveis: matéria1, matéria2 e matéria3.
	 */


	public static void main(String[] args) {

		int materia1 = 8;
		int materia2 = 6;
		int materia3 = 7;
		
		boolean aprovado1 = (materia1 >= 7);
		boolean aprovado2 = (materia2 >= 7);
		boolean aprovado3 = (materia3 >= 7);
		
		System.out.println("O aluno está aprovado na Matéria 1: " + aprovado1);
		System.out.println("O aluno está aprovado na Matéria 2: " + aprovado2);
		System.out.println("O aluno está aprovado na Matéria 3: " + aprovado3);
		

	}

}
