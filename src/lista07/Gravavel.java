// Gravavel.java
package lista07;

import java.io.DataOutputStream;
import java.io.IOException;

/**
 *
 * @author Raul feito para estudo
 */

public interface Gravavel {
    /**
     * Grava o conteúdo do objeto em um DataOutputStream.
     * @param out fluxo de saída binário
     * @throws IOException se ocorrer erro de E/S
     */
    void gravar(DataOutputStream out) throws IOException;
}