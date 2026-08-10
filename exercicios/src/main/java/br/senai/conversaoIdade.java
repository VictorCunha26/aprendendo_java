package br.senai;

import java.util.Scanner;
public class conversaoIdade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        int meses = idade * 12;
        int dias = idade * 365;

        System.out.println("Meses: " + meses);
        System.out.println("Dias: " + dias);

        sc.close();
    }
}
