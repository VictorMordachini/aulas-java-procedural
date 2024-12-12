package Aula07_Funcoes.Exercicios;

import java.util.Scanner;

public class Exercicio05_CalcularMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaNotas = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite uma nota: ");
            somaNotas += scanner.nextDouble();
        }
        double media = calcularMedia(somaNotas);
        System.out.println("A média das notas inseridas é: " + media);

        scanner.close();


    }

    static double calcularMedia(double somaNotas) {
        return (somaNotas) / 3;

    }
}
