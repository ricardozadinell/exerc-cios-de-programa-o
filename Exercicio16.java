/**
  * [Exercicio16.java  ---  estrutura de Seleção e Operadores Relacionais: ]
  *
  *As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem
  *compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e
  *escreva o custo total da compra.
  */

import java.util.Scanner;
public class Exercicio16
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        double QuantidadeComprada, Resp;

                System.out.println("------------------------OFERTA:-------------------------");
                System.out.println("--Acima de 12 unidade, valor unidade R$ 1,00 cada-------");
                System.out.println("--Abaixo dessa quantidade, o valor é R$ 1,30 cada-------");
                System.out.println("--------------------------------------------------------");

        System.out.print("Digite a quantidade de maças (em unidades): ");
        QuantidadeComprada = entrada.nextDouble();

            if(QuantidadeComprada <= 11){
                Resp = QuantidadeComprada * 1.3;
                System.out.print("O total a ser págo é R$: "+ Resp +"."+"\n");
            }else{
                Resp = QuantidadeComprada * 1.0;
                System.out.print("O total a ser págo é R$: "+ Resp +"."+"\n");
            }
    }

}
