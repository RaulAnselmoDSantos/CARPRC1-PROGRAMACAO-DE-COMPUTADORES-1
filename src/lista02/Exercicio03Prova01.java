
package lista02;

import java.util.Scanner;


public class Exercicio03Prova01 {

    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //identificar as entradas
    System.out.print("Entre com o horario de inicio em Horas (formato 24h): ");
    int entradaHora = sc.nextInt();
    System.out.print("Entre com o horario de inicio em minitos (formato 24h): ");
    int entradaMinuto = sc.nextInt();

    System.out.print("Entre com o horario de termino em hora (formato 24h): ");
    int saidaHora = sc.nextInt();
    System.out.print("Entre com o horario de termino em minuto(formato 24h): ");
    int saidaMinuto = sc.nextInt();

   
    int tempoD = 0;
        
    if(saidaHora < entradaHora){
          System.out.println("Hora de termino de jogo invalida, o jogo deve terminar no mesmo dia. Ex: dia x as 10h pode terminar ate o dia x as 23h59");
    } else {
        //convertendo tudo para minutos
        //calcula a duração do jogo
        tempoD = (int) ((int) (((saidaHora * 60) + saidaMinuto) - ((entradaHora * 60) + entradaMinuto)));
    }

    //Retorna o resultado em minutos
    System.out.println("Tempo de jogo em minutos: " + tempoD);
    }
    
}
