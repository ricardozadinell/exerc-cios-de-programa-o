/**
  *  [Exercicio22.java ---  estrutura de Seleção e Operadores Relacionais: ]
  *A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais
  *de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
  *Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva
  *o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
  *(considere que o mês possua 4 semanas exatas)
  */

import java.util.Scanner;
public class Exercicio22
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        double HorasTrabalhadas, SalarioFixo;
        double JornadaSemanal, HoraExtra, Semanas;
        double NumHorasTrabalhadasNoMes, SalarioPorHora, SalarioTotalAReceber;
        double Aux1, Aux2;

            System.out.print("Qual o salaŕio fexo do funcionário? ");
            SalarioFixo = entrada.nextDouble();

            System.out.print("Quantas horas o funcionário trabalhou no mês? ");
            NumHorasTrabalhadasNoMes = entrada.nextDouble();
            
            JornadaSemanal = 40;
            SalarioPorHora = SalarioFixo /  JornadaSemanal;
            if(NumHorasTrabalhadasNoMes >= 41){
                Aux1 = NumHorasTrabalhadasNoMes - 40;
                Aux2 = SalarioPorHora *40;
                SalarioTotalAReceber = SalarioFixo + ((Aux1*SalarioPorHora)/2);
                    System.out.print("O salário total a receber é: "+ SalarioTotalAReceber +"."+"\n");
            }else{
            SalarioPorHora = SalarioFixo /  JornadaSemanal;
                    System.out.print("O salário total a receber é: "+ SalarioFixo +"."+"\n"); 
            }
    }

}
