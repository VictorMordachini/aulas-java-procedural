package Aula07_Funcoes.Exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio02 {
    static Scanner scanner = new Scanner(System.in);
    static String[] cabecalho = {"ID", "Nome", "Telefone", "E-mail"};
    static String[][] cadastro = {{"", ""}};

    public static void main(String[] args) {

        cadastro[0] = cabecalho;

        String menu = """
                ____________________________________________
                |  Escolha uma opção:                      |
                |    1 - Exibir Cadastro Completo          |
                |    2 - Inserir novo usuário              |
                |    3 - Atualizar cadastro por id         |
                |    4 - Deletar um cadastro por id        |
                |    5 - Sair                              |
                |__________________________________________|
                """;
        int opcao;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    exibirCadastro();
                    break;
                case 2:
                    cadastrarUsuario();
                    break;
                case 3:
                    atualizarUsuario();
                    break;
                case 4:
                    deletarUsuario();
                    break;
                case 5:
                    System.out.println("Fim de programa!");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 5);


    }

    static void exibirCadastro() {
        String tabela = "";
        for (String[] linhas : cadastro) {
            for (int coluna = 0; coluna < cadastro[0].length; coluna++) {
                tabela += linhas[coluna] + "\t\t";

            }
            tabela += "\n";
        }
        System.out.println(tabela);


    }

    static void cadastrarUsuario() {
        System.out.print("Digite a quantidade de usuários que deseja cadastrar: ");
        int qtdUsuarios = scanner.nextInt();
        scanner.nextLine();
        String[][] novaMatriz = new String[cadastro.length + qtdUsuarios][cabecalho.length];
        for (int linha = 0; linha < cadastro.length; linha++) {
            novaMatriz[linha] = Arrays.copyOf(cadastro[linha], cadastro[linha].length);

        }

        System.out.println("Preencha os dados a seguir: ");
        for (int linha = cadastro.length; linha < novaMatriz.length; linha++) {
            System.out.println(cabecalho[0] + " - " + linha);
            novaMatriz[linha][0] = String.valueOf(linha); //Converte valor inteiro para String
            for (int coluna = 1; coluna < cabecalho.length; coluna++) {
                System.out.print(cabecalho[coluna] + ": ");
                novaMatriz[linha][coluna] = scanner.nextLine();

            }

        }
        cadastro = novaMatriz;
    }

    static void atualizarUsuario() {


    }

    static void deletarUsuario() {


    }

}
