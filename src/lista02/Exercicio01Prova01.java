
package lista02;

import java.util.Scanner;

public class Exercicio01Prova01 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //identificar as entradas  tempos de 24h = 00h meia noite, 12h meio dia. 
        System.out.print("Entre com o horario de entrada Horas: ");
        int entradaHora = sc.nextInt();
        System.out.print("Entre com o horario de entrada minitos: ");
        int entradaMinuto = sc.nextInt();

        System.out.print("Entre com o horario de saida hora (formato 24h): ");
        int saidaHora = sc.nextInt();
        System.out.print("Entre com o horario de saida minuto(formato 24h): ");
        int saidaMinuto = sc.nextInt();

        
        
        int tempoD;
        float custo;
        //convertendo tudo para minutos
        if(saidaHora < entradaHora){            
            // 1440 é o tempo de 24h em minutos, usado para abater do tempo quando a hora de saída for menor que a entrada
            // Ex: entrada 10h saída 09h do dia seguinte, fazemos 24 - (10 - 9) = 23h de estacionadas.
            // calculando o tempo estacionado
            tempoD = (int) ((int) ((1440 - (((entradaHora * 60) + entradaMinuto) - ((saidaHora * 60) + saidaMinuto)))));
        } else {
            tempoD = (int) ((int) ((((((saidaHora * 60) + saidaMinuto) - (entradaHora * 60) + entradaMinuto)))));
        }              

        //Arredondando tarifas com base no tempo 
        //Calculando preço
        if(tempoD < 60 ){
            System.out.println("Total a pagar e R$ 1" );
        }
        if(tempoD > 60 && tempoD <= 120){
            System.out.println("Total a pagar e R$ 2 ");
        }
        if(tempoD > 120 && tempoD <= 180){
            System.out.println("Total a pagar e R$ 2");
        }
        if(tempoD > 180 && tempoD <= 240){
            System.out.println("Total a pagar e R$ 3.40");
        }
        if(tempoD > 240 && tempoD <= 300){
            System.out.println("Total a pagar e R$ 3.40");
        }
        if(tempoD > 300 && tempoD <= 360){
            System.out.println("Total a pagar e R$ " + (3.40 + 2));
        }
        if(tempoD > 360){
            tempoD = tempoD - 300;
            custo = (float) tempoD/60;
            System.out.println("Total a pagar e R$ " + (5.40 + (custo * 2)));
        }
        
    } 
    
}
