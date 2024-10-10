package Aula02_TiposDeDados.Exemplos;
import java.util.Scanner;

public class Exemplo8_UsoDeScanner {
    public static void main(String[] args) {
        String texto = "Este texto está na primeira linha\nEste texto está na segunda linha" +
                "\n\t este texto esta na terceira linha e com tabulação";
        System.out.println(texto);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); //Esse comando serve para consumir o \n
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Seu nome é "+nome+ " e sua idade é "+idade);

        scanner.close();

    }
}
