package Aula06_VetoresEMatrizes.Exemplos;

public class Exemplo2_Matriz_ArrayBiDirecional {
    public static void main(String[] args) {
        int[][] matrizNumeros = new int[2][3];

        matrizNumeros[0][0] = 1;
        matrizNumeros[0][1] = 2;
        matrizNumeros[0][2] = 3;
        matrizNumeros[1][0] = 4;
        matrizNumeros[1][1] = 5;
        matrizNumeros[1][2] = 6;

        System.out.println("Valor da Matriz na posição [0][2] = "+matrizNumeros[0][2]);

        String [][] matrizNomes = new String[2][2];

        matrizNomes[0][0] = "Batata";
        matrizNomes[0][1] = "Pão";
        matrizNomes[1][0] = "Paçoca";
        matrizNomes[1][1] = "Lasanha";

        System.out.println("Valor da Matriz na posição [1][0] = "+matrizNomes[1][0]);

    }
}
