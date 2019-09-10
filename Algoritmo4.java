/*
Algoritmo 4) Crie um algoritmo que leia dois números inteiros e que depois mostre:
    O primeiro valor elevado ao segundo valor
    O primeiro valor vezes o segundo valor
    O número inverso do primeiro valor (se não souber o que é o valor inverso, pesquise)
    A soma do segundo número com a metade do primeiro número
    A diferença do primeiro número com o segundo
    O valor oposto do segundo número

Exemplo em Python:
    num1 = int(input('Digite um valor: '))
    num2 = int(input('Digite outro valor: '))

    print 'primeiro valor elevado ao segundo: ', num1**num2
    print 'primeiro valor vezes o segundo: ', num1 * num2
    print 'numero inverso do primeiro: ', 1.0/num1
    print 'soma do segundo número com a metade do primeiro: ', num2 + (num1 / 2.0)
    print 'valor oposto do segundo numero: ', num2 * -1

*/

import java.util.Scanner;
public class Algoritmo4{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
            int NumeroUm =0;
            int NumeroDois =0;             
            int Resp1;
            int Resp2;
            int Resp3;
            int Resp4;
            int Resp5;

            System.out.println("Digite o primeiro numero");
            NumeroUm = scan.nextInt();
            
            System.out.println("Digite o segundo numero");
            NumeroDois = scan.nextInt();

            Resp1 = (NumeroUm*NumeroUm) * NumeroDois;
            Resp2 = NumeroUm * NumeroUm;
            Resp3 =  1 / NumeroUm;
            Resp4 =  NumeroDois + (NumeroUm / 2);
            Resp5 =  NumeroDois * -1;            


            System.out.printf("primeiro valor elevado ao segundo: %d%n", Resp1);
            System.out.printf("primeiro valor vezes o segundo: %d%n", Resp2);
            System.out.printf("numero inverso do primeiro: %d%n", Resp3);
            System.out.printf("soma do segundo número com a metade do primeiro: %d%n", Resp4);
            System.out.printf("valor oposto do segundo numero: %d%n", Resp5);

    }
}
