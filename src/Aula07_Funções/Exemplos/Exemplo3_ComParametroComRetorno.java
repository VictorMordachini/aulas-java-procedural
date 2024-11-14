package Aula07_Funções.Exemplos;

import java.util.Scanner;

public class Exemplo3_ComParametroComRetorno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int retorno;
        System.out.print("Digite dois números inteiros: ");
        retorno = funcaoComParametroComRetorno(scanner.nextInt(), scanner.nextInt());
        System.out.println("Soma = " + retorno);

        scanner.close();

    }

    private static int funcaoComParametroComRetorno(int num1, int num2) {
        return num1 + num2;
    }
}
