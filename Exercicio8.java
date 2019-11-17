/**
 *[EXERCICIO 8]
 *Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos
 *e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
 */
import java.util.Scanner;
public class Exercicio8
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int TotalEleitores, VotoBranco, VotoValido, VotoNulo, PorcBranco, PorcNulo, PorcValido;
     
        System.out.print("Digite o número total de eleitores do município:");
        TotalEleitores = entrada.nextInt();

        System.out.print("Digite o número de votos brancos: ");
        VotoBranco = entrada.nextInt();

        System.out.print("Digite o número de votos nulos ");
        VotoNulo = entrada.nextInt();

        System.out.print("Digite o número de votos válidos: ");
        VotoValido = entrada.nextInt();

            PorcBranco = (100 * VotoBranco) / TotalEleitores;
            PorcNulo = (100 * VotoNulo) / TotalEleitores;
            PorcValido = (100 * VotoValido) / TotalEleitores;

        System.out.print("O percentual de vótos em branco é: " + PorcBranco + "%"+ "\n");
        System.out.print("O percentual de vótos nulos é: " + PorcNulo + "%" +"\n");
        System.out.print("O percentual de vótos validos é: " + PorcValido + "%"+ "\n");
    }

}






