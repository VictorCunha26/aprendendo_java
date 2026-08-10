package br.senai;

import java.util.Scanner;
public class perimetroRetangulo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Base: ");
        double base = sc.nextDouble();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        double perimetro = 2 * (base + altura);

        System.out.printf("Perímetro: %.2f%n", perimetro);

        sc.close();
    }
}
