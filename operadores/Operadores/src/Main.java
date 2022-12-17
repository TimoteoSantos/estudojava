//importando dependencias
import java.util.Scanner;

//classe principal main
public class Main {

    //metodo principal
    public static void main(String[] args){
        //inicializando a classe Scanner
        Scanner digitacao = new Scanner(System.in);

        //operadores de atribuiçao
        // o operador = atribui um valor a uma variavel

        //operador de atribuicao =
        String Nome = "Timóteo jose dos santos";
        System.out.println(Nome);

        //operadores aritmeticos

        // operador de adicao
        float Salario = 1200 + 500;
        System.out.println(Salario);

        //operador de subtracao
        float SalarioNovo = 1200 - 500;
        System.out.println(SalarioNovo);

        //operador de multiplicacao
        float SalarioAjustado = 1200 * 5;
        System.out.println(SalarioAjustado);

        //operador de divisao
        float MediaSalarial = 12000 / 4;
        System.out.println(MediaSalarial);


        /*operadores relacionais
        > maior que
        < menor que
        >= maior ou igual
        <= menor ou igual
        == igual
        != diferente     */

        /* operadores logicos

        E && se todos os testes forem true
        OU || se um ou o outro teste for true
        NAO ! nega inverte o teste verdadeiro fica falso e falso verdadeiro
         */

        /*precedencia de operadores
        1. Os fatoriais
        2. As funções, as potências e as raizes quadradas
        3. Multiplicações e divisões
        4. As adições e subtrações.
        */


    }
}