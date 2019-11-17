/**
  * [Exercicio20.java  ---  estrutura de Seleção e Operadores Relacionais: ]
  *
  *Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.
  */


import java.util.Scanner;
public class Exercicio20
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int Num1, Num2;

        System.out.print("Digite o primeiro número: ");
        Num1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        Num2 = entrada.nextInt();

            if(Num1 > Num2){
                System.out.print("A ordem crescente é: "+ Num1 +","+Num2+"\n"); 
            }else if(Num1 < Num2){
                System.out.print("A ordem crescente é: "+ Num2 +","+Num1+"\n"); 
            }else{
                System.out.print("Os valores são iguais: "+ Num1 +"\n");            
            }
    }

}
