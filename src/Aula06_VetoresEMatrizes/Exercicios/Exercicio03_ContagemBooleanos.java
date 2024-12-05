package Aula06_VetoresEMatrizes.Exercicios;

import java.util.Scanner;

public class Exercicio03_ContagemBooleanos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] valores = new boolean[8];
        int contador = 0;

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Insira um valor booleano (true or false): ");
            valores[i] = scanner.nextBoolean();
            if (valores[i]) {
                contador++;
            }
        }
        System.out.println("Numero de valores true inseridos: " + contador);

        scanner.close();
    }
}
