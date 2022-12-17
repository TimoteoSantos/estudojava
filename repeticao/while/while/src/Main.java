import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner digitacao = new Scanner(System.in);
        int i = 10;

        //ESTRUTURAS DE REPETICAO
        do {

            //System.out.println(i);
            if (i > 0 ){
                System.out.println("aqui é maior que 5 = " + i);
            }
            i--;

        } while (i < 10); //observe que usando while nao seria possivel fazer essa repeticao
                        // isso porque na primeira vez o i nao seria menor que 10 e nao atenderia
                        // a condição sendo assim nao farias nenhuma repeticao.
                        // por isso o uso de do while porque na primeira vez ele nao execulta nenhuma verificação

        //WHILE SO É EXECULTADO SE ATENDER A CONDICAO
        //DIFERENTE DO DO WHILE ELE NAO VAI EXECULTAR UMA VEZ E ANALIZAR
        //SE ATENDE ELE SO VAI EXECULTAR SE ATENDER

        i = 0;//zerando o valor de i
        while (i < 100){

            System.out.println(i);
            i++;

        }

        //ESTRUTURA FOR
        /*
        * a estrura for permite que facamos repeticao quando conhecemos os valores a serem
        *repetidos
        * */
        for (i = 0; i <= 10;i++){

                if(i <= 5){
                    System.out.println("ESSE NUMERO É MENOR QUE CINDO " + i);
                }else{
                    System.out.println("ESSE NUMERO É MAIOR QUE CINDO " + i);
          }
        }


//final da classe
  }
}