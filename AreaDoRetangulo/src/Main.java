import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        //iniclizando o Scanner
        Scanner Digitacao = new Scanner(System.in);

        //variaveis do tipo real
        float Base,Altura,Resultado;

        System.out.println("DIGITE O VALOR DA BASE");
        //recebendo o valor digitado na variavel Base
        Base = Digitacao.nextFloat();
        //recebendo o valor digitado na variavel Altura
        System.out.println("DIGITE O VALOR DA ALTUURA");
        Altura = Digitacao.nextFloat();

        //fazendo o processamento
        Resultado = Base * Altura;
        //Exibir o resultado
        System.out.println("O valor da área do retangulo é de " + Resultado);

    }
}