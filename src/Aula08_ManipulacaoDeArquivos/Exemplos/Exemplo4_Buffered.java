package Aula08_ManipulacaoDeArquivos.Exemplos;

import java.io.*;

public class Exemplo4_Buffered {
    public static void main(String[] args) {


        File arquivo = new File("src\\Aula08_ManipulacaoDeArquivos\\Exemplos\\arquivo.txt");

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(arquivo, true));
            bufferedWriter.write("Novo texto a ser gravado no arquivo");
            bufferedWriter.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo));
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
