package exemplos;

import java.util.Scanner;

public class Exemplo06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = leia.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = leia.nextDouble();
		
		if (  (nota1 >= 0 && nota1 <= 10) &&  (nota2 >=0 && nota2 <=10)  ) {
		
			// Media
			double media = (nota1 + nota2)/2.0;
			
			if (media < 5) {
				System.out.println("O aluno teve mau desempenho");
			} 
			else if ( media >=5  && media < 7) {
				System.out.println("O aluno teve desempenho regular");
			} 
			else if (media >= 7 && media < 9) {
				System.out.println("O aluno teve um bom desempenho");
			}		
			else {
				System.out.println("O aluno teve um ótimo desempenho");
			}
		
		} else {
			System.out.println("Notas inválidas");
		}
		
		leia.close();
		
		

	}

}
