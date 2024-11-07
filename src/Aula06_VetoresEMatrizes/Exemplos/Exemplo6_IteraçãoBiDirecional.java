package Aula06_VetoresEMatrizes.Exemplos;

public class Exemplo6_IteraçãoBiDirecional {
    public static void main(String[] args) {
        int[][] matrizNumeros = {
                {1,2,3},
                {4,5,6},
                {7,8,9}         };

        for (int linhas = 0; linhas < matrizNumeros.length; linhas++) {
            for (int colunas = 0; colunas < matrizNumeros[linhas].length; colunas++) {
                System.out.println("Elemento na posição ["+linhas+"]["+colunas+"] = "+matrizNumeros[linhas][colunas]);
                
            }
            
        }

        String[][] matrizNomes = {{"Victor", "Laura"},{"Rodrigo", "Marli"}};
        for (int linhas = 0; linhas < matrizNomes.length; linhas++) {
            for (int colunas = 0; colunas < matrizNomes[linhas].length; colunas++) {
                System.out.println("Nome na posição ["+linhas+"]["+colunas+"] = "+matrizNomes[linhas][colunas]);

            }

        }
    }
}
