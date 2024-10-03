package Aula02_TiposDeDados.Exemplos;

public class Exemplo2 {
    public static void main(String[] args) {
        int total, numero1 = 5, numero2 = 7;

        total = numero1 + numero2;
        System.out.println("Soma = " + total);

        total = numero1 - numero2;
        System.out.println("Subtração = " + total);

        total = numero1 * numero2;
        System.out.println("Multiplicação = " + total);

        float totalFLoat, numero1Float = numero1;
        totalFLoat = numero1Float / numero2;
        System.out.println("Divisão = " + totalFLoat);

        float modulo = numero1Float % numero2;
        System.out.println("O resto da divisão de " + numero1Float + " por " + numero2 + " é igual a: " + modulo);
    }
}
