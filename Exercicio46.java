/** 
  * [Exercicio46.java]
  * Escreva um programa para calcular a redução do tempo de vida de
  * um fumante. Pergunte a quantidade de cigarros fumados por dia e quantos anos
  * ele já fumou. Considere que um fumante perde 10 minutos de vida a cada cigarro,
  * calcule quantos dias de vida um fumante perderá. Exiba o total em dias.
  */
import java.util.Scanner;
public class Exercicio46 {
     public static void main(String[] args){
     Scanner ler = new Scanner(System.in);

     int Qtd, Anos, TotalCigarros, DiasPerdidos;
 
     System.out.print("Qual a quantidade de cigarros o senhor fuma por dia?");
     Qtd = ler.nextInt();
 
     System.out.print("A quantos anos o senhor é dependente do cigarro?");
     Anos = ler.nextInt();

		TotalCigarros = (Anos * 365)* Qtd;
		DiasPerdidos = (TotalCigarros * 10)/24;

	         System.out.printf("A quantidade de dias de vida que o senhor já perdeu fumando foi:: "+ DiasPerdidos + "." + "\n");
	
     }
 
}
