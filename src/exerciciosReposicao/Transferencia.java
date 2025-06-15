package exerciciosReposicao;

/**
 * Interface Transferencia
 * 
 * Uma interface em Java é uma coleção de métodos abstratos (sem implementação)
 * e constantes. Interfaces definem um contrato que as classes implementadoras
 * devem seguir, especificando quais métodos devem ser implementados.
 * 
 * Diferente das classes abstratas, interfaces não podem conter implementações de métodos
 * (exceto métodos default e static introduzidos no Java 8), nem atributos de instância.
 * 
 * Neste exemplo, a interface Transferencia define o comportamento de transferência
 * entre contas bancárias, que será implementado por diferentes tipos de contas.
 */
public interface Transferencia {
    
    /**
     * Método para transferir valor para outra conta
     * 
     * @param destino Conta bancária de destino
     * @param valor Valor a ser transferido
     * @return true se a transferência foi realizada com sucesso
     */
    boolean transferir(ContaBancaria destino, double valor);
}
