/**
  *[Exercicio31.java  ---  utilizando Seleção Aninhada ou Concatenada:]
  *
  *Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam
  *ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma
  *dos outros 2 lados.
  */

import java.util.Scanner;
public class Exercicio31
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int A, B, C, Aux1, Aux2;  
            System.out.print("Digite o Valor de A: ");
            A = entrada.nextInt();
            System.out.print("Digite o Valor de B: ");
            B = entrada.nextInt();
            System.out.print("Digite o Valor de C: ");
            C = entrada.nextInt();
            
            Aux1 = A + C;
            Aux2 = B + C;
            if(A < Aux2){
                System.out.println("POSITIVO!! --- Os valores correspondem a um triangulo");
            }else if (B < Aux1){
                System.out.println("POSITIVO!! --- Os valores correspondem a um triangulo");
            }else if (C >= Aux1){
                System.out.println("NEGATIVO!! --- Os valores não correspindem a um triangulo");                 
            }else if (C >= Aux2){
                System.out.println("NEGATIVO!! --- Os valores não correspindem a um triangulo");                 
            }
    }
}
