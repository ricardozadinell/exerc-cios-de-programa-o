/**
  * [ Exercicio27.java  ---  utilizando Seleção Aninhada ou Concatenada: ]
  * .........................................................................
  * :Ler um valor e escrever se é positivo, negativo ou zero:                :
  * .........................................................................
  */
import java.util.Scanner;
public class Exercicio27
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int Num, Resp;  

            System.out.print("Digite um número: ");
            Num = entrada.nextInt();
                if(Num == 0){
                    System.out.print("O número é : ZERO."+ Num +"\n"); 
                }else if (Num >= 1 ){
                    System.out.print("O numero é : POSITIVO."+ Num + "\n");                 
                } else if (Num <= -1 ){
                    System.out.print("O numero é : NEGATIVO."+ Num + "\n");                 
                }                                             
    }
}

