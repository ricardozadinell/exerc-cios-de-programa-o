/**
  * [Exercicio17.java  ---  estrutura de Seleção e Operadores Relacionais: ]
  *
  *Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
  *uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
  *aluno é aprovado). Escrever também a média calculada.
  */


import java.util.Scanner;
public class Exercicio17
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        double Nota1, Nota2, Media;

        System.out.print("Digite a primeira nota do aluno: ");
        Nota1 = entrada.nextDouble();
        System.out.print("Digite a segunda nota do aluno: ");
        Nota2 = entrada.nextDouble();
        
        Media = (Nota1 + Nota2) / 2;
            if(Media >= 6.0){
                System.out.print("Aluno foi Aprovado, sua média final é: "+ Media +"."+"\n"); 
            }else{
                System.out.print("Aluno foi reprovado, sua média final é: "+ Media +"."+"\n");
            }
    }

}
