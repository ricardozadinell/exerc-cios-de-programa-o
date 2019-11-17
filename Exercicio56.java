/**
  *Exercicio56.java
  *
  *Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a tabuada de 1 a 10 do valor lido.
  */

import java.util.Scanner;
public class Exercicio56
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int Val, Tab, Resp;

            System.out.printf("Informe o valor a ser Multiplicado:"+"\n");
	    Val = entrada.nextInt();

            System.out.printf("Por qual valor da tabuada?"+"\n");
	    Tab = entrada.nextInt();

                   if (Val <= 10 ){
				Resp = Val * Tab;
			        System.out.println("A resposta é: "+ Resp + "\n");
			        
                   } else{
			        System.out.println("POR FAVOR: Esse sistema só multiplica valores menores ou iguais a 10..."+ "\n");

  		   }
    }
}
