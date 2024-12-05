package Aula06_VetoresEMatrizes.Exemplos;

public class Exemplo8_IteracaoBiDirecionalForEach {
    public static void main(String[] args) {
        int[][] matrizNumeros = {
                {1,2,3},
                {4,5,6},
                {7,8,9}         };

        for (int[] numero : matrizNumeros) {
            for (int i : numero) {
                System.out.println(i);
                
            }
            
        }

        String[][] matrizNomes = {{"Victor", "Laura"},{"Rodrigo", "Marli"}};
        for (String[] nome : matrizNomes) {
            for (String s : nome) {
                System.out.println(s);

            }

        }
    }
}
