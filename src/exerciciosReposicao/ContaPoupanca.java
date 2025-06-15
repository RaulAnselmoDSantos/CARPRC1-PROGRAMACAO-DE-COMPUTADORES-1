package exerciciosReposicao;

/**
 * Classe ContaPoupanca - Subclasse de ContaBancaria
 * 
 * Esta classe demonstra o conceito de herança em Java, estendendo a classe abstrata
 * ContaBancaria e implementando seu método abstrato calcularTarifaMensal().
 * 
 * A ContaPoupanca é um tipo específico de conta bancária que possui tarifa zero,
 * demonstrando como diferentes subclasses podem implementar comportamentos distintos
 * para o mesmo método abstrato da superclasse.
 */
public class ContaPoupanca extends ContaBancaria {
    
    /**
     * Construtor da classe ContaPoupanca
     * 
     * @param numero Número da conta
     * @param agencia Número da agência
     * @param saldoInicial Saldo inicial da conta
     */
    public ContaPoupanca(String numero, String agencia, double saldoInicial) {
        // Chama o construtor da superclasse (ContaBancaria)
        super(numero, agencia, saldoInicial);
    }
    
    /**
     * Implementação do método abstrato calcularTarifaMensal()
     * 
     * Para ContaPoupanca, a tarifa é zero (isenta)
     * 
     * @return Valor da tarifa mensal (0.0)
     */
    @Override
    public double calcularTarifaMensal() {
        return 0.0; // Tarifa zero
    }
    
    /**
     * Método toString para exibir informações da conta
     * 
     * @return String com informações da conta
     */
    @Override
    public String toString() {
        return "Conta Poupança - Número: " + numero + ", Agência: " + agencia + ", Saldo: R$ " + saldo;
    }
}
