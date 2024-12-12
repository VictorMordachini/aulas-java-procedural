package Aula08_ManipulacaoDeArquivos.Exercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Exercicio01_EscreverTXT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] alunos = new String[5];


        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("alunos.txt"))) {
            for (int i = 0; i < 5; i++) {
                System.out.print("Digite o nome de um aluno: ");
                alunos[i] = scanner.nextLine();
                bufferedWriter.write(alunos[i] + "\n");
            }


        } catch (Exception e) {
            throw new RuntimeException();

        }
        scanner.close();

    }
}
