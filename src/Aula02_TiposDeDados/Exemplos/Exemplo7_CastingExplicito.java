package Aula02_TiposDeDados.Exemplos;
import java.util.Scanner;

public class Exemplo7_CastingExplicito {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");

        int varInt = scanner.nextInt();
        short varShort = (short) varInt;
        byte varByte = (byte) varShort; //limite = 127

        System.out.println("O número inteiro digitado é: "+ varInt);
        System.out.println("varShort é igual a: "+varShort);
        System.out.println("varByte é igual a: "+varByte);

        System.out.print("Digite um número decimal: ");
        double varDouble = scanner.nextDouble();
        float varFloat = (float) varDouble;
        System.out.println("O número decimal digitado é: "+ varDouble);
        System.out.println("varFloat é igual a: "+varFloat);

        scanner.close();
    }
}
