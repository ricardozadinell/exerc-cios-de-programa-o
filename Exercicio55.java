/**
  * Exercicio55.java
  *
  *Escreva um algoritmo que calcule e imprima a tabuada do 8 (1 a 10)
  */
import java.util.Scanner;
public class Exercicio55
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int Val, Resp;

            System.out.printf("Informe o valor a ser calculado:"+"\n");
	    Val = entrada.nextInt();

                   if (Val <= 10 ){
		      Resp = Val * 8;
			        System.out.println("A resposta é:"+ Resp + "\n");
			        
                   } else{
		      Resp = Val * 8;
 			        System.out.print("O valor informado é maior que dez "+ Resp + "\n");
  		   }
    }
}
