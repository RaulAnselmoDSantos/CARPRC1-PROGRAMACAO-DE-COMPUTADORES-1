// TesteCarregarContato.java
package lista07;

import java.io.IOException;

/**
 *
 * @author Raul feito para estudo
 */

public class Exercicio3TesteCarregarContato {
    public static void main(String[] args) {
        String arquivo = "agenda_lista7.txt";
        AgendaLoader loader = new AgendaLoader(arquivo);

        try {
            Contato c1 = loader.carregarPorNome("José Souza");
            if (c1 != null) {
                System.out.println("Contato encontrado:");
                c1.exibeContato();
            } else {
                System.out.println("Contato José Souza não encontrado.");
            }

            Contato c2 = loader.carregarPorNome("Carlos");
            if (c2 != null) {
                System.out.println("Contato encontrado:");
                c2.exibeContato();
            } else {
                System.out.println("Contato Carlos não encontrado.");
            }
        } catch (IOException e) {
            System.err.println("Falha ao ler o arquivo: " + e.getMessage());
        }
    }
}
