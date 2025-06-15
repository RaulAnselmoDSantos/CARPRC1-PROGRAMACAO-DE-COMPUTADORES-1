package exerciciosReposicao;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe ContaUniversitaria - Subclasse de ContaBancaria que implementa Transferencia
 * 
 * Esta classe demonstra o conceito de herança em Java, estendendo a classe abstrata
 * ContaBancaria e implementando seu método abstrato calcularTarifaMensal().
 * 
 * A ContaUniversitaria possui características específicas:
 * - Tarifa mensal de R$ 5,00
 * - Limite de saldo de R$ 5.000,00
 * - Impede depósitos que ultrapassem o limite
 * 
 * Este exemplo mostra como podemos sobrescrever métodos da superclasse para
 * adicionar comportamentos específicos, como a verificação de limite no método depositar().
 * 
 * Além disso, esta classe implementa a interface Transferencia, demonstrando como
 * uma classe pode herdar de uma superclasse e implementar uma interface simultaneamente.
 */
public class ContaUniversitaria extends ContaBancaria implements Transferencia {
    
    // Constante para o limite de saldo
    private static final double LIMITE_SALDO = 5000.0;
    
    /**
     * Construtor da classe ContaUniversitaria
     * 
     * @param numero Número da conta
     * @param agencia Número da agência
     * @param saldoInicial Saldo inicial da conta
     */
    public ContaUniversitaria(String numero, String agencia, double saldoInicial) {
        // Chama o construtor da superclasse (ContaBancaria)
        super(numero, agencia, saldoInicial);
        
        // Verifica se o saldo inicial não ultrapassa o limite
        if (saldoInicial > LIMITE_SALDO) {
            System.out.println("AVISO: Saldo inicial excede o limite de R$ " + LIMITE_SALDO);
            this.saldo = LIMITE_SALDO;
        }
    }
    
    /**
     * Implementação do método abstrato calcularTarifaMensal()
     * 
     * Para ContaUniversitaria, a tarifa é de R$ 5,00
     * 
     * @return Valor da tarifa mensal (R$ 5,00)
     */
    @Override
    public double calcularTarifaMensal() {
        return 5.0; // Tarifa de R$ 5,00
    }
    
    /**
     * Sobrescrita do método depositar para verificar o limite de saldo
     * 
     * @param valor Valor a ser depositado
     * @return true se o depósito foi realizado com sucesso
     */
    @Override
    public boolean depositar(double valor) {
        // Verifica se o valor é positivo
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
            return false;
        }
        
        // Verifica se o depósito ultrapassa o limite de saldo
        if (getSaldo() + valor > LIMITE_SALDO) {
            System.out.println("Depósito não realizado. Ultrapassaria o limite de R$ " + LIMITE_SALDO);
            return false;
        }
        
        // Realiza o depósito
        setSaldo(getSaldo() + valor);
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        return true;
    }
    
    /**
     * Implementação do método transferir da interface Transferencia
     * 
     * Este método verifica se há saldo suficiente, realiza o saque da conta
     * de origem e deposita o valor na conta de destino, respeitando o limite
     * de saldo da conta universitária.
     * 
     * @param destino Conta bancária de destino
     * @param valor Valor a ser transferido
     * @return true se a transferência foi realizada com sucesso
     */
    @Override
    public boolean transferir(ContaBancaria destino, double valor) {
        if (valor <= 0) {
            System.out.println("Valor de transferência inválido.");
            return false;
        }
        
        if (!temSaldoSuficiente(valor)) {
            System.out.println("Saldo insuficiente para transferência.");
            return false;
        }
        
        // Realiza o saque da conta de origem
        setSaldo(getSaldo() - valor);
        
        try {
            // Realiza o depósito na conta de destino
            destino.depositar(valor);
        } catch (ValorInvalidoException ex) {
            Logger.getLogger(ContaUniversitaria.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Transferência de R$ " + valor + " realizada com sucesso.");
        return true;
    }
    
    /**
     * Método toString para exibir informações da conta
     * 
     * @return String com informações da conta
     */
    @Override
    public String toString() {
        return "Conta Universitária - Número: " + numero + ", Agência: " + agencia + 
               ", Saldo: R$ " + saldo + ", Limite: R$ " + LIMITE_SALDO;
    }
}
