package exerciciosReposicao;

/**
 * Interface funcional PoliticaTarifa
 * 
 * Esta interface demonstra o conceito de interface funcional em Java,
 * que é uma interface com apenas um método abstrato. Interfaces funcionais
 * podem ser implementadas usando expressões lambda, tornando o código mais
 * conciso e expressivo.
 * 
 * A anotação @FunctionalInterface garante que a interface tenha apenas um
 * método abstrato, permitindo seu uso com expressões lambda.
 */
@FunctionalInterface
public interface PoliticaTarifa {
    
    /**
     * Método para calcular a tarifa de uma conta bancária
     * 
     * @param conta Conta bancária para calcular a tarifa
     * @return Valor da tarifa calculada
     */
    double calcularTarifa(ContaBancaria conta);
}
