package Aula05_EstruturaDeRepetição.Exemplos;

import java.util.Scanner;

public class Exemplo3_Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção: ");

            System.out.println("\t1 para escolher opção 1");
            System.out.println("\t2 para escolher opção 2");
            System.out.println("\t3 para escolher opção 3");
            System.out.println("\t4 para sair");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Parabéns! Você escolheu a opção 1");
                    break;
                case 2:
                    System.out.println("Parabéns! Você escolheu a opção 2");
                    break;
                case 3:
                    System.out.println("Parabéns! Você escolheu a opção 3");
                    break;
                case 4:
                    System.out.println("Tchau!");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while (opcao!=4);
        System.out.println("Fim do programa");

        scanner.close();
    }
}
