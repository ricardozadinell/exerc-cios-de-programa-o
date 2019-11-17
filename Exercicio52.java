/** 
  * [Exercicio52.java  ---  utilizando Estruturas de Repetição: Repita e Enquanto:]
  *
  * Escreva um algoritmo para imprimir os 10 primeiros números inteiros maiores que 100.
  */
import java.util.Scanner;
    public class Exercicio52{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contadora = 0;
        int auxiliar;

        for(int i=0; i<10; i++){

            System.out.print("Digite um número: ");
            auxiliar = Integer.parseInt(sc.nextLine());

            if(auxiliar > 100){
                      contadora++;
            }//fim do if
        }//fim do for

        System.out.println("Quant. de números maiores que 100:  " + contadora);
    }//fim do Main
}//fim da classe