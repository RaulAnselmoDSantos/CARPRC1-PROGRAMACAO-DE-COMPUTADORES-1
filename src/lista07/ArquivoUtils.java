// ArquivoUtils.java
package lista07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Raul feito para estudo
 */

public class ArquivoUtils {
    /**
     * Busca e retorna linhas de um arquivo que contenham a substring indicada.
     *
     * @param caminhoArquivo caminho do arquivo texto
     * @param palavra        substring a buscar
     * @return lista de linhas que contêm a substring (pode ser vazia)
     * @throws IOException em caso de erro de leitura
     */
    public static List<String> buscarLinhasCom(String caminhoArquivo, String palavra) throws IOException {
        List<String> resultados = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                if (linha.contains(palavra)) {
                    resultados.add(linha);
                }
            }
        }
        return resultados;
    }
}