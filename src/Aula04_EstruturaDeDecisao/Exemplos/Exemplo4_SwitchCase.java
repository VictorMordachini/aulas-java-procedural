package Aula04_EstruturaDeDecisao.Exemplos;

import java.util.Scanner;

//Switch só aceita int e string
//Somente comparação (igual a)

public class Exemplo4_SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a cor do semáforo: ");
        String corSemaforo = scanner.nextLine();
        switch (corSemaforo) {
            case "verde", "Verde":
                System.out.println("Siga!");
                break; // se tirar o break ele executa a próxima opção também
            case "amarelo", "Amarelo":
                System.out.println("Atenção!");
                break;
            case "vermelho", "Vermelho":
                System.out.println("Pare!");
                break;
            default:
                System.out.println("Nunca vi semáforo com a cor " + corSemaforo);
        }


        scanner.close();

    }
}
