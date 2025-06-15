package lista02;
import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {

    
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha um Número de 1 a 99");
        int num = sc.nextInt();
        boolean certo = false;
        int chute;                         
        while(certo == false){
            chute = random.nextInt(100); 
            System.out.println("Computador tentou: " + chute);
            if(chute == num){
                System.out.println("Computador acertou");
                certo = true;
            }
        }               
    }
    
} 
