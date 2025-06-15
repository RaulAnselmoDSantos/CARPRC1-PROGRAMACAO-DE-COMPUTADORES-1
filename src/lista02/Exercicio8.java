
package lista02;

import java.util.Scanner;


public class Exercicio8 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor1 = new int[5];

        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            vetor1[i] = sc.nextInt();
        }

        // Bubble Sort
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (vetor1[j] > vetor1[j + 1]) {
                    int temp = vetor1[j];
                    vetor1[j] = vetor1[j + 1];
                    vetor1[j + 1] = temp;
                }
            }
        }

        System.out.println("Vetor ordenado:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor1[i] + " ");
        }
        System.out.println();
    }
    
}
