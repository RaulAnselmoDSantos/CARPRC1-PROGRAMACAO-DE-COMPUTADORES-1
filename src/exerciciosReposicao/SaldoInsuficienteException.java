package exerciciosReposicao;

/**
 * Exceção personalizada para saldo insuficiente
 * 
 * Esta classe demonstra o conceito de exceções personalizadas em Java,
 * estendendo a classe Exception para criar um tipo específico de exceção
 * que representa a situação de saldo insuficiente em uma conta bancária.
 * 
 * Exceções personalizadas permitem um tratamento mais específico e semântico
 * de erros na aplicação, melhorando a legibilidade e manutenção do código.
 */
public class SaldoInsuficienteException extends Exception {
    
    private double saldoAtual;
    private double valorSolicitado;
    
    /**
     * Construtor da exceção de saldo insuficiente
     * 
     * @param mensagem Mensagem de erro
     * @param saldoAtual Saldo atual da conta
     * @param valorSolicitado Valor solicitado na operação
     */
    public SaldoInsuficienteException(String mensagem, double saldoAtual, double valorSolicitado) {
        super(mensagem);
        this.saldoAtual = saldoAtual;
        this.valorSolicitado = valorSolicitado;
    }
    
    /**
     * Getter para o saldo atual
     * 
     * @return Saldo atual da conta
     */
    public double getSaldoAtual() {
        return saldoAtual;
    }
    
    /**
     * Getter para o valor solicitado
     * 
     * @return Valor solicitado na operação
     */
    public double getValorSolicitado() {
        return valorSolicitado;
    }
    
    /**
     * Retorna a diferença entre o saldo atual e o valor solicitado
     * 
     * @return Valor faltante para realizar a operação
     */
    public double getValorFaltante() {
        return valorSolicitado - saldoAtual;
    }
}
