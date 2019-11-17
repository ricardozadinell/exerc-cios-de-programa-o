/**
  * [Exercicio19.java  ---  estrutura de Seleção e Operadores Relacionais: ]
  *
  *Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.
  */
import java.util.Scanner;
public class Exercicio19
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int Num1, Num2, Resp;

        System.out.print("Digite o primeiro número: ");
        Num1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        Num2 = entrada.nextInt();

            if(Num1 > Num2){
                System.out.print("O maior valor é: "+ Num1 +"\n"); 
            }else if(Num2 > Num1){
                System.out.print("O maior valor é: "+ Num2 +"\n");
            }else{
                System.out.print("Os valores são iguais: "+ Num1 +"\n");            
            }
    }

}
