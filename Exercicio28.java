/**
  *[Exercicio28.java  ---  utilizando Seleção Aninhada ou Concatenada:]
  *
  *Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.                :
  */
import java.util.Scanner;
public class Exercicio28
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int Valor1,Valor2,Valor3, Resp;  

            System.out.print("Digite o primeiro número: ");
            Valor1 = entrada.nextInt();
            System.out.print("Digite o segundo número: ");
            Valor2 = entrada.nextInt();
            System.out.print("Digite o terceiro número: ");
            Valor3 = entrada.nextInt();

                if((Valor1 == Valor2) && (Valor1 == Valor3)){
                    System.out.print("Os três valores são iguais."+ Valor1 +"\n"); 
                }else if ((Valor1 > Valor2) && (Valor1 > Valor3)){
                    System.out.print("O primeiro valor, é o maior."+ Valor1 + "\n");                 
                } else if ((Valor2 > Valor1) && (Valor2 > Valor3)){
                    System.out.print("O segundo valor, é o maior."+ Valor2 + "\n");                                  
                }else{
                    System.out.print("O terceiro valor, é o maior."+ Valor3 + "\n");                 
                }                                             
    }
}




