package Aula04_EstruturaDeDecisao.Exercícios;

import java.util.Scanner;

public class Exercício01_Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Acesso Permitido");
        } else {
            System.out.println("Acesso Negado");
        }


        scanner.close();

    }
}
