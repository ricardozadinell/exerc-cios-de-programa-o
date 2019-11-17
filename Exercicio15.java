/**
  *[ Exerciico15.java --- estrutura de Seleção e Operadores Relacionais ]
  *Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).
  */
import java.util.Scanner;
public class Exercicio15
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int Valor, Resp;

        System.out.print("Digite o valor a ser processado: ");
        Valor = entrada.nextInt();

            if(Valor >= 0){
                System.out.print("Valor é Positivo! "+"."+"\n");
            }else{
                System.out.println("Valor é Negativo! "+"."+"\n");
            }
    }

}
