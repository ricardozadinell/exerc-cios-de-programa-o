/**
  *Analise os algoritmos abaixo e diga o que será impresso na tela ao serem executados:
  ************************************************************************************************
  ** [PHASE_1]     ** [PHASE_2]      ** [PHASE_3]  ** [PHASE_4]  ** [PHASE_5]  ** [PHASE_6]     **
  ** A = 10        ** A = 30         ** A = 10     ** A = 10     ** A = 10     ** X = 1         **
  ** B = 20        ** B = 20         ** B = 20     ** B = A + 1  ** B = 5      ** Y = 2         **
  ** Escrever B    ** c = (A +B)     ** C = A      ** A = B + 1  ** C = A + B  ** Z = Y -X      **
  ** B = 5         ** Escrever C     ** B = C      ** B = A + 1  ** B = 20     ** Escrever Z    **
  ** Escrever A    ** B = 10         ** A = B      ** Escrever A ** A = 10     ** X = 5         **
  ** Escrever B    ** Escrever B,C   ** Escrever A ** A = B +1   ** Escrever A ** Y = X + Z     **
  **               ** C = (A+B))     ** Escrever B ** Escrever A ** Escrever B ** Escrever X, Y **
  **               ** Escrever A,B,C ** Escrever C ** Escrever B ** Escrever C ** Escrever Z    **
  ************************************************************************************************
   *@ RicardoZadinello BlumenauSC 24/10/2019 23:35PM
   */
public class Exercicio2{
    public static void main(String[] args){
    System.out.println("************************************************************************************************");
    System.out.println("** ANALISE OS ALGORITMOS ABAIXO E DIGA O QUE SERÁ IMPRESSO NA TELA AO SEREM EXECUTADOS:       **");
    System.out.println("**                                                                                            **");
    System.out.println("** [PHASE_1]     ** [PHASE_2]      ** [PHASE_3]  ** [PHASE_4]  ** [PHASE_5]  ** [PHASE_6]     **");
    System.out.println("** A = 10        ** A = 30         ** A = 10     ** A = 10     ** A = 10     ** X = 1         **");
    System.out.println("** B = 20        ** B = 20         ** B = 20     ** B = A + 1  ** B = 5      ** Y = 2         **");
    System.out.println("** Escrever B    ** c = (A +B)     ** C = A      ** A = B + 1  ** C = A + B  ** Z = Y -X      **");
    System.out.println("** B = 5         ** Escrever C     ** B = C      ** B = A + 1  ** B = 20     ** Escrever Z    **");
    System.out.println("** Escrever A    ** B = 10         ** A = B      ** Escrever A ** A = 10     ** X = 5         **");
    System.out.println("** Escrever B    ** Escrever B,C   ** Escrever A ** A = B +1   ** Escrever A ** Y = X + Z     **");
    System.out.println("**               ** C = (A+B))     ** Escrever B ** Escrever A ** Escrever B ** Escrever X, Y **");
    System.out.println("**               ** Escrever A,B,C ** Escrever C ** Escrever B ** Escrever C ** Escrever Z    **");
    System.out.println("************************************************************************************************");
    //Executando [FASE_1]
    System.out.println("*******[ PHASE_1 ]  =  The result is: **********************************************************");
            int A = 10;;
            int B = 20;
            System.out.print("O valor de B é " + B + "\n");        
            B = B + 5;
            System.out.print("O valor de A é " + A + "\n");
            System.out.print("O valor de B é " + B + "\n");
    //Executando [FASE_2]
    System.out.println("*******[ PHASE_2 ]  =  The result is: **********************************************************");
            int C;
            A = 30;
            B = 20;
            C = (A + B);
            System.out.print("O valor de C é " + C + "\n");                    
            B = 10;
            System.out.print("O valor de B é " + B + "\n");                    
            System.out.print("O valor de C é " + C + "\n");                    
            C = (A + B);
            System.out.print("O valor de A é " + A + "\n");                    
            System.out.print("O valor de B é " + B + "\n");                    
            System.out.print("O valor de C é " + C + "\n");                    
    //Executando [FASE_3]
    System.out.println("*******[ PHASE_3 ]  =  The result is: **********************************************************");
            A = 10;
            B = 20;
            C = A;
            B = C;
            A = B;
            System.out.print("O valor de A é " + A + "\n");
            System.out.print("O valor de B é " + B + "\n");
            System.out.print("O valor de C é " + C + "\n");
    //Executando [FASE_4]
    System.out.println("*******[ PHASE_4 ]  =  The result is: **********************************************************");            
            A = 10;
            B  = A + 1;
            A  = B + 1;
            B  = A + 1;
            System.out.print("O valor de A é " + A + "\n");
            A  = B + 1;
            System.out.print("O valor de A é " + A + "\n");
            System.out.print("O valor de B é " + B + "\n");
    //Executando [FASE_5]
    System.out.println("*******[ PHASE_5 ]  =  The result is: **********************************************************");
            A= 10;
            B = 5;
            C =(A + B);
            B = 20;
            A = 10;
            System.out.print("O valor de A é " + A + "\n");
            System.out.print("O valor de B é " + B + "\n");
            System.out.print("O valor de C é " + C + "\n");            
    //Executando [FASE_6]
    System.out.println("*******[ PHASE_5 ]  =  The result is: **********************************************************");
            int X = 1;
            int Y = 2;
            int Z =(Y - X);
            System.out.print("O valor de Z é " + Z + "\n");
            X = 5;
            Y = (X + Z);
            System.out.print("O valor de X é " + X + "\n");
            System.out.print("O valor de Y é " + Y + "\n");
            System.out.print("O valor de Z é " + Z + "\n");

   }

}
