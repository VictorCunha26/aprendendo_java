package br.senai;

import java.util.Scanner;
public class descontoEmProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor do produto: ");
        double valor = sc.nextDouble();

        System.out.print("Desconto (%): ");
        double desconto = sc.nextDouble();

        double valorDesconto = valor * desconto / 100;
        double valorFinal = valor - valorDesconto;

        System.out.printf("Desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Valor Final: R$ %.2f%n", valorFinal);
    }
}
