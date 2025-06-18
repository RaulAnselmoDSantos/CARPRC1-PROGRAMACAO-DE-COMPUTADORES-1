// Gravador.java
package lista07;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Raul feito para estudo
 */
public class Gravador {
    
    public static void salvar(List<? extends Gravavel> registros, String arquivo) throws IOException {
        try (DataOutputStream out = new DataOutputStream(
                 new FileOutputStream(arquivo /* append=false */))) {
          for (Gravavel g : registros) {
            g.gravar(out);
          }
        }
    }
    
    public static void salvarAppend(List<? extends Gravavel> registros, String arquivo) throws IOException {
        try (DataOutputStream out = new DataOutputStream(
                 new FileOutputStream(arquivo, /* append = */ true))) {
          for (Gravavel g : registros) {
            g.gravar(out);
          }
        }
    }
}