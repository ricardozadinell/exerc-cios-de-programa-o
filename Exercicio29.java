
/**
  *[Exercicio29.java  ---  utilizando Seleção Aninhada ou Concatenada:]
  *
  *Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.
  */


import java.util.Scanner;
public class Exercicio29
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int Valor1,Valor2,Valor3, Resp;  

            System.out.print("Digite o primeiro número: ");
            Valor1 = entrada.nextInt();
            System.out.print("Digite o segundo número: ");
            Valor2 = entrada.nextInt();
            System.out.print("Digite o terceiro número: ");
            Valor3 = entrada.nextInt();

            if((Valor1 < Valor2) && (Valor1 < Valor3)){
                Resp = Valor3 + Valor2;
                System.out.print("O segundo e o terceiro são os maiores, a soma dos dois é ."+ Resp + "\n");                 
            } else if ((Valor2 < Valor1) && (Valor2 < Valor3)){
                Resp = Valor1 + Valor3;
                System.out.print("O primeiro e o terceiro são os maiores, a soma dos dois é ."+ Resp + "\n");                 
            }else{
                Resp = Valor2 + Valor1;
                System.out.print("O primeiro e o segundo são os maiores, a soma dos dois é ."+ Resp + "\n");                 
            }
    }
}


