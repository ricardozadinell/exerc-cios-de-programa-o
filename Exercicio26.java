/**
  * [ Exercicio26.java  ---  estrutura de Seleção e Operadores Relacionais: ]
  * .........................................................................................................
  * :Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e                :
  * :quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade        :
  * :média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual       :
  * :a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuarcompra'.:
  * .........................................................................................................
  */
import java.util.Scanner;
public class Exercicio26
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        double QtdAtual, QtdMaxima, QtdMinima;
        double Media;
  
            System.out.print("Digite a quantidade atual do estóque: ");
            QtdAtual = entrada.nextDouble();

            System.out.print("Digite a quantidade máxima do estoque: ");
            QtdMaxima = entrada.nextDouble();

            System.out.print("Digite a quantidade mínima do estoque : ");
            QtdMinima = entrada.nextDouble();
     
            Media = (QtdMaxima + QtdMinima) / 2;
                if(Media >= QtdAtual){
                    System.out.print("Não Efetuar compra, Média atual é : "+ Media +"\n"); 
                }else if (Media < QtdAtual ){
                    System.out.print("Efetuar compra, Média atual é : "+ Media + "\n");                 
                }                                             
    }
}

