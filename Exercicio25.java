/**
  * [ Exercicio25.java  ---  estrutura de Seleção e Operadores Relacionais: ]
  *
  *Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e
  *escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior
  *ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.
  */
import java.util.Scanner;
public class Exercicio25
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int NumeroDaConta;
        double Saldo, Debito, Credito;
        double SaldoAtual;
  
            System.out.print("Digite o numero da conta do cliente : ");
            NumeroDaConta = entrada.nextInt();

            System.out.print("Digite o valor saldo do cliente: ");
            Saldo = entrada.nextDouble();

            System.out.print("Digite o valor do débito do cliente: ");
            Debito = entrada.nextDouble();

            System.out.print("Digite o valor de crédito do cliente: ");
            Credito = entrada.nextDouble();
            
                SaldoAtual = Saldo - Debito + Credito;
                if(SaldoAtual >=0){
                   System.out.print("O saldo do cliente está POSITIVO, o valor é R$: "+ SaldoAtual +" Reais."+"\n"); 
                }else{
                   System.out.print("O saldo do cliente está NEGATIVO, o valor é R$: "+ SaldoAtual +" Reais."+"\n");  
                }                                             
    }
}

