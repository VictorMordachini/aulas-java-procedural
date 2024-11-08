package Aula06_VetoresEMatrizes.Exercícios;

import java.util.Scanner;

public class Exercício02_BuscaCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] vetor = {"t", "r", "u", "v", "l", "m"};
        System.out.print("Digite um caracter para buscar: ");
        String busca = scanner.next();
        for (int i = 0; i < vetor.length; i++) {
            if (busca.equals(vetor[i])){
                System.out.println("Caracter encontrado na posição "+i+" do vetor");
                break;
                } else if (i == 5) {
                System.out.println("Caracter não encontrado");

            }
        }





        scanner.close();
    }
}
