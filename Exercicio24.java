/**
  * [ Exercicio24.java  ---  estrutura de Seleção e Operadores Relacionais: ]
  *
  *Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que
  *ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que
  *ultrapassar este valor, calcular e escrever o seu salário total.
  */
import java.util.Scanner;
public class Exercicio24
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        double SalarioFixo, ValorDasVendas;
        double Comissao, Resp;
  
            System.out.print("Digite o salário fixo do vendedor : ");
            SalarioFixo = entrada.nextDouble();

            System.out.print("Digite o valor das vendas efetudas pelo vendedor: ");
            ValorDasVendas = entrada.nextDouble();
     
        if(ValorDasVendas <=1500){
            Comissao = ValorDasVendas / 0.03;
            Resp = Comissao + SalarioFixo;
            System.out.print("O valor total da comissão é : "+ Comissao+"reais."+"\n");                                         
            System.out.print("O valor total do salário do vendedor é : "+ Resp+"reais."+"\n"); 
        }else if(ValorDasVendas >1500){
            Comissao =ValorDasVendas / 0.05;
            Resp = Comissao + SalarioFixo;
            System.out.print("O valor total da comissão é : "+ Comissao+"reais."+"\n");                                         
            System.out.print("O valor total do salário do vendedor é : "+ Resp+"reais."+"\n"); 
        }                                             
    }
}

