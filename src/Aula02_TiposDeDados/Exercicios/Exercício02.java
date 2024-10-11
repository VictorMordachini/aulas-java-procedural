package Aula02_TiposDeDados.Exercicios;

import java.util.Scanner;

public class Exercício02 {
    public static void main(String[] args) {
        int total, horas, valorHora;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de horas: ");
        horas = scanner.nextInt();
        System.out.print("Digite o valor pago por hora: ");
        valorHora = scanner.nextInt();

        total = horas * valorHora;
        System.out.println("O valor total é: " + total);
        scanner.close();
    }
}
