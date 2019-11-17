/**
  *[EXERCICIO 6]
  *Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.
  */
import java.util.Scanner;

public class Exercicio6
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int Base;
        int Altura, Resp;
        System.out.println("***********************************************************************************************************");
        System.out.println("**Esse algoritmo lê as dimensões de um retângulo (base e altura), calcula e devolve a área do retângulo: **");
        System.out.println("***********************************************************************************************************");
     
        System.out.print("Qual o valor da base do retangulo? ");
        Base = entrada.nextInt();
        
        System.out.print("Qual a altura do retângulo? ");
        Altura = entrada.nextInt();

        Resp = Base * Altura;

        System.out.print("O numero anterior ao digitado é " + Resp + "\n");

    }

}
