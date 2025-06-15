package exerciciosReposicao;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe ContaEmpresarial - Subclasse de ContaBancaria que implementa Transferencia e Pagamento
 * 
 * Esta classe demonstra o conceito de herança em Java, estendendo a classe abstrata
 * ContaBancaria e implementando as interfaces Transferencia e Pagamento.
 * 
 * A ContaEmpresarial possui características específicas:
 * - Tarifa mensal de R$ 30,00
 * - Impede saques abaixo de R$ 100,00
 * 
 * Este exemplo mostra como uma classe pode herdar de uma superclasse e implementar
 * múltiplas interfaces simultaneamente, demonstrando o conceito de herança múltipla
 * de comportamento em Java.
 */
public class ContaEmpresarial extends ContaBancaria implements Transferencia, Pagamento {
    
    // Constantes
    private static final double TARIFA_MENSAL = 30.0;
    private static final double SAQUE_MINIMO = 100.0;
    private static final double TAXA_BOLETO = 2.0;
    
    /**
     * Construtor da classe ContaEmpresarial
     * 
     * @param numero Número da conta
     * @param agencia Número da agência
     * @param saldoInicial Saldo inicial da conta
     */
    public ContaEmpresarial(String numero, String agencia, double saldoInicial) {
        // Chama o construtor da superclasse (ContaBancaria)
        super(numero, agencia, saldoInicial);
    }
    
    /**
     * Implementação do método abstrato calcularTarifaMensal()
     * 
     * Para ContaEmpresarial, a tarifa é de R$ 30,00
     * 
     * @return Valor da tarifa mensal (R$ 30,00)
     */
    @Override
    public double calcularTarifaMensal() {
        return TARIFA_MENSAL;
    }
    
    /**
     * Sobrescrita do método sacar para impedir saques abaixo de R$ 100,00
     * 
     * @param valor Valor a ser sacado
     * @return true se o saque foi realizado com sucesso
     */
    @Override
    public boolean sacar(double valor) {
        // Verifica se o valor é menor que o saque mínimo
        if (valor < SAQUE_MINIMO) {
            System.out.println("Saque não permitido. Valor mínimo: R$ " + SAQUE_MINIMO);
            return false;
        }
        
        try {
            // Chama o método sacar da superclasse
            return super.sacar(valor);
        } catch (ValorInvalidoException ex) {
            Logger.getLogger(ContaEmpresarial.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SaldoInsuficienteException ex) {
            Logger.getLogger(ContaEmpresarial.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    /**
     * Implementação do método transferir da interface Transferencia
     * 
     * Este método verifica se há saldo suficiente, realiza o saque da conta
     * de origem e deposita o valor na conta de destino.
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
            Logger.getLogger(ContaEmpresarial.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Transferência de R$ " + valor + " realizada com sucesso.");
        return true;
    }
    
    /**
     * Implementação do método pagarBoleto da interface Pagamento
     * 
     * Este método verifica se há saldo suficiente, realiza o pagamento do boleto
     * e debita o valor com uma taxa adicional de R$ 2,00.
     * 
     * @param codigo Código do boleto
     * @param valor Valor do boleto
     * @return true se o pagamento foi realizado com sucesso
     */
    @Override
    public boolean pagarBoleto(String codigo, double valor) {
        if (valor <= 0) {
            System.out.println("Valor de boleto inválido.");
            return false;
        }
        
        double valorTotal = valor + TAXA_BOLETO;
        
        if (!temSaldoSuficiente(valorTotal)) {
            System.out.println("Saldo insuficiente para pagamento do boleto.");
            return false;
        }
        
        // Realiza o pagamento do boleto
        setSaldo(getSaldo() - valorTotal);
        
        System.out.println("Boleto " + codigo + " no valor de R$ " + valor + 
                           " pago com sucesso. Taxa de R$ " + TAXA_BOLETO + " aplicada.");
        System.out.println("Valor total debitado: R$ " + valorTotal);
        return true;
    }
    
    /**
     * Método toString para exibir informações da conta
     * 
     * @return String com informações da conta
     */
    @Override
    public String toString() {
        return "Conta Empresarial - Número: " + numero + ", Agência: " + agencia + 
               ", Saldo: R$ " + saldo + ", Saque mínimo: R$ " + SAQUE_MINIMO;
    }
}
