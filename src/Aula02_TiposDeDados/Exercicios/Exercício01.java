package Aula02_TiposDeDados.Exercicios;

import java.util.Scanner;

public class Exercício01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite sua altura: ");
        float altura = scanner.nextFloat();
        System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Idade = " + idade + "\nAltura = " + altura + "\nPeso = " + peso);
        scanner.close();

    }
}
