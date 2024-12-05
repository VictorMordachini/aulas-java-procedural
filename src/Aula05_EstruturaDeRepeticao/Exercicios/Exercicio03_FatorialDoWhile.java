package Aula05_EstruturaDeRepeticao.Exercicios;

import java.util.Scanner;

public class Exercicio03_FatorialDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int x = scanner.nextInt(), fatorial = 1;
        int contador = x;

        do {
            x = x*fatorial;
            fatorial++;
        }while (contador>fatorial);
        System.out.println("O fatorial do número digitado é: "+x);


        scanner.close();

    }
}
