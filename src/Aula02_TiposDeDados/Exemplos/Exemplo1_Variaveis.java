package Aula02_TiposDeDados.Exemplos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exemplo1_Variaveis {
    public static void main(String[] args) {
        int anoNasc;
        double peso;
        char sexo;
        boolean canhoto;
        byte idade = 19;
        float altura = 1.67F;

        char letra = 86;

        anoNasc = 2005;
        peso = 55.7;
        sexo = 'M';
        canhoto = false;

        System.out.println("anoNasc: " + anoNasc + " peso: " + peso + " sexo: " + sexo + " canhoto: " + canhoto + " idade: " + idade + " altura: " + altura);
        System.out.println("letra: " + letra);
    }
}
