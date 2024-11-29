package Aula06_VetoresEMatrizes.Exercícios;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de usuários que deseja cadastrar: ");
        int qtdUsuarios = scanner.nextInt();
        scanner.nextLine();

        String[] cabecalho = {"ID", "Nome", "Telefone", "E-mail"};
        String[][] cadastro = new String[qtdUsuarios + 1][cabecalho.length];
        cadastro[0] = cabecalho;

        for (int linha = 1; linha <= qtdUsuarios; linha++) {
            System.out.println("Cadastro da pessoa " + linha);
            System.out.println("ID: " + linha);
            cadastro[linha][0] = String.valueOf(linha);
            System.out.print("Nome: ");
            cadastro[linha][1] = scanner.nextLine();
            System.out.print("Telefone: ");
            cadastro[linha][2] = scanner.nextLine();
            System.out.print("E-mail: ");
            cadastro[linha][3] = scanner.nextLine();

        }

        String tabela = "";
        for (String[] linhas : cadastro) {
            for (int coluna = 0; coluna < cadastro[0].length; coluna++) {
                tabela += linhas[coluna] + "\t\t";

            }
            tabela += "\n";
        }
        System.out.println(tabela);

        scanner.close();
    }
}
