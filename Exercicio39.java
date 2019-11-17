/**
  * Exercicio39.java
  *
  * Entrar com nome, sexo e idade de uma pessoa. Se a pessoa for do sexo feminino e
  * tiver menos que 25 anos, imprimir nome e a a mensagem: ACEITA. Caso contrário,
  * imprimir nome e a mensagem: NÃO ACEITA.
  */



import java.util.Scanner;
public class Exercicio39
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int Idade, Sexo;

        System.out.print("Escolha [1 ]para [MASCULINO] ou [2] para [FEMININO]");
        Sexo = entrada.nextInt();

        System.out.print("Digite a idade da pessoa: ");
        Idade = entrada.nextInt();

            if((Idade <= 25) &&(Sexo ==1)){
                System.out.print("ACEITA"+"\n"); 
            }else{
                System.out.print("NÃO ACEITA"+"\n");            
            }
    }

}
