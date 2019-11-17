/** 
  *[Exercicio45.java]
  *
  * Escreva um programa que pergunte a quantidade de km percorridos
  * por um carro alugado pelo usuário, assim como a quantidade de dias pelos quais
  * o carro foi alugado. Calcule o preço a pagar, sabendo que o carro custa R$ 60 por
  * dia e R$ 0,15 por km rodado.
  */
import java.util.Scanner;
public class Exercicio45 {
  public static void main(String[] args){

    Scanner ler = new Scanner(System.in);
    double Aux1, Aux2, KmPercorridos, QtdDias, TotalAPagar;
 
    System.out.print("Informe a quantidade de km percorridos pelo  usuário:");
    KmPercorridos = ler.nextDouble();
 
    System.out.print("Informe a quantidade de dias que o carro foi alugado: ");
    QtdDias = ler.nextDouble();
	Aux1 = KmPercorridos * 0.15;
	Aux2 = QtdDias * 60;
	TotalAPagar = Aux1 + Aux2;
                 System.out.printf("O valor total a ser pago é:: "+ TotalAPagar + "." + "\n");
	
  }
 
}