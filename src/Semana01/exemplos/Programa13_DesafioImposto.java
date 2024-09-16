package exemplos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Programa13_DesafioImposto {

	public static void main(String[] args) {
		
		System.out.println("Calcule o seu imposto de renda deste ano");

		// Console lê entradas do usuário
		Scanner leia = new Scanner(System.in);

		// Console pergunta a idade
		System.out.println("Digite sua idade: ");
		int idade = leia.nextInt();

		// Verifica se a idade é menor que 18
		if (idade < 18) {
			System.out.println("Contribuinte isento de tributos por ser menor de idade.");
			leia.close();
			return; // Encerra a execução do programa
		}

		// Console pergunta o salário
		System.out.println("Digite seu salário: ");
		double salario = leia.nextDouble();

		// Salário anual
		double salarioAnual = salario * 12;

		// pagaImposto = salario maior 8000
		boolean pagaImposto = (salario >= 8000);

		// Saídas
		DecimalFormat df = new DecimalFormat("#,###.00"); //Máscara para formato em Reais
		System.out.println("Salário mensal = " + "R$ " + df.format(salario));
		System.out.println("Salário anual = " + "R$ " + df.format(salarioAnual));
		System.out.print("Deve pagar imposto: " + (pagaImposto ? "SIM - " : "NÃO - ")); //Transforma true em SIM, e false em NÃO

		// Condicional para definir a porcentagem de imposto
		if (pagaImposto) {
			double imposto = 0;

			if (salario >= 8000 && salario <= 12000) {
				imposto = salario * 0.17;
				System.out.println("O contribuinte paga 17% de imposto.");

			} else if (salario >= 12001 && salario <= 20000) {
				imposto = salario * 0.25;
				System.out.println("O contribuinte paga 25% de imposto.");

			} else if (salario >= 20001 && salario <= 30000) {
				imposto = salario * 0.29;
				System.out.println("O contribuinte paga 29% de imposto.");

			} else if (salario > 30000) {
				imposto = salario * 0.35;
				System.out.println("O contribuinte paga 35% de imposto.");
			}

			System.out.println("Valor do imposto: R$ " + df.format(imposto));
			System.out.println("Parcelamento em 6 vezes: R$ " + df.format(imposto / 6));

		} else {
			System.out.println("Contribuinte isento de tributos. Renda mensal abaixo de R$ 8.000,00");
		}

		leia.close();
	}

}
