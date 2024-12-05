package Aula05_EstruturaDeRepeticao.Exercicios;

import java.util.Scanner;

public class Exercicio05_MediaFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float notas = 0, media;
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite sua nota: ");
            notas += scanner.nextFloat();
        }
        media = notas / 5;
        System.out.println("Sua média é: " + media);


        scanner.close();
    }
}
