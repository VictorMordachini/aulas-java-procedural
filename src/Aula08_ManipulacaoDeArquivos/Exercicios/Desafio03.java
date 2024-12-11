package Aula08_ManipulacaoDeArquivos.Exercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Desafio03 {

    static Scanner scanner = new Scanner(System.in);
    static String[] cabecalho = {"ID", "Nome", "Telefone", "E-mail"};
    static String[][] cadastro = {{"", ""}};

    public static void main(String[] args) {
        cadastro[0] = cabecalho;

        String menu = """
                _____________________________________________
                |   Escolha uma opção:                      |
                |       1- Exibir Cadastro Completo         |
                |       2- Inserir Novo Usuário             |
                |       3- Atualizar Cadastro por ID        |
                |       4- Deletar um Cadastro por ID       |
                |       5- Sair                             |
                |___________________________________________|
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
                    System.out.println("Fim do programa");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (opcao != 5);
    }

    public static void exibirCadastro() {
        StringBuilder tabela = new StringBuilder();
        for (String[] linhas : cadastro) {
            for (int colunas = 0; colunas < cadastro[0].length; colunas++) {
                int tamanhocoluna = colunas == 0 ? 5 : (colunas == 2 ? 12 : 25);
                tabela.append(String.format("%-" + tamanhocoluna + "s | ", linhas[colunas])); // Espaçamento entre as colunas
            }
            tabela.append("\n"); // Para pular a próxima linha
        }

        System.out.println(tabela);
    }

    public static void cadastrarUsuario() {
        System.out.print("Digite a quantidade de usuários que deseja cadastrar: ");
        int qtdUsuarios = scanner.nextInt();
        String[][] novaMatriz = new String[cadastro.length + qtdUsuarios][cabecalho.length];
        scanner.nextLine();

        for (int linha = 0; linha < cadastro.length; linha++) {
            novaMatriz[linha] = Arrays.copyOf(cadastro[linha], cadastro[linha].length);
        }

        System.out.println("Preencha os dados a seguir:");
        for (int linha = cadastro.length; linha < novaMatriz.length; linha++) {

            System.out.println("Cadastro da pessoa " + linha);

            System.out.println(cabecalho[0] + ": " + linha);
            novaMatriz[linha][0] = String.valueOf(linha); //Converte valor inteiro para String

            for (int coluna = 1; coluna < cabecalho.length; coluna++) {
                System.out.print(cabecalho[coluna] + ": ");
                novaMatriz[linha][coluna] = scanner.nextLine();
            }
        }
        cadastro = novaMatriz;
        salvarDadosNoArquivo();
    }

    public static void atualizarUsuario() {
        exibirCadastro();
        System.out.println("\nDigite o ID do usuário que deseja atualizar: ");
        int idEscolhido = scanner.nextInt();

        System.out.println(cabecalho[0] + ": " + idEscolhido);
        for (int coluna = 1; coluna < cabecalho.length; coluna++) {
            System.out.print(cabecalho[coluna] + ": ");
            cadastro[idEscolhido][coluna] = scanner.nextLine();
        }
        System.out.println("Usuário atualizado com sucesso!");
        exibirCadastro();
        salvarDadosNoArquivo();
    }

    public static void deletarUsuario() {

        exibirCadastro();

        System.out.println("Digite o ID do usuário que deseja deletar: ");
        int idEscolhido = scanner.nextInt();
        scanner.nextLine();

        String[][] novaMatriz = new String[cadastro.length - 1][cabecalho.length];
        novaMatriz[0] = cabecalho;
        for (int linha = 1, idNovaMatriz = 1; linha < cadastro.length; linha++) {
            if (linha == idEscolhido) {
                continue;
            }
            novaMatriz[idNovaMatriz] = Arrays.copyOf(cadastro[linha], cadastro[linha].length);
            novaMatriz[idNovaMatriz][0] = String.valueOf(idNovaMatriz);
            idNovaMatriz++;
        }

        cadastro = novaMatriz;
        salvarDadosNoArquivo();

        System.out.println("Usuário deletado com sucesso!");
        exibirCadastro();
    }

    public static void salvarDadosNoArquivo() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(""))) {
            for (String[] linha : cadastro) {
                bufferedWriter.write(String.join(",", linha) + "\n");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void carregarDadosDoArquivo() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(""))) {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
