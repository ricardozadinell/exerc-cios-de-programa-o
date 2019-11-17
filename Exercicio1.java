/**
  *Exercicio 1: Escreva um algoritmo que armazene o valor 10 em uma variável A e o valor 20 em uma variável B.
  *A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com que o
  *valor que está em A passe para B e vice-versa. Ao final, escrever os valores que ficaram armazenados
  *nas variáveis.
  */
public class Exercicio1
{
    public static void main(String[] args)
    {
        int A = 10;
        int B = 20;
        int Var1; 
        int Var2;

        Var1 = A;
        Var2 = B;
        A = Var2;
        B = Var1;
        System.out.print("O valor de A é " + A + "\n");
        System.out.print("O valor de A é " + B + "\n");

    }

}
