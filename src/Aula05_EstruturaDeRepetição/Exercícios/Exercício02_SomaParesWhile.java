package Aula05_EstruturaDeRepetição.Exercícios;

public class Exercício02_SomaParesWhile {
    public static void main(String[] args) {
        int x = 0, soma = 0;
        while (x<100){
            x +=2;
            soma = soma + x;
        }
        System.out.println("O valor da soma de todos os números pares de 1 a 100 é: "+soma);
    }
}
