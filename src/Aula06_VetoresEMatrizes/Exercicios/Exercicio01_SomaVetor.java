package Aula06_VetoresEMatrizes.Exercicios;

import java.util.Scanner;

public class Exercicio01_SomaVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int[] vetorInt = new int[5];
        for (int i = 0; i < vetorInt.length; i++) {
            System.out.print("Digite um numero inteiro: ");
            vetorInt[i] = scanner.nextInt();
        }
        for (int numero : vetorInt) {
            soma = soma + numero;

        }
        System.out.println("Valor da soma dos números digitados = " + soma);

        scanner.close();

    }
}
