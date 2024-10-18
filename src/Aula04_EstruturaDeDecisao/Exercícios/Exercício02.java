package Aula04_EstruturaDeDecisao.Exercícios;

import java.util.Scanner;

public class Exercício02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto 1(R$): ");
        double p1 = scanner.nextDouble();
        System.out.print("Digite o valor do produto 2(R$): ");
        double p2 = scanner.nextDouble();
        System.out.print("Digite o valor do produto 3(R$): ");
        double p3 = scanner.nextDouble();

        double valorFinal = p1 + p2 + p3;
        double desconto = 0.1 * valorFinal;
        double pagamento;

        if (valorFinal >= 100) {
            pagamento = valorFinal - desconto;
            System.out.println("O valor a ser pago é: R$" + pagamento);

        } else {
            pagamento = valorFinal;
            System.out.println("O valor a ser pago é: R$" + pagamento);

        }


        scanner.close();
    }
}
