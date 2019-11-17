/**
  * Exercicio57.java---Fundamento da programação de computadores, Algoritmos,pascal,C/C++(Padrão ANSI)e Java.3ªedição - Página 83.
  *
  * Faça um programa que receba:
  * 	o código do estado de origem da carga de um caminhão, supondo que a digitação do código do estado seja sempre válida, isto é, um número inteiro entre 1 e 5;
  * 	o peso da carga do caminhão em toneladas;
  * 	o código da carga, supondo que a digitação do código seja sempre válida, isto é, um número inteiro entre 10 e 40.
  * :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
  * :: Código do Estado :: Imposto :: Código da Carga :: Preço por quilo ::
  * :: 	      1         ::    35%  ::     10 à 20     ::       100       ::
  * ::        2         ::    25%  ::     21 à 30     ::       250       ::
  * ::        3         ::    15%  ::     31 à 40     ::       340       ::
  * ::        4         ::    5%   ::     	      ::     	         ::
  * ::        5         ::  Isento ::     	      ::                 ::
  * :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
  * Calcule e mostre:
  * o peso da carga do caminhão convertido em quilos;
  * o preço da carga do caminhão;
  * o valor do imposto, sabendo que o imposto é cobrado sobre o preço da carga do caminhão e de-pende do estado de origem;
  * o valor total transportado pelo caminhão, preço da carga mais imposto.
  */
import java.util.Scanner;
public class Exercicio57{
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
        int CodigoDoEstado, CodigoDaCarga;
	double PesoDaCarga, PrecoDaCarga, ValImposto, ValorTotal, Aux;

            System.out.printf("informe o códido do estado: "+"\n");
	    CodigoDoEstado = entrada.nextInt();

            System.out.printf("Informe o peso da carga: "+"\n");
	    PesoDaCarga = entrada.nextDouble();

            System.out.printf("Informe o Código da carga: "+"\n");
	    CodigoDaCarga = entrada.nextInt();

                   if ((CodigoDoEstado <= 1) & (CodigoDaCarga <= 20)){
				Aux = PesoDaCarga * 100;
				ValorTotal = Aux * 0.35; 
			        System.out.println("O valor total a pagar é..." + ValorTotal + "\n");

  		   }else if ((CodigoDoEstado == 2) & (CodigoDaCarga >= 21) & (CodigoDaCarga <= 30)){
				Aux = PesoDaCarga * 250;
				ValorTotal = Aux * 0.25; 
			        System.out.println("O valor total a pagar é..." + ValorTotal + "\n");
  		   }else if ((CodigoDoEstado == 3) & (CodigoDaCarga >= 31) & (CodigoDaCarga <= 40)){
				Aux = PesoDaCarga * 340;
				ValorTotal = Aux * 0.15; 
			        System.out.println("O valor total a pagar é..." + ValorTotal + "\n");
  		   }else if ((CodigoDoEstado == 4) & (CodigoDaCarga >= 32)){
				Aux = PesoDaCarga * 340;
				ValorTotal = Aux * 0.05; 
			        System.out.println("O valor total a pagar é..." + ValorTotal + "\n");
  		   }else if ((CodigoDoEstado == 5) & (CodigoDaCarga >= 32)){
				Aux = PesoDaCarga * 340;
				ValorTotal = Aux; 
			        System.out.println("O valor total a pagar é..." + ValorTotal + "\n");
  		   }
    }
}
