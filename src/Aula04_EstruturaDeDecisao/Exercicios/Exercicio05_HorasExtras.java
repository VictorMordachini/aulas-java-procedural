package Aula04_EstruturaDeDecisao.Exercicios;

import java.util.Scanner;

public class Exercicio05_HorasExtras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double horasTrabalhadas, valorHora, horasExtras, valorExtras, valorPago;
        System.out.println("Digite quantas horas você trabalhou: ");
        horasTrabalhadas = scanner.nextDouble();
        System.out.println("Digite o valor da sua hora(R$): ");
        valorHora = scanner.nextDouble();
        valorExtras = (0.5 * valorHora) + valorHora;
        if (horasTrabalhadas > 40) {
            horasExtras = horasTrabalhadas - 40;
            valorPago = horasExtras * valorExtras;
            System.out.println("Valor a ser pago: R$" + valorPago);
        } else {
            System.out.println("Você não tem horas extras");
        }


        scanner.close();

    }
}
