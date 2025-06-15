package exerciciosReposicao;

/**
 * Interface Pagamento
 * 
 * Uma interface em Java é uma coleção de métodos abstratos (sem implementação)
 * e constantes. Interfaces definem um contrato que as classes implementadoras
 * devem seguir, especificando quais métodos devem ser implementados.
 * 
 * Neste exemplo, a interface Pagamento define o comportamento de pagamento
 * de boletos, que será implementado por diferentes tipos de contas.
 * 
 * Uma classe pode implementar múltiplas interfaces, permitindo que ela
 * tenha comportamentos de diferentes "contratos" simultaneamente.
 */
public interface Pagamento {
    
    /**
     * Método para pagar boleto
     * 
     * @param codigo Código do boleto
     * @param valor Valor do boleto
     * @return true se o pagamento foi realizado com sucesso
     */
    boolean pagarBoleto(String codigo, double valor);
}
