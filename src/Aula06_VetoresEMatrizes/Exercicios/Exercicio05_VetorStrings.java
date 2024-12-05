package Aula06_VetoresEMatrizes.Exercicios;

import java.util.Scanner;

public class Exercicio05_VetorStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = {"Victor", "Papagaio", "Lines"};
        System.out.print("Digite um nome para buscar: ");
        String busca = scanner.nextLine();
        boolean presente = false;
        for (String nome : nomes) {
            if (busca.equals(nome)) {
                presente = true;
                break;
            }
        }

        if (presente) {
            System.out.println("O nome " + busca + " está presente no vetor.");
        } else {
            System.out.println("O nome " + busca + " não está presente no vetor.");
        }


        scanner.close();
    }
}
