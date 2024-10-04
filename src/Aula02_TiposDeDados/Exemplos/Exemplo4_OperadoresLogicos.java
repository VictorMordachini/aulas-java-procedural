package Aula02_TiposDeDados.Exemplos;

public class Exemplo4_OperadoresLogicos {
    public static void main(String[] args) {

        int num1 = 9, num2 = 7, num3 = 5, num4 = 3;
        boolean resposta;

        resposta = num1 < num2 && num3 != num4;

        System.out.println(num1 + " < " + num2 + " && (e) " +
                num3 + " != " + num4 + " = " + resposta);

        resposta = num1 < num2 || num3 != num4;

        System.out.println(num1 + " < " + num2 + " || (ou) " +
                num3 + " != " + num4 + " = " + resposta);

        resposta = !(num1 == num2);
        System.out.println(num1 + " == " + num2 + " = " + resposta);

    }
}
