/**
  *[Exercicio37.java  ---  utilizando Seleção Aninhada ou Concatenada:]
  *
  * Uma fruteira está vendendo frutas com a seguinte tabela de preços:
  *             :---------------------:---------------------------:
  *		:     Até 5 Kg        :     Acima de 5 Kg         :
  *  :----------:---------------------:---------------------------:
  *  :Morango   :     R$ 2,50 por Kg  :     R$ 2,20 por Kg        :
  *  :----------:---------------------:---------------------------:
  *  :Maçã      :     R$ 1,80 por Kg  :     R$ 1,50 por Kg        :
  *  :----------:---------------------:---------------------------:
  * Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá
  * ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de
  * morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
  */
import java.util.Scanner;
public class Exercicio37
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        double Tipo, Qtd, Resp;
            System.out.println(".........Digigte1 para MORANGO......"); 
            System.out.println("....................OU.............."); 
            System.out.println(".........Digigte 2 para MAÇÃ........"); 
            Tipo = entrada.nextDouble();          

            System.out.printf("Informe a quantidade em Kg que deseja comprar :"+"\n");
	    Qtd = entrada.nextDouble();

                   if (Tipo <=1){ //Tipo escolhido:  Morango
		                if(Qtd <=5){ //Quantidade inferior a 5 kg * 2,5
					Resp = 	Qtd * 2.5;
				        System.out.print("O valor total a pagar é: "+ Resp + "\n");
				}else if(Qtd >= 6){ //Quantidade inferior a 5 kg * 2,2
					Resp = 	Qtd * 2.2;
				        System.out.print("O valor total a pagar é: "+ Resp + "\n");
				}
                   } else if (Tipo >= 2){ //Tipo escolhido:  Maça
		                if(Qtd <=5){ //Quantidade inferior a 5 kg * 1,8
					Resp = 	Qtd * 1.8;
				        System.out.print("O valor total a pagar é: "+ Resp + "\n");
				}else if(Qtd >= 6){ //Quantidade inferior a 5 kg * 1,5
					Resp = 	Qtd * 1.5;
				        System.out.print("O valor total a pagar é: "+ Resp + "\n");
				}
		  }
    }
}
