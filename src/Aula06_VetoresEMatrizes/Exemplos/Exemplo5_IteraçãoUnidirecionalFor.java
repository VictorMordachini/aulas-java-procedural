package Aula06_VetoresEMatrizes.Exemplos;

public class Exemplo5_IteraçãoUnidirecionalFor {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Valor da posição "+i+" = "+numeros[i]);
        }

        String[] nomes = {"Nesk", "Paluh", "Zigueira"};
        for (int i = 0; i < nomes.length; i++){
            System.out.println("Nome na posição "+i+" = "+nomes[i]);

        }
    }
}
