
package lista02;

import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {    
    public static int jokenpo(int j1, int j2){            
        if(j1 == j2 ){
            return 3;
        }
        if(j1 >= 3){
            return 4;
        }
        if(j2 >= 3){
            return 4;
        }
        switch (j1){
            case 0 -> { 
                return (j2 == 2) ? 0 : 1;  
            }
            case 1 -> { 
                return (j2 == 0) ? 0 : 1;  
            }
            case 2 -> { 
                return (j2 == 1) ? 0 : 1;  
            }
            default -> { 
                throw new IllegalArgumentException("Escolha invalida, apenas 0, 1 ou 2");
            }                
        }        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] opcoes = {"Pedra","Papel","Tesoura"};
        
        System.out.println("Escolha entre: Pedra - 0");
        System.out.println("Escolha entre: Papel - 1");
        System.out.println("Escolha entre: Tesoura - 2");
        System.out.print("Sua escolha: ");
        
        int escolha = sc.nextInt();
        int escolhaPc = rand.nextInt(3);
        
        if(escolha <= 2){
            System.out.printf("Sua escolha %s, Computador escolheu %s%n", opcoes[escolha], opcoes[escolhaPc]);
        }
        int vencedor = jokenpo(escolha, escolhaPc);
        
        if(vencedor == 3){
            System.out.println("Empate!!");            
        }else if(vencedor == 0){
            System.out.println("Voce venceu!!");            
        }else if(vencedor == 1){
            System.out.println("Voce Perdeu!!");            
        }else if(vencedor > 3){
            System.out.println("Escolha uma opcao valida");
        }       
    }    
}
