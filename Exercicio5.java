/**
  *[Exercicio5.java - Operadores Aritméticos]
  *Escreva um algoritmo para ler um valor (do teclado) e 
  *escrever (na tela) o seu antecessor.
  */


import java.util.Scanner;

public class Exercicio5
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int Valor;
        int Resp;

        System.out.print("Digite o valor: ");
        Valor = entrada.nextInt();
        
        Resp = Valor - 1;

        System.out.print("O numero anterior ao digitado é " + Resp + "\n");

    }

}
