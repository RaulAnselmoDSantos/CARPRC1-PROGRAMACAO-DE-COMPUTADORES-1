
package lista07;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Raul feito para estudo
 */

public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um número inteiro: ");
            int num = sc.nextInt();
            sc.close();

            String fileName = "tabuada_" + num + ".txt";
            BufferedWriter bw = null;
            try {
                bw = new BufferedWriter(new FileWriter(fileName));
                PrintWriter pw = new PrintWriter(bw);
                for (int i = 1; i <= 10; i++) {
                    pw.println(i + " x " + num + " = " + (i * num));
                }
                pw.flush();
                System.out.println("Arquivo gerado: " + fileName);
            } catch (IOException e) {
                System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
            } finally {
                if (bw != null) {
                    try {
                        bw.close();
                    } catch (IOException ex) {
                        System.err.println("Erro ao fechar o arquivo: " + ex.getMessage());
                    }
                }
            }
        }
}
