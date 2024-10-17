package Aula04_EstruturaDeDecisao.Exemplos;
import java.util.Scanner;

public class Exemplo1_IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int x = scanner.nextInt();;

        if (x >= 30)//{if e else não precisam de chaves para comandos de até 1 linha
            System.out.println("O número é maior ou igual a 30");
            //}
        else {
            System.out.println("O número é menor do que 30");
        }
        scanner.close();
    }

}
