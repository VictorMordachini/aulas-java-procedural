package Aula04_EstruturaDeDecisao.Exercicios;

import java.util.Scanner;

public class Exercicio03_CodigoProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigoProduto;

        System.out.println("Digite o código do produto: ");
        System.out.println("\t1- Eletrônicos");
        System.out.println("\t2- Alimentos");
        System.out.println("\t3- Vestuário");

        codigoProduto = scanner.nextInt();
        switch (codigoProduto) {
            case 1:
                System.out.println("O produto é um eletrônico");
                break;
            case 2:
                System.out.println("O produto é um alimento");
                break;
            case 3:
                System.out.println("O produto é uma peça de roupa");
                break;
            default:
                System.out.println("Opção inválida");


                scanner.close();


        }
    }
}
