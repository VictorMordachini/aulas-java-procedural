package Aula04_EstruturaDeDecisao.Exercícios;

import java.util.Scanner;

public class Exercício04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vendas, comissao;
        System.out.print("Digite o valor das vendas(R$): ");
        vendas = scanner.nextDouble();

        if (vendas < 1000) {
            comissao = 0.05 * vendas;
            System.out.println("Sua comissão é: R$" + comissao);
        } else if (vendas >= 1000 && vendas <= 5000) {
            comissao = 0.1 * vendas;
            System.out.println("Sua comissão é: R$" + comissao);
        } else if (vendas > 5000) {
            comissao = 0.15 * vendas;
            System.out.println("Sua comissão é: R$" + comissao);
        }

        scanner.close();
    }
}
