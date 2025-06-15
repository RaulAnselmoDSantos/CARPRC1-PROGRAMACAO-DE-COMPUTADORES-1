package exerciciosReposicao;

/**
 * Classe utilitária Banco
 * 
 * Esta classe demonstra o conceito de métodos estáticos em Java, que pertencem à classe
 * e não a instâncias específicas. Métodos estáticos são úteis para operações utilitárias
 * que não dependem do estado de um objeto específico.
 * 
 * A classe Banco fornece métodos para realizar operações bancárias comuns, como transferências
 * e pagamentos, de forma centralizada, utilizando as interfaces Transferencia e Pagamento.
 */
public class Banco {
    
    /**
     * Método estático para realizar transferência entre contas
     * 
     * Este método utiliza o polimorfismo e interfaces para realizar uma transferência
     * de uma conta que implementa a interface Transferencia para qualquer ContaBancaria.
     * 
     * @param origem Conta de origem que implementa a interface Transferencia
     * @param destino Conta de destino
     * @param valor Valor a ser transferido
     * @return true se a transferência foi realizada com sucesso
     */
    public static boolean realizarTransferencia(Transferencia origem, ContaBancaria destino, double valor) {
        if (valor <= 0) {
            System.out.println("Valor de transferência inválido.");
            return false;
        }
        
        System.out.println("Banco: Iniciando transferência de R$ " + valor);
        boolean resultado = origem.transferir(destino, valor);
        
        if (resultado) {
            System.out.println("Banco: Transferência concluída com sucesso.");
        } else {
            System.out.println("Banco: Transferência não realizada.");
        }
        
        return resultado;
    }
    
    /**
     * Método estático para realizar pagamento de boleto
     * 
     * Este método utiliza o polimorfismo e interfaces para realizar um pagamento
     * de boleto a partir de uma conta que implementa a interface Pagamento.
     * 
     * @param conta Conta que implementa a interface Pagamento
     * @param codigo Código do boleto
     * @param valor Valor do boleto
     * @return true se o pagamento foi realizado com sucesso
     */
    public static boolean realizarPagamento(Pagamento conta, String codigo, double valor) {
        if (valor <= 0) {
            System.out.println("Valor de pagamento inválido.");
            return false;
        }
        
        System.out.println("Banco: Iniciando pagamento de boleto " + codigo + " no valor de R$ " + valor);
        boolean resultado = conta.pagarBoleto(codigo, valor);
        
        if (resultado) {
            System.out.println("Banco: Pagamento concluído com sucesso.");
        } else {
            System.out.println("Banco: Pagamento não realizado.");
        }
        
        return resultado;
    }
}
