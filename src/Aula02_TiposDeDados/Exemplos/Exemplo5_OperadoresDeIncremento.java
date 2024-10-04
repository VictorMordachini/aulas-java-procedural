package Aula02_TiposDeDados.Exemplos;

public class Exemplo5_OperadoresDeIncremento {
    public static void main(String[] args) {

        int num1 = 0;
        System.out.println("num1 = " + num1);

        num1++;
        System.out.println("num1 ++ = " + num1);

        num1 += 20;
        System.out.println("num1 += 20 = " + num1);

        num1--;
        System.out.println("num1 -- = " + num1);

        num1 -= 5;
        System.out.println("num1 -=5 = " + num1);

        num1 *= 2;
        System.out.println("num1 *=2 = " + num1);

        num1 /= 2;
        System.out.println("num1 /=2 = " + num1);

        //Incremento pós e pré fixado
        int num2 = 0;
        System.out.println("num2 = " + num2);

        num2 = num1++; //pós-fixado
        System.out.println("num2 = num1++ : " + num2 + " num1 = " + num1);

        num2 = ++num1; //pré-fixado
        System.out.println("num2 = ++num1 : " + num2 + " num1 = " + num1);
    }
}
