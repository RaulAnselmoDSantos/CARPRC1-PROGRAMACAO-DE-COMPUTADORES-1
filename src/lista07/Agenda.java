// Agenda.java
package lista07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Raul feito para estudo
 */

public class Agenda {
    private Contato[] contatos;
    private int quantidadeContatos = 0;

    public Agenda(int tamanho) {
        contatos = new Contato[tamanho];
    }

    public void adicionaContato(Contato contato) {
        if (quantidadeContatos < contatos.length) {
            contatos[quantidadeContatos++] = contato;
        } else {
            System.out.println("Agenda cheia");
        }
    }

    public void removeContato(String nome) {
        for (int i = 0; i < quantidadeContatos; i++) {
            if (contatos[i].getNome().equalsIgnoreCase(nome)) {
                for (int j = i; j < quantidadeContatos - 1; j++) {
                    contatos[j] = contatos[j + 1];
                }
                contatos[--quantidadeContatos] = null;
                System.out.println("Contato \"" + nome + "\" removido");
                return;
            }
        }
        System.out.println("Contato \"" + nome + "\" não encontrado");
    }

    public Contato buscaPorNome(String nome) {
        for (int i = 0; i < quantidadeContatos; i++) {
            if (contatos[i].getNome().equalsIgnoreCase(nome)) {
                return contatos[i];
            }
        }
        return null;
    }

    public Contato buscaPorDocumento(String documento) {
        for (int i = 0; i < quantidadeContatos; i++) {
            if (contatos[i].getDocumento().equalsIgnoreCase(documento)) {
                return contatos[i];
            }
        }
        return null;
    }

    public void ordenar() {
        for (int i = 0; i < quantidadeContatos - 1; i++) {
            for (int j = 0; j < quantidadeContatos - 1 - i; j++) {
                boolean atualEhPJ   = contatos[j]   instanceof PessoaJuridica;
                boolean proximoEhPF = contatos[j+1] instanceof PessoaFisica;
                if (atualEhPJ && proximoEhPF) {
                    Contato temp = contatos[j];
                    contatos[j]   = contatos[j+1];
                    contatos[j+1] = temp;
                }
            }
        }
    }

    public void exibeTodos() {
        for (int i = 0; i < quantidadeContatos; i++) {
            contatos[i].exibeContato();
        }
    }

    public void salvarAgenda(String caminhoArquivo) throws IOException {
        ordenar();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            for (int i = 0; i < quantidadeContatos; i++) {
                Contato c = contatos[i];
                StringBuilder sb = new StringBuilder();
                if (c instanceof PessoaFisica) {
                    PessoaFisica pf = (PessoaFisica) c;
                    sb.append("PF").append('#')
                      .append(pf.getNome()).append('#')
                      .append(pf.getEndereco()).append('#')
                      .append(pf.getEmail()).append('#')
                      .append(pf.getDocumento()).append('#')
                      .append(pf.getDataNascimento()).append('#')
                      .append(pf.getEstadoCivil());
                } else if (c instanceof PessoaJuridica) {
                    PessoaJuridica pj = (PessoaJuridica) c;
                    sb.append("PJ").append('#')
                      .append(pj.getNome()).append('#')
                      .append(pj.getEndereco()).append('#')
                      .append(pj.getEmail()).append('#')
                      .append(pj.getDocumento()).append('#')
                      .append(pj.getInscricaoEstadual()).append('#')
                      .append(pj.getRazaoSocial());
                }
                bw.write(sb.toString());
                bw.newLine();
            }
        }
    }
}
