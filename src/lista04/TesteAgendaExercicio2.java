
package lista04;

/**
 *
 * @author Raul
 */
public class TesteAgendaExercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1) Cria uma agenda com capacidade para 5 contatos
        Agenda agenda = new Agenda(5);

        // 2) Adiciona contatos de ambos os tipos
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

        // 3) Exibe todos na ordem de inserção
        System.out.println("-- Agenda (inserção) --");
        agenda.exibeTodos();

        // 4) Ordena para mostrar PF antes de PJ
        agenda.ordenar();
        System.out.println("\n-- Agenda (ordenada PF→PJ) --");
        agenda.exibeTodos();

        // 5) Busca por nome
        System.out.println("\n-- Busca por nome 'José Souza' --");
        Contato encontrado = agenda.buscaPorNome("José Souza");
        if (encontrado != null) {
            encontrado.exibeContato();
        } else {
            System.out.println("Contato não encontrado.");
        }

        // 6) Busca por documento (CPF/CNPJ)
        System.out.println("\n-- Busca por documento '12.345.678/0001-00' --");
        encontrado = agenda.buscaPorDocumento("12.345.678/0001-00");
        if (encontrado != null) {
            encontrado.exibeContato();
        } else {
            System.out.println("Contato não encontrado.");
        }

        // 7) Remove um contato pelo nome
        System.out.println("\n-- Removendo 'Ana Silva' --");
        agenda.removeContato("Ana Silva");
        agenda.exibeTodos();

        // 8) Tenta remover um nome inexistente
        System.out.println("\n-- Tentativa de remover 'Carlos' --");
        agenda.removeContato("Carlos");
    }
 
}
