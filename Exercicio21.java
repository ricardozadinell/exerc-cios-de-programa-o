/**
  * [Exercicio21.java  ---  estrutura de Seleção e Operadores Relacionais: ]
  *
  *Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os
  *minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é
  *de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.
  */
import java.util.Scanner;
public class Exercicio21
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int HoraInicio, HoraFim, Resp;
        int Aux1;
        System.out.println("Favor obedecer horario do tipo militar, 00 á 24h..");

            System.out.print("Digite a hora em que o jogo começou: ");
            HoraInicio = entrada.nextInt();

            System.out.print("Digite a hora em que o jogo terminou: ");
            HoraFim = entrada.nextInt();
                Aux1 = 24 - HoraInicio;
                Resp = Aux1 + HoraFim;                        

                if(Resp >= 25){
                    System.out.print("O tempo máximo de duração do jogo é de 24 horas: "+ Resp +"horas."+"\n"); 
                }else{
                    System.out.print("A partida durou: "+ Resp +"horas."+"\n"); 
                }
    }

}
