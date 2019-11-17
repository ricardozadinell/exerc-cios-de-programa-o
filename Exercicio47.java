/**
  *Exercicio47.java
  *
  * A nota final de um estudante é calculada a partir de três notas atribuídas, respectivamente, a um traba-lho de laboratório, 
  * a uma avaliação semestral e a um exame final. A média das três notas mencionadas obedece aos pesos a seguir:
  * ::::::::::::::::::::::::::::::::::::::::::::::::::::
  * ::         Nota                    ::      PESO   ::
  * :: Trabalho de laboratório         ::       2     ::
  * :: Avaliação semestral             ::       3     ::
  * :: Exame final                     ::       5     ::
  * ::::::::::::::::::::::::::::::::::::::::::::::::::::
  * Faça um programa que receba as três notas, calcule e mostre a média ponderada e o conceito que segue a tabela:
  * MÉDIA PONDERADA
  * :::::::::::::::::::::::::::::::::::::::::::::::::::: 
  * ::         Nota Ponderada           ::  conceito  ::
  * :: 8.0 à  10.0                      ::      A     ::
  * :: 7.0  à  8.0                      ::      B     ::
  * :: 6.0  à  7.0                      ::      C     ::
  * :: 5.0  à  6.0                      ::      D     ::
  * :: 0.0  à  5.0                      ::      E     ::
  * ::::::::::::::::::::::::::::::::::::::::::::::::::::
  */
public class Exercicio47{
    public static void main(String[] args){
        double TrabalhoDeLaboratório = 2;
        double AvaliacaoSemestral = 3;
        double ExameFinal = 5;
        double MediaPonderada;

	MediaPonderada = ExameFinal + AvaliacaoSemestral + TrabalhoDeLaboratório;
            if(MediaPonderada >= 8.0){
                System.out.println("CONCEITO: A , sua nota ponderada foi: "+ MediaPonderada + "\n");
            }else if ((MediaPonderada >= 7.0)&&(MediaPonderada <= 8.0)){
                System.out.println("CONCEITO: B , sua nota ponderada foi: "+ MediaPonderada + "\n");
            }else if ((MediaPonderada >= 6.0)&&(MediaPonderada <= 7.0)){
                System.out.println("CONCEITO: C , sua nota ponderada foi: "+ MediaPonderada + "\n");             
            }else if ((MediaPonderada >= 5.0)&&(MediaPonderada <= 6.0)){
                System.out.println("CONCEITO: D , sua nota ponderada foi: "+ MediaPonderada + "\n");             
            }else{
                System.out.println("CONCEITO: E , sua nota ponderada foi: "+ MediaPonderada + "\n");             
	    }
    }
}
