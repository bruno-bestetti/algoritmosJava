package exemplos;

// Escreva uma expressão para determinar se uma pesso adeve ou não pagar impostos.
// Considere que pagam impostos pessoas cujo salário é maior que 8000 "E" são maiores de idade

public class Programa09_DesafioImposto {

	public static void main(String[] args) {

		// Entradas
		int idade = 18;
		double salario = 5000.0;

		// pagaImposto = maior de idade E salario maior 8000
		boolean pagaImposto = (idade >= 18) && (salario >= 8000);
		System.out.println("Salário = " + "R$ " + salario);
		System.out.println("Deve pagar imposto: " + pagaImposto);

		// Condicional para definir a porcentagem de imposto
		// If aninhado com else if
		// Se pagaImposto for verdade, analie o salário para definir porcentagem de
		// imposto.
		// Se não pagaImposto for falso, contribuinte isento.
		if (pagaImposto == true) {

			if (salario >= 8000 && salario <= 12000) {
				System.out.println("O contribuinte paga 17% de imposto.");
			} else if (salario >= 12001 && salario <= 20000) {
				System.out.println("O contribuinte paga 25% de imposto.");
			} else if (salario >= 20001 && salario <= 30000) {
				System.out.println("O contribuinte paga 29% de imposto.");
			} else if (salario > 30000) {
				System.out.println("O contribuinte paga 35% de imposto.");
			}
		} else {
			System.out.println("Contribuinte isento de tributos.");
		}

	}

}
