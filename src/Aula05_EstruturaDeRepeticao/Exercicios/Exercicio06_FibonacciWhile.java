package Aula05_EstruturaDeRepeticao.Exercicios;

public class Exercicio06_FibonacciWhile {
    public static void main(String[] args) {
        int anterior = 1, atual = 1, contador = 0;

        while (contador < 10){
            System.out.println(anterior);
            contador ++;
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;

        }


    }
}
