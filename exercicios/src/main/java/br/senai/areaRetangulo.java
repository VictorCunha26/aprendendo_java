package br.senai;


import java.util.Scanner;
public class areaRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base: ");
        double base = sc.nextDouble();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        double area = base * altura;

        System.out.printf("Área= %.2f%n", area);

        sc.close();

    }
}
