/**
  *[Exercicio40.java  ---  utilizando Operadores lógicos:]
  *
  * Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e o preço
  * unitário. Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total
  * a pagar (total a pagar = total - desconto), sabendo-se que:
  *   - Se quantidade <= 5 o desconto será de 2%
  *   - Se quantidade > 5 e quantidade <=10 o desconto será de 3%
  *   - Se quantidade > 10 o desconto será de 5%
  *
*/
import java.io.IOException;
import java.util.Scanner;
 
public class Exercicio40 {
  public static void main(String[] args) throws IOException {
    Scanner ler = new Scanner(System.in);

    String NomeProduto;
    char  Quantidade;
    double Preco, Total, Desconto, TotaLaPagar;
 
    System.out.print("Informe o nome do produto:");
    NomeProduto = ler.nextLine();
 
    System.out.print("Informe a quantidade: ");
    Quantidade = (char)System.in.read();
 
    System.out.print("Informe o valor unitário do produto: ");
    Preco = ler.nextDouble();

	if(Quantidade <= 5){
		Total = Quantidade * Preco;
		TotaLaPagar = Total - 0.02;	
                System.out.printf("O valor total a ser pago é:: "+ TotaLaPagar + "." + "\n");
	}else if(Quantidade <= 10){
		Total = Quantidade * Preco;
		TotaLaPagar = Total - 0.03;	
                System.out.printf("O valor total a ser pago é:: "+ TotaLaPagar + "." + "\n");
	}else if(Quantidade >= 11){
		Total = Quantidade * Preco;
		TotaLaPagar = Total - 0.05;	
                System.out.printf("O valor total a ser pago é:: "+ TotaLaPagar + "." + "\n");
	}
  }
 
}