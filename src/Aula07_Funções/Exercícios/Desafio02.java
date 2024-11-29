package Aula07_Funções.Exercícios;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
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
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 5);


        scanner.close();
    }

    static void exibirCadastro() {
        System.out.println("Exibir");

    }

    static void cadastrarUsuario() {
        System.out.println("Cadastrar");

    }

    static void atualizarUsuario() {
        System.out.println("Atualizar");

    }

    static void deletarUsuario() {
        System.out.println("Deletar");

    }

}
