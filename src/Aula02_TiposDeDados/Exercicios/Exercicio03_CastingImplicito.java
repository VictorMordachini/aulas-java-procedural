package Aula02_TiposDeDados.Exercicios;

import java.util.Scanner;

public class Exercicio03_CastingImplicito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int varInt = scanner.nextInt();
        double varDouble = varInt;
        System.out.println("O valor de varDouble é: " + varDouble);

        scanner.close();
    }
}
