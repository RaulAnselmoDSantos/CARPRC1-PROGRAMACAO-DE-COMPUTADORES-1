
package lista02;

import java.util.Scanner;

public class Exercicio04Prova01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor, vOrdenado;
        vetor = new int[5];
        vOrdenado = new int[5];                   
        boolean existe = false;
        
        //Identificar a entrada:        
        System.out.println("Entre com os valores para o vetor de 20 posições (pode haver repetidos): ");
        //Percorrer o vetor original:
        for (int i = 0; i < 5;i++) {  
            System.out.print("Entre com o valor: ");
            vetor[i] = sc.nextInt();   
        //Criar um segundo vetor para armazenar os números únicos:
            for (int j = 0; j < 5; j++) {
                if (vOrdenado[j] == vetor[i]) {
                    existe = true;                                           
                }                 
            }              
        }
                
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
            System.out.println();
        }
        System.out.println("------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.print(vOrdenado[i] + " ");
            System.out.println();
        }
         

        
    }
    
}
