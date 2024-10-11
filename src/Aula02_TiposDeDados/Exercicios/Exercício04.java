package Aula02_TiposDeDados.Exercicios;

import java.util.Scanner;

public class Exercício04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número fracionado: ");
        double varDouble = scanner.nextDouble();
        int varInt = (int) varDouble;
        System.out.print("O valor de varDouble é: " + varDouble + "\nO valor de varInt é: " + varInt);


        scanner.close();

    }
}
