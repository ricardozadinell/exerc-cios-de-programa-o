/**
  * Exercicio58.java ---Fundamento da programação de computadores, Algoritmos,pascal,C/C++(Padrão ANSI)e
  * -Java.3ªedição - Página 84.
  *
  * Faça um programa que receba o salário base e o tempo de serviço de um funcionário. Calcule e mostre:
  *     O imposto, conforme a tabela a seguir:
  *  ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
  *  :: Salário Base  						::  % Sobre o Salário Base ::
  *  :: < R$ 200,00						::    Isento               ::
  *  :: Entre R$ 200,00 (inclusive) e R$ 450,00 (inclusive)	::    3%                   ::
  *  :: Entre R$ 450,00 e R$ 700,00				::    8%                   ::
  *  :: >= R$ 700,00						::    12%                  ::
  *  ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
  *
  *     A gratificação, de acordo com a tabela a seguir:
  *  ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
  *  ::       Salário Base          ::  Tempo de serviço        ::    Gratificação         ::
  *  ::       Superior a R$ 500,00  ::  Até 3 anos              ::    20                   ::
  *  ::                             ::  Mais de 3 anos          ::    30                   ::
  *  ::.............................::..........................::.........................::
  *  ::       Até R$ 500,00         ::  Até 3 anos              ::    23                   ::
  *  ::                             ::  Entre 3 e 6 anos        ::    35                   ::
  *  ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
  *  
  *  O salário líquido, ou seja, salário base menos imposto mais gratificação;
  *  A categoria, que está na tabela a seguir:
  *  ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
  *  ::      SALÁRIO LÍQUIDO                                    ::  ClASSIFICAÇÃO          ::
  *  ::      Até R$ 350,00                                      ::  A                      ::
  *  ::      Entre R$ 350,00 e R$ 600,00                        ::  B                      ::
  *  ::      De R$ 600,00 para cima                             ::  C                      ::
  *  ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
  */

import java.util.Scanner;
public class Exercicio58{
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
	double salarioBase, tempoDeServico, Imposto, gratificacao, SalarioLiquido, categoria;

            System.out.printf("Informe o salário base do colaborador: "+"\n");
	    salarioBase = entrada.nextDouble();

            System.out.printf("Informe o tempo de serviço do colaborador: "+"\n");
	    tempoDeServico = entrada.nextDouble();
		   Imposto = 0;
		   gratificacao = 0;
		   categoria = 0;
                   if (salarioBase < 200){
				Imposto = salarioBase; /*isento..*/
  		   }else if ((salarioBase >= 200) & (salarioBase < 450)){
				Imposto = salarioBase * 0.3; /* 3% */
  		   }else if ((salarioBase > 450) & (salarioBase < 700)){
				Imposto = salarioBase * 0.8; /* 8% */
  		   }else if (salarioBase >= 700){
				Imposto = salarioBase * 0.12; /* 12%*/
  		   }
		   if (salarioBase <= 500){
			if(tempoDeServico <= 3){
			gratificacao =	salarioBase * 0.23;
			}else if(tempoDeServico >= 3){
			gratificacao =	salarioBase * 0.35;
			}
		   }else if (salarioBase > 500){
			if(tempoDeServico <= 3){
			gratificacao =	salarioBase * 0.20;
			}else if(tempoDeServico >= 3){
			gratificacao =	salarioBase * 0.30;
			}
		   }
		   SalarioLiquido = (salarioBase - Imposto) + gratificacao;
   	           System.out.println("O salário liquido do colaborador é..." + SalarioLiquido + "\n");

	           if(SalarioLiquido < 350){
   	           	System.out.printf("O salário do colaborador esta na categoria  A " + "\n");
		   }else if ((SalarioLiquido >= 350) & (SalarioLiquido < 600)){
   	           	System.out.printf("O salário do colaborador esta na categoria  B " + "\n");
		   }else if (SalarioLiquido >= 600){
   	           	System.out.printf("O salário do colaborador esta na categoria  C " + "\n");
		   }
    }
}
