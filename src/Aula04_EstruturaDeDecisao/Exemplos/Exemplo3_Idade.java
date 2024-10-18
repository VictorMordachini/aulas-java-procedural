package Aula04_EstruturaDeDecisao.Exemplos;

import java.util.Scanner;

public class Exemplo3_Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if (idade > 0 && idade <= 12) {
            System.out.println("Criança");
        } else if (idade > 12 && idade < 18) {
            System.out.println("Adolescente");
        } else if (idade > 17 && idade < 65) {
            System.out.println("Adulto");
        } else if (idade >= 65) {
            System.out.println("Idoso");
        } else {
            System.out.println("Valor inválido");
        }
        scanner.close();
    }
}
