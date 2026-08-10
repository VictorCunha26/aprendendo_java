package br.senai;

import java.util.Scanner;
public class conumoMedio {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Distância (km): ");
        double distancia = sc.nextDouble();

        System.out.print("Litros: ");
        double litros = sc.nextDouble();

        double consumo = distancia / litros;

        System.out.printf("Consumo: %.2f km/l%n", consumo);
        sc.close();
    }
}
