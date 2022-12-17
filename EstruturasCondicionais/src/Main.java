import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner Digitacao = new Scanner(System.in);

        //variavies
        int Idade;
        String Nome;

        //recebendo dados
        System.out.println("DIGITE SUA IDADE");
        Idade = Digitacao.nextInt();

        System.out.println("DIGITE SEU NOME");
        Nome = Digitacao.next();

        //testando se digitou um valor valido para idade
        if (Idade > 0){
            System.out.println("Nome " + Nome + " Nascido em " + (2022 - Idade));

        }else{

            System.out.println("Valor inválido para idade");
        }

    }
}