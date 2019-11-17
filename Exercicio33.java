/**
  *[Exercicio33.java  ---  utilizando Seleção Aninhada ou Concatenada:]
  *
  *Ler dois valores e imprimir uma das três mensagens a seguir:
  * - Números iguais’, caso os números sejam iguais
  * - Primeiro é maior’, caso o primeiro seja maior que o segundo;
  * - Segundo maior’, caso o segundo seja maior que o primeiro.
  */


import java.util.Scanner;
public class Exercicio33
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int Num1, Num2;  

            System.out.printf("Informe o 1º numero :"+"\n");
            Num1 = entrada.nextInt();
            System.out.printf("Informe o 2º numero :"+"\n");
            Num2 = entrada.nextInt();

                   if ( Num1 > Num2 ){
               System.out.println("Primeiro é maior");
            } else if ( Num2 > Num1 ){
               System.out.println("Segundo maior");
            } else if ( Num1 == Num2){
               System.out.println("Números iguais");
            }
    }
}
