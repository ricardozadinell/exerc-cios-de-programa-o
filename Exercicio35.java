/**
  *[Exercicio35.java  ---  utilizando Seleção Aninhada ou Concatenada:]
  *
  *  Um posto está vendendo combustíveis com a seguinte tabela de descontos:
  *  ....................................................................
  *  :               :   até 20 litros, desconto de 3% por litro        :
  *  :    ALCOOL     :..................................................:
  *  :               :   acima de 20 litros, desconto de 5% por litro   :
  *  ...................................................................:
  *  :               :   até 20 litros, desconto de 4% por litro        :
  *  :  GASOLINA     :..................................................:
  *  :               :   acima de 20 litros, desconto de 6% por litro   :
  *  :...............:..................................................:
  *
  *  Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da
  *  seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se
  *  que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.
  */
import java.util.Scanner;
public class Exercicio35
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        double Litros, Alcool, Gasolina, Tipo, Resp, Aux;

            System.out.printf("-----------------------------------------"+"\n");
            System.out.printf("...Digite o numero 1 para A-álcool......."+"\n");
            System.out.printf("...OU...................................."+"\n");
            System.out.printf("...Digite o numero 2 para G-gasolina....."+"\n");
            System.out.printf("-----------------------------------------"+"\n");
            System.out.printf("Informe A para Alcool ou G para gasolina :"+"\n");
            Tipo = entrada.nextDouble();

            System.out.printf("Informe a quantidade de litros vendido :"+"\n");
            Litros = entrada.nextDouble();


            Alcool = 2.90;  //opcao 1
            Gasolina = 3.30; //opcao 2
                if(Tipo <= 1){
                            if(Litros<=20){
                                Aux = Litros * Alcool;                        
                                Resp = Aux - 0.03;
                                System.out.print("O valor a ser pago é, :" + Resp +"\n"); 
                            }else{
                                Aux = Litros * Alcool;                        
                                Resp = Aux - 0.05;
                                System.out.print("O valor a ser pago é, :" + Resp +"\n"); 
                            }
                }else if(Tipo >=2){
                            if(Litros<=20){
                                Aux = Litros * Gasolina;                        
                                Resp = Aux - 0.04;
                                System.out.print("O valor a ser pago é, :" + Resp +"\n"); 
                            }else{
                                Aux = Litros * Gasolina;                        
                                Resp = Aux - 0.06;
                                System.out.print("O valor a ser pago é, :" + Resp +"\n"); 
                    }
                }
    }

}
