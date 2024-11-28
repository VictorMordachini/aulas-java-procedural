package Aula07_Funções.Exercícios;

import java.util.Scanner;

public class Exercício02_Somar {
    public static void main(String[] args) {
        int retorno;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite dois numeros inteiros: ");
        retorno = somar(scanner.nextInt(), scanner.nextInt());
        scanner.close();

        System.out.println("A soma dos dois numeros digitados é: " + retorno);

    }

    static int somar(int num1, int num2) {
        return num1 + num2;
    }
}
