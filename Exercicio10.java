/**
  * O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
  * distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
  * seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
  * calcular e escrever o custo final ao consumidor.
  */
import java.util.Scanner;
public class Exercicio10
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        double CustoFabrica, PercentualDistribuidor, Impostos, CustoFinal;
     
        System.out.print("Qual é o custo de fábrica:");
        CustoFabrica = entrada.nextDouble();

        PercentualDistribuidor = (28  * CustoFabrica) / 100;
        Impostos = (45 * CustoFabrica) /100 ;
        CustoFinal = CustoFabrica + PercentualDistribuidor + Impostos;

        System.out.print("O custo final do carro é: R$"+CustoFinal+"."+"\n");
    }

}
