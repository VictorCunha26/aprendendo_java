package br.senai;

import java.util.Scanner;
public class operacoesMatematicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Escreva o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("\nResultados");

        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));

        if (num2 != 0){
            System.out.println("Divisão: " + (num1 / num2));
        }
        else{
            System.out.println("Não é possível dividir por zero");
        }
    }
    
}
