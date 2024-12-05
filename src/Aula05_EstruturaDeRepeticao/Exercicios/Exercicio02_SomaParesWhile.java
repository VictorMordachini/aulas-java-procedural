package Aula05_EstruturaDeRepeticao.Exercicios;

public class Exercicio02_SomaParesWhile {
    public static void main(String[] args) {
        int x = 0, soma = 0;
        while (x<100){
            x +=2;
            soma = soma + x;
        }
        System.out.println("O valor da soma de todos os números pares de 1 a 100 é: "+soma);
    }
}
