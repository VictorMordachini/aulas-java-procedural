package Aula06_VetoresEMatrizes.Exercicios;

import java.util.Scanner;

public class Exercicio04_MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[4];
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.print("digite a nota " + i + ": ");
            notas[i] = scanner.nextDouble();
            media += notas[i];
        }
        media = media / notas.length;
        System.out.println("Sua média é: " + media);


        scanner.close();
    }
}
