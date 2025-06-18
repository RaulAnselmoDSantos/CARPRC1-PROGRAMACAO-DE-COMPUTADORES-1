// AgendaLoader.java
package lista07;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author Raul feito para estudo
 */

public class AgendaLoader {
    private final String arquivo;

    public AgendaLoader(String arquivo) {
        this.arquivo = arquivo;
    }

    /**
     * Carrega o primeiro contato cujo nome case exatamente com o parâmetro.
     * @param nome nome exato do contato
     * @return Contato instanciado ou null
     * @throws IOException em caso de erro de leitura
     */
    public Contato carregarPorNome(String nome) throws IOException {
        List<String> linhas = ArquivoUtils.buscarLinhasCom(arquivo, nome);
        if (linhas.isEmpty()) {
            return null;
        }
        String[] campos = linhas.get(0).split("#");
        String tipo = campos[0];
        String nm   = campos[1];
        String end  = campos[2];
        String em   = campos[3];
        if ("PF".equals(tipo)) {
            return new PessoaFisica(
                nm, end, em,
                campos[4], campos[5], campos[6]
            );
        } else {
            return new PessoaJuridica(
                nm, end, em,
                campos[4], campos[5], campos[6]
            );
        }
    }
}