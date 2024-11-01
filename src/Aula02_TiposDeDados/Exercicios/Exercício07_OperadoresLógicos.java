package Aula02_TiposDeDados.Exercicios;

import java.util.Scanner;

public class Exercício07_OperadoresLógicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean cond1, cond2, cond3;
        System.out.print("Digite três números inteiros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        cond1 = num1 != num3;
        System.out.println("cond1: "+num1+" != "+num3+": "+cond1);
        cond2 = num3 > num1;
        System.out.println("cond2: "+num3+" > "+num1+": "+cond2);
        cond3 = num2 >= num1;
        System.out.println("cond3: "+num2+" >= "+num1+": "+cond3);

        boolean comb = cond1 && cond2 || cond3;
        System.out.println("cond1 && cond2 || cond3 = "+comb);
        comb = cond1 || cond2 && cond3;
        System.out.println("cond1 || cond2 && cond3 = "+comb);
        comb = cond1 && cond2 && cond3;
        System.out.println("cond1 && cond2 && cond3 = "+comb);
        comb = cond1 || cond2 || cond3;
        System.out.println("cond1 || cond2 || cond3 = "+comb);


        scanner.close();
    }
}
