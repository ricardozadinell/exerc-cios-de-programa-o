/**
  * Exercicio59.java ---Fundamento da programação de computadores, Algoritmos,pascal,C/C++(Padrão ANSI)e
  * -Java.3ªedição - Página 85, exercicio23...
  * Faça um programa que receba o valor do salário mínimo, o turno de trabalho (M — matutino; V
  * — vespertino; ou N — noturno), a categoria (O — operário; G — gerente) e o número de horas tra-
  * balhadas no mês de um funcionário. Suponha a digitação apenas de dados válidos e, quando houver
  * digitação de letras, utilize maiúsculas. Calcule e mostre:  
  * O coeficiente do salário, de acordo com a tabela a seguir.
  * ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
  * ::   TURNO DE TRABALHO             ::  VALOR DO COEFICIENTE                 ::
  * ::   M — Matutino                  ::  10% do salário mínimo                ::
  * ::   V — Vespertino                ::  15% do salário mínimo                ::
  * ::   N — Noturno                   ::  12% do salário mínimo                ::
  * ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
  * O valor do salário bruto, ou seja, o número de horas trabalhadas multiplicado pelo valor do coe-
  * ficiente do salário.
  * O imposto, de acordo com a tabela a seguir:
  * ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
  * :: CATEGORIA    ::    SALÁRIO BRUTO    ::    IMPOSTO SOBRE O SALÁRIO BRUTO  ::
  * :: O — Operário ::    >= R$ 300,00     ::    5%                             ::
  * ::              ::     < R$ 300,00     ::    3%                             ::
  * ::..............::.....................::...................................::
  * :: G — Gerente  ::    >= R$ 400,00     ::    6%                             ::
  * ::              ::     < R$ 400,00     ::    4%                             ::
  * ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
  *    A gratificação, de acordo com as regras a seguir.
  * Se o funcionário preencher todos os requisitos a seguir, sua gratificação será de
  * R$ 50,00; caso contrário, será de R$ 30,00. Os requisitos são:
  * Turno: Noturno
  * Número de horas trabalhadas: Superior a 80 horas
  *    O auxílio alimentação, de acordo com as seguintes regras.
  * O funcionário preencher algum dos requisitos a seguir, seu auxílio alimentação será de um terço
  * do seu salário bruto; caso contrário, será de metade do seu salário bruto. Os requisitos são:
  * Categoria: Operário
  * Coeficiente do salário: < = 25
  *    O salário líquido, ou seja, salário bruto menos imposto mais gratificação mais auxílio alimentação.
  *    A classificação, de acordo com a tabela a seguir:
  * ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
  * :: SALÁRIO LíQUIDO			::	MENSAGEM 			::
  * :: Menor que R$ 350,00		::	Mal remunerado			::
  * :: Entre R$ 350,00 e R$ 600,00	::	Normal				::
  * :: Maior que R$ 600,00  		::	Bem remunerado			::
  * ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
  */


import java.util.Scanner;
public class Exercicio59{
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
	double salarioMinimo, turnoDeTrabalho, categoria, numeroDeHorasTrabalhadasNoMes;
	double coeficienteDoSalario = 0, salarioBruto = 0, salarioLiquido = 0, gratificacao = 0, auxilioAlimentacao = 0, imposto = 0;

            System.out.printf("Informe o salário minimo do colaborador: "+"\n");
	    salarioMinimo = entrada.nextDouble();

            System.out.printf("Informe o turno do colaborador usando uma das três opções:"+"\n"+"(1) — matutino;"+"\n"+ "(2) — vespertino;"+"\n"+"(3) — noturno;"+"\n");
	    turnoDeTrabalho = entrada.nextDouble();

            System.out.printf("Informe a categoria do colaborador usando uma das três opções:"+"\n"+"(1) — operário;"+"\n"+"(2) — gerente;"+"\n");
	    categoria = entrada.nextDouble();

            System.out.printf("Informe o numero de horas trabalhadas no mês pelo colaborador: "+"\n");
	    numeroDeHorasTrabalhadasNoMes = entrada.nextDouble();
	   if(turnoDeTrabalho == 1){ 	    // (1) - Matutino
		coeficienteDoSalario = salarioMinimo * 0.10; //10% do salario
	   }else if(turnoDeTrabalho == 2){  // (2) - Vespertino
		coeficienteDoSalario = salarioMinimo * 0.15; //15% do salario
	   }else if(turnoDeTrabalho == 3){  // (3) - Noturno
		coeficienteDoSalario = salarioMinimo * 0.12; //12% do salario
	   }
	   salarioBruto = numeroDeHorasTrabalhadasNoMes * coeficienteDoSalario;
	   if ((salarioBruto < 300) & (categoria == 1)){
	   imposto = salarioBruto * 0.3; //3%
           }else if ((salarioBruto < 300) & (categoria == 1)){
	   imposto = salarioBruto * 0.5; //5%	   
           }else if ((salarioBruto < 400) & (categoria == 2)){
	   imposto = salarioBruto * 0.4; //4%	
           }else if ((salarioBruto >= 400) & (categoria == 2)){
	   imposto = salarioBruto * 0.6; //6% 
           }
	   if (numeroDeHorasTrabalhadasNoMes >= 80){
		gratificacao = 50;
	   }else if (numeroDeHorasTrabalhadasNoMes < 80){
		gratificacao = 30;
	   }

	   if((categoria <= 1) & (gratificacao <= 25)){
		auxilioAlimentacao = salarioBruto/3;
	   }else if((categoria <= 1) &  (gratificacao > 25)){
		auxilioAlimentacao = salarioBruto/2;
	   }
	   double AuxSL1, AuxSL2;//auxiliares do salário líquido;
	   AuxSL1 = salarioBruto - imposto;
	   AuxSL2 = AuxSL1 + gratificacao;
	   salarioLiquido = AuxSL2 + auxilioAlimentacao;
	   if(salarioLiquido < 350){
 	        System.out.printf("Mal remunerado  :"+ salarioLiquido + "\n");	
	   }else if((salarioLiquido >= 350) & (salarioLiquido < 600)){
 	        System.out.printf("Normal :"+ salarioLiquido + "\n");
	   }else if(salarioLiquido >= 600){
 	        System.out.printf("Bem remunerado :"+ salarioLiquido + "\n");
	   }

    }
}
