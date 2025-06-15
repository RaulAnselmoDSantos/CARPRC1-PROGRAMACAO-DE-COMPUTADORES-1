package exerciciosReposicao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Classe RegistroOperacoes
 * 
 * Esta classe implementa o registro e rastreamento de operações bancárias,
 * permitindo manter um histórico de todas as transações realizadas em uma conta.
 * 
 * O registro de operações é uma prática importante em sistemas bancários,
 * permitindo auditoria, rastreabilidade e geração de extratos para os clientes.
 */
public class RegistroOperacoes {
    
    // Lista de operações realizadas
    private List<Operacao> operacoes;
    
    /**
     * Construtor da classe RegistroOperacoes
     */
    public RegistroOperacoes() {
        this.operacoes = new ArrayList<>();
    }
    
    /**
     * Adiciona uma nova operação ao registro
     * 
     * @param tipo Tipo da operação
     * @param valor Valor da operação
     * @param descricao Descrição da operação
     */
    public void registrarOperacao(TipoOperacao tipo, double valor, String descricao) {
        Operacao operacao = new Operacao(tipo, valor, descricao);
        operacoes.add(operacao);
    }
    
    /**
     * Imprime o extrato de operações
     */
    public void imprimirExtrato() {
        System.out.println("\n===== EXTRATO DE OPERAÇÕES =====");
        
        if (operacoes.isEmpty()) {
            System.out.println("Nenhuma operação registrada.");
        } else {
            for (Operacao op : operacoes) {
                System.out.println(op);
            }
        }
        
        System.out.println("==============================");
    }
    
    /**
     * Retorna a lista de operações
     * 
     * @return Lista de operações
     */
    public List<Operacao> getOperacoes() {
        return new ArrayList<>(operacoes); // Retorna uma cópia da lista
    }
    
    /**
     * Classe interna para representar uma operação bancária
     */
    public class Operacao {
        private Date data;
        private TipoOperacao tipo;
        private double valor;
        private String descricao;
        
        /**
         * Construtor da classe Operacao
         * 
         * @param tipo Tipo da operação
         * @param valor Valor da operação
         * @param descricao Descrição da operação
         */
        public Operacao(TipoOperacao tipo, double valor, String descricao) {
            this.data = new Date();
            this.tipo = tipo;
            this.valor = valor;
            this.descricao = descricao;
        }
        
        /**
         * Retorna a representação em string da operação
         */
        @Override
        public String toString() {
            return String.format("[%s] %s: R$ %.2f - %s", 
                    data, tipo.getDescricao(), valor, descricao);
        }
        
        // Getters
        public Date getData() { return data; }
        public TipoOperacao getTipo() { return tipo; }
        public double getValor() { return valor; }
        public String getDescricao() { return descricao; }
    }
    
    /**
     * Enumeração para os tipos de operação
     */
    public enum TipoOperacao {
        DEPOSITO("Depósito"),
        SAQUE("Saque"),
        TRANSFERENCIA_ENVIADA("Transferência Enviada"),
        TRANSFERENCIA_RECEBIDA("Transferência Recebida"),
        PAGAMENTO("Pagamento de Boleto"),
        TARIFA("Tarifa Mensal");
        
        private String descricao;
        
        TipoOperacao(String descricao) {
            this.descricao = descricao;
        }
        
        public String getDescricao() {
            return descricao;
        }
    }
}
