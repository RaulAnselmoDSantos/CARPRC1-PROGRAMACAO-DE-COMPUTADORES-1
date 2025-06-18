package lista07;

import java.io.IOException;

/**
 *
 * @author Raul feito para estudo
 */

public class Exercicio3TesteSalvarAgenda {
    public static void main(String[] args) {
        // 1) Cria agenda com capacidade para 5 contatos
        Agenda agenda = new Agenda(5);

        // 2) Adiciona alguns contatos
        agenda.adicionaContato(new PessoaFisica(
            "Ana Silva", "Rua A, 123", "ana@ex.com",
            "123.456.789-00", "10/02/1990", "Solteira"
        ));
        agenda.adicionaContato(new PessoaJuridica(
            "Tech Solutions Ltda", "Av. B, 456", "contato@tech.com",
            "12.345.678/0001-00", "987654321", "Tech Solutions"
        ));
        agenda.adicionaContato(new PessoaFisica(
            "José Souza", "Rua C, 789", "jose@ex.com",
            "987.654.321-00", "05/05/1985", "Casado"
        ));

        // 3) Grava em arquivo texto
        String arquivo = "agenda_lista7.txt";
        try {
            agenda.salvarAgenda(arquivo);
            System.out.println("Agenda salva em: " + arquivo);
        } catch (IOException e) {
            System.err.println("Erro ao salvar agenda: " + e.getMessage());
        }
    }
}
