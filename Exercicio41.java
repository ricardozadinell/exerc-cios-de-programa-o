/**
  *[Exercicio41.java  ---  utilizando Operadores lógicos:]
  *
  * Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3 verificações e a média dos
  * exercícios que fazem parte da avaliação. Calcular a média de aproveitamento, usando a fórmula abaixo
  * e escrever o conceito do aluno de acordo com a tabela de conceitos mais abaixo:
  *	    				N1 + N2 * 2 + N3 * 3 + Média_dos_Exercícios
  *	Média_de_Aproveitamento = ---------------------------------------------------------
  *							7
  * A atribuição de conceitos obedece a tabela abaixo:
  * ::::::::::::::::::::::::::::::::::::::::::::::::::::::
  * ::    Média de Aproveitamento    ::    Conceito     ::
  * ::       > = 9,0                 ::       A         :: 
  * ::       > = 7,5 e < 9,0         ::       B         ::
  * ::       > = 6,0 e < 7,5         ::       C         ::
  * ::       < 6,0                   ::       D         ::
  * ::::::::::::::::::::::::::::::::::::::::::::::::::::::
*/
import java.util.Scanner;
public class Exercicio41 {
      public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

	    double Nota1, Nota2, Nota3, MediaDosExercicios, MediaDeAproveitamento;
	 
	    System.out.print("Informe a 1ª nota do aluno:");
	    Nota1 = entrada.nextDouble();
	 
	    System.out.print("Informe a 2ª nota do aluno:");
	    Nota2 = entrada.nextDouble();

	    System.out.print("Informe a 3ª nota do aluno:");
	    Nota3 = entrada.nextDouble();

	    System.out.print("Informe a média dos exercicios do aluno:");
	    MediaDosExercicios = entrada.nextDouble();

	    MediaDeAproveitamento =  (Nota1 + Nota2 * 2 + Nota3 * 3 + MediaDosExercicios) / 7;
	  	if( MediaDeAproveitamento >= 9.0){
		    System.out.printf("O conceito de aproveitamento do aluno é A pos sua nota foi:: "+ MediaDeAproveitamento + "\n");
		}else if((MediaDeAproveitamento >= 7.5) && (MediaDeAproveitamento < 9.0)){
		    System.out.printf("O conceito de aproveitamento do aluno é B pos sua nota foi:: "+ MediaDeAproveitamento + "\n");
		}else if((MediaDeAproveitamento >= 6.0) && (MediaDeAproveitamento < 7.5)){
		    System.out.printf("O conceito de aproveitamento do aluno é C pos sua nota foi:: "+ MediaDeAproveitamento + "\n");
		}else if(MediaDeAproveitamento < 6.0){
		    System.out.printf("O conceito de aproveitamento do aluno é D pos sua nota foi:: "+ MediaDeAproveitamento + "\n");
		}
       }
}