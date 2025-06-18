
package lista07;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Raul feito para estudo
 */

public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número cuja tabuada deseja ler: ");
        int num = sc.nextInt();
        sc.close();

        String fileName = "tabuada_" + num + ".txt";
        BufferedReader br = null;
        try {
            // Abre o arquivo para leitura
            br = new BufferedReader(new FileReader(fileName));
            String linha;
            System.out.println("Conteúdo de " + fileName + ":");
            // Lê linha a linha até EOF
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não existe: " + fileName);
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    System.err.println("Erro ao fechar o arquivo: " + ex.getMessage());
                }
            }
        }
    }
    
}
