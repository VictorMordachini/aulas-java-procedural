package Aula05_EstruturaDeRepetição.Exercícios;

import java.util.Scanner;

public class Exercício04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        boolean primo = true;

        for (int i = 2; i < numero-1 ; i++) {
            if (numero % i == 0){
                primo = false;
                break;
            }

        }if (!primo){
            System.out.println(numero+" Não é número primo.");
        }else {
            System.out.println(numero+" É um número primo.");
        }


        scanner.close();

    }
}
