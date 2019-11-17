/**
  *[Exercicio34.java  ---  utilizando Seleção Aninhada ou Concatenada:]
  *
  *Transcreva o seguinte algoritmo para Java e 
  *faça um teste de mesa e complete o quadro a seguir para os seguintes valores:
  *
  *  início                       .........................................
  *    ler x, y                   :   X   :   Y   :   Z   :   Resposta:   :
  *    z = (x*y) + 5              :.......:.......:.......:................       
  *    se z <= 0 então            :   3   :   2   :  11   :    B          :
  *           resposta = ‘A’      :.......:.......:.......:................       
  *       senão                   :   150 :   3   :  455  :    C          :
  *       se z <= 100 então       :.......:.......:.......:................       
  *           resposta = ‘B’      :   7   :  -1   :  -2   :    A          :       
  *       senão                   :.......:.......:.......:................       
  *           resposta = ‘C’      :   -2  :   5   :  -5   :    A          :       
  *       fim_se                  :.......:.......:.......:................       
  *    fim_se                     :   50  :   3   :  155  :    C          :
  *       escrever z, resposta    :.......:.......:.......:................       
  *  fim
  */
import java.util.Scanner;
public class Exercicio34
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int X, Y, Z;

            System.out.printf("Informe o valor de X :"+"\n");
            X = entrada.nextInt();
            System.out.printf("Informe o vslor de Y :"+"\n");
            Y = entrada.nextInt();
            Z = (X*Y) + 5;

                   if (Z <= 0){
               System.out.print("Resposta A, :" + Z +"\n"); 
            } else if ( Z <= 100 ){
               System.out.print("Resposta B, :" + Z +"\n"); 
            } else {
               System.out.print("Resposta C, :" + Z +"\n"); ;
            }
    }
}
