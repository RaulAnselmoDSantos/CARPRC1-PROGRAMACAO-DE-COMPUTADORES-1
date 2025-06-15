
package lista02;
import java.util.Scanner;

public class Exercicio7 {

    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int[] vetor1 = new int [5], vetor2 = new int[5], vetorResultado = new int[5] ;
        int tamanho = 0;
        
        System.out.print("Primeiro vetor entre com até 5 números inteiros: ");
        for(int i = 0; i < vetor1.length; i++){
            int num = sc.nextInt();
            vetor1[i] = num; 
        }
        System.out.print("Segundo vetor entre com até 5 números inteiros: ");
        for(int i = 0; i < vetor2.length; i++){
            int num2 = sc.nextInt();
            vetor2[i] = num2; 
            
            boolean jaFoi = false;
            
            for(int j = 0; j < tamanho; j++){
                if(vetorResultado[j] == vetor2[i]){
                    jaFoi = true;
                    break;
                }
            }
            if(!jaFoi){
                vetorResultado[tamanho++] = vetor2[i];
            }
        }
        System.out.println("");
        for(int i = 0; i < vetor1.length; i++){
            System.out.print(vetor1[i] + " ");
        }
        System.out.println("");
        for(int i = 0; i < vetor2.length; i++){
            System.out.print(vetor2[i] + " ");
        }
        System.out.println("");
        for(int i = 0; i < vetorResultado.length; i++){
            System.out.print(vetorResultado[i] + " ");
        }
        System.out.println("");
        
        
        
    }
    
}
