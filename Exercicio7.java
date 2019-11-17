/**
 *[EXERCICIO 7]
 *Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
 *dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
 */
import java.util.Scanner;
public class Exercicio7
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int Dias, Meses, Anos, Idade, Total;
     
        System.out.print("Entre com o dia em que a pessoa nasceu: ");
        Dias = entrada.nextInt();
        System.out.print("Entre com o mês do nascimento da pessoa: ");
        Meses = entrada.nextInt();
        System.out.print("Entre com o ano do nascimento da pessoa: ");
        Anos = entrada.nextInt();

        Total =(Anos*365)+(Meses*30)+Dias;
        System.out.print("A quantidade de dias que você esta vivo é: " + Total + "\n");
/**
 *OBS: Se fosse o contrário:
 *Faça um algoritmo que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 
 */    
        Idade = 2020 - Anos;
        System.out.print("Sua idade é: " + Idade + "\n");
    }

}




