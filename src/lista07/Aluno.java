// Aluno.java
package lista07;

import java.io.DataOutputStream;
import java.io.IOException;

/**
 *
 * @author Raul feito para estudo
 */

public class Aluno implements Gravavel {
    private String nome;
    private int codigo;
    private int nota1;
    private int nota2;

    public Aluno(String nome, int codigo, int nota1, int nota2) {
        this.nome = nome;
        this.codigo = codigo;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getNota1() {
        return nota1;
    }

    public int getNota2() {
        return nota2;
    }

    @Override
    public void gravar(DataOutputStream out) throws IOException {
        // 1) grava tamanho do nome e cada caractere
        out.writeInt(nome.length());
        for (char c : nome.toCharArray()) {
            out.writeChar(c);
        }
        // 2) grava código e notas
        out.writeInt(codigo);
        out.writeInt(nota1);
        out.writeInt(nota2);
    }
}