/** 
  *[Exercicio42.java  ---  utilizando Estruturas de Repetição: Repita e Enquanto:]
  *
  * Escreva um algoritmo para ler 2 valores e se o segundo valor informado for ZERO, deve ser lido
  * um novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero e imprimir o resultado
  * da divisão do primeiro valor lido pelo segundo valor lido. (utilizar a estrutura REPITA).
  *
  */
import java.util.Scanner;
public class Exercicio44 {
      public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

	    double Valor1, Valor2, Resp;
	    Valor2 = 0;

	    System.out.print("Infórme o 1º valor:");
	    Valor1 = entrada.nextDouble();
	 
	    System.out.print("Infórme o 2º valor:");
	    Valor2 = entrada.nextDouble();

	    while(Valor2<=0){		
		    System.out.println("O 2º valor não pode ser Zero, favor digite o segundo valor novamente"+ "\n");
		    System.out.print("Infórme o 2º valor:");
		    Valor2 = entrada.nextInt();
		    Valor2++;
		}
		    Resp = Valor1 / Valor2;
	   	    System.out.printf("O resultado da divisão do primeiro valor lido pelo segundo valor lido é :: "+ Resp + "\n");
	    
       }
}