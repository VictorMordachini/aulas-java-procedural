package Aula04_EstruturaDeDecisao.Exemplos;

import java.util.Scanner;

public class Exemplo2_Semaforo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a cor do semáforo: ");
        String corSemaforo = scanner.next();

        // ==  não serve pois ele compara endereços e String é um objeto; Usar .equals()
        // String é sensível a letras maiúsculas e minúsculas
        if (corSemaforo.equals("verde") || corSemaforo.equals("Verde")) {
            System.out.println("Siga!");
        } else if (corSemaforo.equals("amarelo") || corSemaforo.equals("Amarelo")) {
            System.out.println("Atenção!");
        } else if (corSemaforo.equals("vermelho") || corSemaforo.equals("Vermelho")) {
            System.out.println("Pare!");
        } else {
            System.out.println("Nunca vi semáforo com a cor " + corSemaforo);
        }
        scanner.close();
    }
}
