package br.senai;

import java.util.Scanner;
public class calculoSalario {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da Hora: ");
        double valorHora = sc.nextDouble();

        System.out.print("Horas trabalhadas: ");
        double horas = sc.nextDouble();

        double salario = valorHora * horas;

        System.out.printf("Salário Bruto: R$ %.2f%n", salario);

        sc.close();
    }
}
