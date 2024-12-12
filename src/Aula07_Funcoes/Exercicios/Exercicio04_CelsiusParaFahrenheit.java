package Aula07_Funcoes.Exercicios;

import java.util.Scanner;

public class Exercicio04_CelsiusParaFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor em Celsius para converter para Fahrenheit: ");
        double f = converterCelsiusParaFahrenheit(scanner.nextDouble());

        System.out.print("O valor em Fahrenheit é: " + f);

        scanner.close();

    }

    static double converterCelsiusParaFahrenheit(double c) {
        return c * 1.8 + 32;

    }
}
