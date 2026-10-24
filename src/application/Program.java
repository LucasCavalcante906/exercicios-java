package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero para a taboada: ");
		int numero1 = sc.nextInt();
		tabuada(numero1);
		System.out.println();

		System.out.println("Digite um numero para o jogo de adivinhação: ");
		int numero2 = sc.nextInt();
		adivinha(numero2);
		System.out.println();

		System.out.println("-------- BEM VINDO AO CAIXA ELETRÔNICO --------");
		caixaEletronico();
		System.out.println();

		System.out.println("Digite um numero para base e outro para expoente: ");
		double base = sc.nextDouble();
		double expoente = sc.nextDouble();
		potenciacao(base, expoente);
		System.out.println();

		System.out.println("Digite um numero para descobrir o fatorial: ");
		int numero3 = sc.nextInt();
		fatorial(numero3);

	}

	static void tabuada(int numero) {
		int calculo = 0;

		for (int i = 0; i <= 10; i++) {

			calculo = numero * i;
			System.out.println(calculo);
		}

	}

	static void adivinha(int numero) {
		Scanner sc = new Scanner(System.in);
		int chute = 0;

		do {

			System.out.println("Chute um numero: ");
			chute = sc.nextInt();

			if (chute < numero) {

				System.out.println("É MENOR");
			} else if (chute > numero) {

				System.out.println("É MAIOR");
			}

			else {

				System.out.println("É IGUAL");
			}
		} while (chute != numero);

	}

	static void caixaEletronico() {
		Scanner sc = new Scanner(System.in);
		double saldo = 1000.00;
		int opcao;

		do {
			System.out.println("1 - Consultar saldo");
			System.out.println("2 - Depositar");
			System.out.println("3 - Sacar");
			System.out.println("4 - Sair");
			System.out.print("Escolha uma opção: ");

			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.printf("Saldo atual: %.2f%n", saldo);
				break;
			case 2:
				System.out.println("Digite o valor a depositar:");
				double deposito = sc.nextDouble();
				if (deposito <= 0) {
					System.out.println("Depósito inválido");
				} else {
					saldo = saldo + deposito;
				}
				break;
			case 3:
				System.out.println("Digite o valor a sacar:");
				double saque = sc.nextDouble();
				if (saque <= 0) {

					System.out.println("Saque invalido");
				} else if (saque > saldo) {
					System.out.println("saldo insuficiente");
					System.out.printf("%.2f%n", saldo);
				} else {
					saldo = saldo - saque;
				}
				break;
			case 4:
				System.out.println("Obrigado por usar o caixa!");
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}

		} while (opcao != 4);

	}

	static void potenciacao(double numero1, double numero2) {

		System.out.println(Math.pow(numero1, numero2));
	}

	static void fatorial(int numero) {
		long resultado = 1;

		for (int i = 2; i <= numero; i++) {
			resultado = resultado * i;
		}

		System.out.println("Fatorial: " + resultado);
	}
}
