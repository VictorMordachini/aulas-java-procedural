package Aula02_TiposDeDados.Exercicios;

import java.util.Scanner;

public class Exercício05_SomaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite as três notas: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        int soma = n1+n2+n3;
        System.out.println("A soma das notas é: "+soma);

        scanner.close();

    }
}
