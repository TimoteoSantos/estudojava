import java.net.StandardSocketOptions;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //esse é um tipo de dado objeto
        Scanner dg = new Scanner(System.in);

        //variaveis e tipos de dados

        //tipo de dado alfanumerico
        String nome = "timoteo";
        System.out.println("Nome do cliente" + nome);

        //tipo de dado inteiro com ate 127 caracteres
        byte idade = 12;
        System.out.println("Idade" + idade);

        //tipo de dado para numeros inteiros maiores que 127
        int populacao = 120000000;
        System.out.println("A quantidade de habitantes na cidade onde ele mora " + populacao);

        //tipo de dados para numeros inteiros longos
        long VelocidadeDaLuz = 9000000000000000000L;
        System.out.println(VelocidadeDaLuz);

        //tipos de dados reais

        //tipo de dado real de baixa precisao
        float Salario = 1500.25f;
        System.out.println("O salario foi de " + Salario);

        //tipo de dado de alta precisao
        double Saldo = 2500.75d;
        System.out.println("O saldo de sua conta é de " + Saldo);

        //dados de valor logico
        boolean Votar = false;
        System.out.println("Estatus da ultima votação " + Votar);

    }
}