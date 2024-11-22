package Aula08_ManipulacaoDeArquivos.Exemplos;

import java.io.File;
import java.io.IOException;

public class Exemplo1_CriarArquivoRefAbsoluta {
    public static void main(String[] args) {

        File arquivo = new File("C:\\Users\\Aluno\\Documents\\VictorMordachini\\src\\Aula08_ManipulacaoDeArquivos\\Exemplos\\arquivo.txt");

        if (arquivo.exists()) {
            System.out.println("O arquivo já existe!");
        } else {
            try {
                if (arquivo.createNewFile()) {
                    System.out.println("Arquivo criado com sucesso! " + arquivo.getName());
                } else {
                    System.out.println("Falha ao criar o arquivo");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
