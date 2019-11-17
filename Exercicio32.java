/**
  *[Exercicio32.java  ---  utilizando Seleção Aninhada ou Concatenada:]
  *
  *Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome
  *do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.
  */

import java.util.Scanner;
public class Exercicio32
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int Num1, Num2;  
        String Time1, Time2;
 
            System.out.printf("Informe o nome do TIME nº1 :"+"\n");
            Time1 = entrada.nextLine();          
            System.out.printf("Informe o nome do TIME nº2 :"+"\n");
            Time2 = entrada.nextLine();

            System.out.printf("Informe a pontuação do TIME nº1 :"+"\n");
            Num2 = entrada.nextInt();
            System.out.printf("Informe a pontuação do TIME nº1 :"+"\n");
            Num1 = entrada.nextInt();

                   if ( Num1 > Num2 ){
               System.out.print("O time vencedor foi o time " + Time1 + ", com "+ Num1 + " pontos."+"\n");
            } else if ( Num2 > Num1 ){
               System.out.print("O time vencedor foi o time " + Time2 + ", com "+ Num2 + " pontos."+"\n");
            } else if ( Num1 == Num2){
               System.out.print("Os dois times empataram com "+ Num1 + "pontos."+"\n");
            }
    }
}
