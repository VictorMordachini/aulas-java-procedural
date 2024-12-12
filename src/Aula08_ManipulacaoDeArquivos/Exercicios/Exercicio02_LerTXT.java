package Aula08_ManipulacaoDeArquivos.Exercicios;

import java.io.BufferedReader;
import java.io.FileReader;

public class Exercicio02_LerTXT {
    public static void main(String[] args) {
        String[] linha = new String[5];
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("alunos.txt"))) {
            int contaLinhas = 0;
            while ((linha[contaLinhas] = bufferedReader.readLine()) != null) {
                System.out.println("Aluno " + contaLinhas + " : " + linha[contaLinhas]);
                contaLinhas++;
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
