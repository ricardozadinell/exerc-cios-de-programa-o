/**
  *Exercicio11.java
  *Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
  *mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
  *efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
  *vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
  *vendedor.
  */


import java.util.Scanner;
public class Exercicio11
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        double ComissaoFixa, ComissaoDasVendas;
        double NroCarrosVendidos, ValorTotalDeVendas, SalarioFixo;
        double Qtd1, Qtd2, ComissaoTotal;

        System.out.print("Quantos carros foram vendidios?");
        NroCarrosVendidos = entrada.nextDouble();

        System.out.print("Qual é o salário fixo do vendedor?");
        SalarioFixo = entrada.nextDouble();

        System.out.print("Qual comissao por carro vendido?");
        ComissaoDasVendas = entrada.nextDouble();

        ComissaoFixa = 5/100;
        Qtd1 = NroCarrosVendidos * ComissaoFixa;
        Qtd2 = NroCarrosVendidos * ComissaoDasVendas;
        ComissaoTotal = (SalarioFixo + Qtd1) + Qtd2;

        System.out.print("A comissão total do funcionario é: + "+"R$"+ComissaoTotal+"."+"\n");
    }

}
