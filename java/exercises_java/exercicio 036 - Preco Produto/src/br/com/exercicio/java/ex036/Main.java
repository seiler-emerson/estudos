package br.com.exercicio.java.ex036;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Elabore um programa que calcule o valor a ser pago por um produto, considerando o seu preço normal e condição de pagamento:");
		System.out.println("");
		
		String produto;
		float precoProduto;
		byte pagamento;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o produto comprado?");
		produto = entrada.nextLine();
		
		System.out.println("Qual o valor do produto?");
		precoProduto = entrada.nextFloat();
		
		System.out.println("Qual a forma de pagamento? Digite o número respectivo a escolha: ");
		System.out.println("1 - à vista dinheiro/cheque: 10% de desconto");
		System.out.println("2 - à vista no cartão: 5% de desconto");
		System.out.println("3 - em até 2x no cartão: preço normal");
		System.out.println("4 - 3x ou mais no cartão: 20% de juros");
		pagamento = entrada.nextByte();
		
		if(pagamento == 1) {
			precoProduto = precoProduto*0.9f;
			System.out.println("Você ganhou 10% de desconto. O valor do(a) "+produto+" ficou em R$"+precoProduto);
		} else if (pagamento ==2) {
			precoProduto = precoProduto*0.95f;
			System.out.println("Você ganhou 5% de desconto. O valor do(a) "+produto+" ficou em R$"+precoProduto);
		} else if (pagamento == 3) {
			precoProduto = precoProduto;
			System.out.println("O valor do(a) "+produto+" ficou em R$"+precoProduto);
		} else if (pagamento == 4) {
			precoProduto = precoProduto*1.2f;
			System.out.println("A compra terá 20% de juros. O valor do(a) "+produto+" ficou em R$"+precoProduto);
		} else {
			System.out.println("Por favor digite uma forma de pagamento válida.");
		}
		
	}

}
