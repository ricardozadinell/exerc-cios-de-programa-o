/**
  * [Exercicio18.java  ---  estrutura de Seleção e Operadores Relacionais: ]
  *
  *Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela
  *poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).
  */



import java.util.Scanner;
public class Exercicio18
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int AnoAtual, AnoNascimento, Resp;

        System.out.print("Digite o ano atual: ");
        AnoAtual = entrada.nextInt();

        System.out.print("Digite o ano em que o eleitor nasceu: ");
        AnoNascimento = entrada.nextInt();

        Resp = AnoAtual - AnoNascimento;
            if(Resp >= 16){
                System.out.print("Parabéns eleitor, você já pode votar. Você tem: "+ Resp +"anos de idade."+"\n"); 
            }else{
                System.out.print("Infelizmente é obrigatório ter 16 anos para votar, e você só tem: "+ Resp +"anos de idade."+"\n"); 
            }
    }

}
