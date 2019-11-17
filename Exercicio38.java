/**
  *[Exercicio38.java  ---  utilizando Seleção Aninhada ou Concatenada:]
  *
  * Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja
  * diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a
  * mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha. Se
  * esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a
  * senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.
  */
import java.util.Scanner;
public class Exercicio38
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int Cod, Senha;

            System.out.printf("INFORME O CÓDIGO DO USUÁRIO:"+"\n");
	    Cod = entrada.nextInt();

                   if (Cod == 1234 ){
			        System.out.print("INFORME A SENHA DO USUÁRIO:"+"\n");
			        Senha = entrada.nextInt();
					if (Senha == 9999){
				        System.out.println("ACESSO PERMITIDO.");
					}else {
				        System.out.println("SENHA INCORRETA !!!");
					}
                   } else{
 			        System.out.print("USUÁRIO INVÁLIDO: "+ Cod + "\n");
  		   }
    }
}
