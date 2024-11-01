package Aula02_TiposDeDados.Exercicios;

import java.util.Scanner;

public class Exercício06_Comparação {
    public static void main(String[] args) {
        int num1, num2;
        boolean comparacao;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite dois números inteiros diferentes: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        comparacao = num1 > num2;
        System.out.println(num1 + " > " + num2 + " = " + comparacao);
        comparacao = num1 < num2;
        System.out.println(num1 + " < " + num2 + " = " + comparacao);
        comparacao = num1 >= num2;
        System.out.println(num1 + " >= " + num2 + " = " + comparacao);
        comparacao = num1 <= num2;
        System.out.println(num1 + " <= " + num2 + " = " + comparacao);
        comparacao = num1 == num2;
        System.out.println(num1 + " == " + num2 + " = " + comparacao);
        comparacao = num1 != num2;
        System.out.println(num1 + " != " + num2 + " = " + comparacao);

        scanner.close();

    }
}
