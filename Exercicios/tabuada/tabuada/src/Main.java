import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //inicializado o Scanner
        Scanner Digitacao = new Scanner(System.in);
        int ValorTabuada,Tabuada = 0;
        int Operacao = 0;

        System.out.println("BEM VINDO A TUABUADA");
        System.out.println("DIGITE O VALOR DA TABUADA");
        ValorTabuada = Digitacao.nextInt();
        
        System.out.println("DIGITE 1 PARA MULTIPLICACAO 2 PARA DIVISAO 3 PARA ADICAO E 4 PARA SUBTRACAO");
        Operacao = Digitacao.nextInt();
        
        System.out.println("ESTAMOS FAZENDO A TABUADA DE " + ValorTabuada);

        while (Tabuada <= 10) {

            switch (Operacao){

                case 1:
                    System.out.println(ValorTabuada + " * " + Tabuada + " = " + (ValorTabuada * Tabuada));
                    break;
                case 2:
                    System.out.println(ValorTabuada + " / " + Tabuada + " = " + (ValorTabuada / Tabuada));
                case 3:
                    System.out.println(ValorTabuada + " + " + Tabuada + " = " + (ValorTabuada + Tabuada));
                    break;
                case 4:
                    System.out.println(ValorTabuada + " - " + Tabuada + " = " + (Tabuada - ValorTabuada));
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + Operacao);
            }

            Tabuada++;
        }




  }
}