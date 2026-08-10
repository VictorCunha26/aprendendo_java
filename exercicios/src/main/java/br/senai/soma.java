package br.senai;

import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Escreva 1° número: ");
        int num1 = scanner.nextInt();
        System.out.println("Escreva 2° número: ");
        int num2 = scanner.nextInt();

        System.out.println("1° número: " + num1);
        System.out.println("2° número: " + num2);
        System.out.print("Soma: " + (num1 + num2));
    }
}
