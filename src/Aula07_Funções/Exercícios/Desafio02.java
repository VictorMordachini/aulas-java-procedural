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

        System.out.println(menu);
        int opcao = scanner.nextInt();
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
                break;
            default:
                System.out.println("Opção inválida!");

        }

        scanner.close();
    }

    static void exibirCadastro() {

    }

    static void cadastrarUsuario() {

    }

    static void atualizarUsuario() {

    }

    static void deletarUsuario() {

    }

}
