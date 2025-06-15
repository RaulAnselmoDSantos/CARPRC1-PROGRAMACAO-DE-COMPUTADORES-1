
package lista02;

import java.util.Scanner;


public class Exercicio9 {

    //exemplo:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a ordem da matriz quadrada (n): ");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        // Leitura da matriz
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        // Encontrar o maior elemento e sua linha
        int maior = matriz[0][0];
        int linhaDoMaior = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linhaDoMaior = i;
                }
            }
        }

        // Encontrar o menor elemento da linha onde está o maior
        int minimax = matriz[linhaDoMaior][0];
        for (int j = 1; j < n; j++) {
            if (matriz[linhaDoMaior][j] < minimax) {
                minimax = matriz[linhaDoMaior][j];
            }
        }

        System.out.println("Maior elemento da matriz: " + maior);
        System.out.println("Linha do maior elemento: " + linhaDoMaior);
        System.out.println("MINIMAX: " + minimax);
    }
    
}
