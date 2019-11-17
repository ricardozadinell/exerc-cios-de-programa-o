/**
  *Exercicio 12.java
  * Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
  * correspondente em graus Celsius (baseado na fórmula abaixo):
  *        C           F -32
  *    ---------  =  ----------
  *        5             9
  */
import java.util.Scanner;
public class Exercicio12
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        double Fahrenheit, GrausCelsius;

        System.out.print("Digite a temperatura em Fahrenheit: ");
        Fahrenheit = entrada.nextDouble();
        GrausCelsius = 5 * ((Fahrenheit - 32) /9);

        System.out.print("A Resposta da conversão é : "+ GrausCelsius +"º graus Celsius."+"\n");
    }

}
