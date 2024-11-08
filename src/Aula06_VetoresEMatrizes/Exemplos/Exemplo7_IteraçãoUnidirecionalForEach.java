package Aula06_VetoresEMatrizes.Exemplos;

public class Exemplo7_IteraçãoUnidirecionalForEach {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};

        for (int numero : numeros) {
            System.out.println(numero);
        }

        String[] nomes = {"Nesk", "Paluh", "Zigueira"};
        for (String nome : nomes){
            System.out.println(nome);

        }
    }
}
