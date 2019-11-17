/**
  *[Exercicio36.java  ---  utilizando Seleção Aninhada ou Concatenada:]
  *
  *Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades
  *dos homens serão sempre diferentes entre si, bem como as das mulheres). Calcule e escreva a soma
  *das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais
  *novo com a mulher mais velha.
  */
import java.util.Scanner;
public class Exercicio36
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int IdadeHomem1, IdadeHomem2, IdadeMulher1, IdadeMulher2, Resp, Aux;
 
            System.out.printf("Informe a idade do homem nº1 :"+"\n");
            IdadeHomem1 = entrada.nextInt();          
            System.out.printf("Informe a idade do homem nº2 :"+"\n");
            IdadeHomem2 = entrada.nextInt();
            System.out.printf("Informe a idade da mulher nº1 :"+"\n");
            IdadeMulher1 = entrada.nextInt();
            System.out.printf("Informe a idade da mulher nº2 :"+"\n");
            IdadeMulher2 = entrada.nextInt();

                   if (( IdadeHomem1 > Idadehomem2) && (IdadeMulher1 > IdadeMulher2)){
                        Aux = IdadeHomem1 + IdadeMulher2;
                        Resp = Aux + IdadeMulher1;
                        System.out.print("produto das idades do homem mais novo com a mulher mais velha é: "+ Resp + "\n");
            } else if (( IdadeHomem1 < IdadeHomem2) && (IdadeMulher1 < IdadeMulher2)){
                        Aux = IdadeHomem2 + IdadeMulher1;
                        Resp = Aux + IdadeMulher2;
                        System.out.print("produto das idades do homem mais novo com a mulher mais velha é: "+ Resp + "\n");
            }
    }
}
