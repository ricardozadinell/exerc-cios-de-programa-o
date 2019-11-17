/**
  *[Exercicio30.java  ---  utilizando Seleção Aninhada ou Concatenada:]
  *
  *Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem crescente.
  */

import java.util.Scanner;
public class Exercicio30
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int Valor1, Valor2, Valor3;  

            System.out.print("Digite o primeiro Valor: ");
            Valor1 = entrada.nextInt();

            System.out.print("Digite o segundo Valor: ");
            Valor2 = entrada.nextInt();

            System.out.print("Digite o terceiro Valor: ");
            Valor3 = entrada.nextInt();

                  if ((Valor1 < Valor2) && (Valor2 < Valor3)){
                System.out.print("A ordem crescente é: "+ Valor1 +", "+ Valor2 +", "+ Valor3 + "\n");
            }else if ((Valor1 < Valor3) && (Valor3 < Valor2)){
                System.out.print("A ordem crescente é: "+ Valor1 +", "+ Valor3 +", "+ Valor2 + "\n");
            }else if ((Valor2 < Valor1) && (Valor1 < Valor3)){
                System.out.print("A ordem crescente é: "+ Valor2 +", "+ Valor1 +", "+ Valor2 + "\n");
            }else if ((Valor2 < Valor3) && (Valor3 < Valor1)){
                System.out.print("A ordem crescente é: "+ Valor2 +", "+ Valor3 +", "+ Valor2 + "\n");
            }else if ((Valor3 < Valor1) && (Valor1 < Valor2)){
                System.out.print("A ordem crescente é: "+ Valor3 +", "+ Valor1 +", "+ Valor2 + "\n");                 
            }
    }
}

