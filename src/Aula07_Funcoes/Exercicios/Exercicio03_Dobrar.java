package Aula07_Funcoes.Exercicios;

import java.util.Scanner;

public class Exercicio03_Dobrar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero inteiro para calcular o dobro: ");
        int retorno = dobrar(scanner.nextInt());

        System.out.println("O dobro do numero digitado é = " + retorno);

        scanner.close();
    }

    static int dobrar(int num) {
        return num * 2;
    }
}
