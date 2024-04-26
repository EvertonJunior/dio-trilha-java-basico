package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.ContaBanco;

public class Programa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		
		System.out.println("Digite o nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite o número da agência: ");
		String agencia = scanner.next();
		
		System.out.println("Digite o número da conta: ");
		int conta = scanner.nextInt();
		
		System.out.println("Qual depósito inicial? R$");
		double depositoInicial = scanner.nextDouble();
		
		ContaBanco contaBanco = new ContaBanco(conta, agencia, nome, depositoInicial);
		
		System.out.println(contaBanco);
		
		scanner.close();
	}

}
