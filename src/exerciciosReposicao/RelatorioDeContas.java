package exerciciosReposicao;

import java.util.List;

/**
 * Classe RelatorioDeContas
 * 
 * Esta classe demonstra o uso de polimorfismo e do operador instanceof para
 * trabalhar com diferentes tipos de contas bancárias de forma genérica.
 * 
 * O polimorfismo permite tratar objetos de diferentes subclasses através de uma
 * referência da superclasse, possibilitando o processamento de diferentes tipos
 * de objetos de maneira uniforme.
 * 
 * O operador instanceof é usado para verificar o tipo real de um objeto em tempo
 * de execução, permitindo comportamentos específicos para cada tipo.
 */
public class RelatorioDeContas {
    
    /**
     * Método para gerar relatório de contas
     * 
     * @param contas Lista de contas bancárias
     */
    public void gerarRelatorio(List<ContaBancaria> contas) {
        System.out.println("\n===== RELATÓRIO DE CONTAS =====");
        System.out.println("Total de contas: " + contas.size());
        
        for (ContaBancaria conta : contas) {
            System.out.println("\n----- Informações da Conta -----");
            
            // Usando instanceof para identificar o tipo específico da conta
            if (conta instanceof ContaCorrente) {
                System.out.println("Tipo: Conta Corrente");
            } else if (conta instanceof ContaPoupanca) {
                System.out.println("Tipo: Conta Poupança");
            } else if (conta instanceof ContaUniversitaria) {
                System.out.println("Tipo: Conta Universitária");
            } else if (conta instanceof ContaEmpresarial) {
                System.out.println("Tipo: Conta Empresarial");
            } else {
                System.out.println("Tipo: Conta Bancária (tipo específico não identificado)");
            }
            
            // Exibindo saldo e tarifa
            System.out.println("Saldo: R$ " + conta.consultarSaldo());
            System.out.println("Tarifa mensal: R$ " + conta.calcularTarifaMensal());
            
            // Verificando recursos adicionais
            if (conta instanceof Transferencia) {
                System.out.println("Recurso: Pode realizar transferências");
            }
            
            if (conta instanceof Pagamento) {
                System.out.println("Recurso: Pode realizar pagamentos de boletos");
            }
        }
        
        System.out.println("\n===== FIM DO RELATÓRIO =====");
    }
}
