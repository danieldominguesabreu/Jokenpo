package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class jokenpo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variaveis
		String nome;
		int numero, computador;

		// Entrada do nome e escolha da op��o
		Scanner leitor = new Scanner(System.in);
		Random randon = new Random();

		System.out.println("Digite seu nome: ");
		nome = leitor.nextLine();
		System.out.println("\n" + nome + ", vamos jogar Jokenp� !!! ");
		System.out.println("--------------------");
		System.out.println("1 = Pedra");
		System.out.println("2 = Papel");
		System.out.println("3 = Tesoura");
		System.out.println("--------------------");
		System.out.println("Qual n�mero voc� escolhe?");
		numero = leitor.nextInt();
		if (numero == 1) {
			System.out.println("Voc� escolheu -> Pedra");
		} else if (numero == 2) {
			System.out.println("Voc� escolheu -> Papel");
		} else if (numero == 3) {
			System.out.println("Voc� escolheu -> Tesoura");
		}
		computador = randon.nextInt(3);
		if (computador == 1) {
			System.out.println("O computador escolheu -> Pedra");
		} else if (computador == 2) {
			System.out.println("O computador escolheu -> Papel");
		} else if (computador == 3) {
			System.out.println("O computador escolheu -> Tesoura");
		}

		leitor.close();

		// Rodando a l�gica
		if (numero == computador) {
			System.out.println("O jogo empatou!!!");
		} else if (numero == 1 && computador == 2) {
			System.out.println("Voc� perdeu!!!");
		} else if (numero == 1 && computador == 3) {
			System.out.println("Voc� ganhou!!!");
		} else if (numero == 2 && computador == 1) {
			System.out.println("Voc� ganhou!!!");
		} else if (numero == 2 && computador == 3) {
			System.out.println("Voc� pedeu!!!");
		} else if (numero == 3 && computador == 1) {
			System.out.println("Voc� perdeu!!!");
		} else if (numero == 3 && computador == 2) {
			System.out.println("Voc� ganhou!!!");
		}

	}
}
