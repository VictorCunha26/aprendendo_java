package br.senai;

import java.util.Scanner;

public class conversaoTemperatura {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperatura em Celsius: ");
        double celsius = sc.nextDouble();
        
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("Fahrenheit: %.2f%n", fahrenheit);
        sc.close();
    }
}
