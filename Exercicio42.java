/** 
  *[Exercicio42.java  ---  utilizando Operadores lógicos:]
  *
  * Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para
  * estar em condições, um dos seguintes requisitos deve ser satisfeito:
  *	::Ter no mínimo 65 anos de idade.
  *	::Ter trabalhado no mínimo 30 anos.
  *	::Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
  * Com base nas informações acima, faça um algoritmo que leia: o número do empregado (código), o ano
  * de seu nascimento e o ano de seu ingresso na empresa. O programa deverá escrever a idade e o tempo
  * de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou 'Não requerer'.
  *
  */
import java.util.Scanner;
public class Exercicio42 {
      public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

	    int Cod, DataNasc, AnoEngresso, Idade, Tempo, AnoAtual;
	 
	    System.out.print("Infórme o código de identificação do empregado:");
	    Cod = entrada.nextInt();
	 
	    System.out.print("Infórme o ano de nascimento do empregado:");
	    DataNasc = entrada.nextInt();

	    System.out.print("Informe o ano de seu ingresso na empresa:");
	    AnoEngresso= entrada.nextInt();

	    System.out.print("Digite o ano atual:");
	    AnoAtual = entrada.nextInt();

		Idade = AnoAtual - DataNasc;
		Tempo = AnoAtual - AnoEngresso;
		
	  	if((Idade >= 65) && (Tempo >=30)){
		    System.out.printf("Requer aposentadoria"+ "\n");
		    System.out.printf(" o trabalhador já tem "+ Idade +"anos de idade" + "\n");
	            System.out.printf(" e trabalhou "+Tempo+" anos na empresa."+ "\n");
		}else if((Idade == 60)&&(Tempo >= 25)){
		    System.out.printf("Requer aposentadoria"+ "\n");
		    System.out.printf(" o trabalhador já tem "+ Idade +"anos de idade" + "\n");
	            System.out.printf(" e trabalhou " +Tempo+" anos na empresa."+ "\n");
		}else if((Idade < 60)&&(Tempo < 25)){
		    System.out.printf("Não Requer aposentadoria, o trabalhador só tem "+ Idade +"anos de idade,"+ "\n");
		    System.out.printf(" e só trabalhou "+Tempo+" anos na empresa."+ "\n");
		}
       }
}