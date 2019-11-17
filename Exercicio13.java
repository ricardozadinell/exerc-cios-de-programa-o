/**
  *[ Exercicio13.java ]
  *Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.
  *Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média
  *final é:
  *                           n1 * 2 + n2 * 3 + n3 * 5
  *         MediaFinal = -----------------------------------
  *                                      10
  */
import java.util.Scanner;
public class Exercicio13
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        double Nota1, Nota2, Nota3, MediaFinal;

        System.out.print("Digite a primeira nota do aluno: ");
        Nota1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota do aluno: ");
        Nota2 = entrada.nextDouble();

        System.out.print("Digite a terceira nota do aluno: ");
        Nota3 = entrada.nextDouble();

            MediaFinal = ((Nota1 * 2) + (Nota2 * 3) + (Nota3 * 5)) / 10; 

        System.out.print("A médiaa final é : "+ MediaFinal +"."+"\n");
    }

}
