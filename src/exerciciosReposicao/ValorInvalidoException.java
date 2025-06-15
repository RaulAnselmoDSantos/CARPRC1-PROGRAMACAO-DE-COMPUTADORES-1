package exerciciosReposicao;

/**
 * Exceção personalizada para valor inválido
 * 
 * Esta classe demonstra o conceito de exceções personalizadas em Java,
 * estendendo a classe Exception para criar um tipo específico de exceção
 * que representa a situação de valor inválido em uma operação bancária.
 * 
 * Exceções personalizadas permitem um tratamento mais específico e semântico
 * de erros na aplicação, melhorando a legibilidade e manutenção do código.
 */
public class ValorInvalidoException extends Exception {
    
    private double valorInvalido;
    
    /**
     * Construtor da exceção de valor inválido
     * 
     * @param mensagem Mensagem de erro
     * @param valorInvalido Valor inválido fornecido na operação
     */
    public ValorInvalidoException(String mensagem, double valorInvalido) {
        super(mensagem);
        this.valorInvalido = valorInvalido;
    }
    
    /**
     * Getter para o valor inválido
     * 
     * @return Valor inválido fornecido na operação
     */
    public double getValorInvalido() {
        return valorInvalido;
    }
}
