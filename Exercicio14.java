/**
  *[ Exercicio14.java - Seleção e Operadores Relacionais:]
  *Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso
  *contrário escrever NÃO É MAIOR QUE 10!
  */


import java.util.Scanner;
public class Exercicio14
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int Valor, Resp;
 
        System.out.println("Algoritmo têm a finalidade de ler um valor e responder se ele é maior, menor ou igual a 10.."+"\n");

        System.out.print("Digite o valor a ser processado: ");
        Valor = entrada.nextInt();

            if(Valor >=11){
                System.out.println("É MAIOR QUE 10! "+"."+"\n");
            }else if(Valor <=9){
                System.out.print("NÃO É MAIOR QUE 10! "+"."+"\n");
            }else{
                System.out.print("ESSE VALOR É IGUAL QUE 10! "+"."+"\n");
            }
    }

}
