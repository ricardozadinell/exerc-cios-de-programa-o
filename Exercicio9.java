/**
  * [Exercicio9.java]
  * Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
  * Calcular e escrever o valor do novo salário.
  */
import java.util.Scanner;
public class Exercicio9
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        double SalarioMensal, PercentualReajuste, TotalReajuste, TotalPersentual, TotalFinal;
     
        System.out.print("Qual o salário atual do funcionário:");
        SalarioMensal = entrada.nextDouble();

        System.out.print("Qual o percentual(%) de reajuste? ");
        PercentualReajuste = entrada.nextDouble();

            TotalPersentual = PercentualReajuste/ 100;
            TotalReajuste = TotalPersentual * SalarioMensal;
            TotalFinal = TotalReajuste + SalarioMensal;
        System.out.print("O reajuste de "+PercentualReajuste+"% totalizou um acrécimo de: R$"+TotalReajuste+", reajustando o seu salário base para: R$"+TotalFinal+"."+"\n");
    }

}





