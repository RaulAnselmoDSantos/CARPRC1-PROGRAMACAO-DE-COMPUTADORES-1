package exerciciosReposicao;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe ContaCorrente - Subclasse de ContaBancaria que implementa Transferencia e Pagamento
 * 
 * Esta classe demonstra o conceito de herança em Java, estendendo a classe abstrata
 * ContaBancaria e implementando seu método abstrato calcularTarifaMensal().
 * 
 * A herança permite que uma classe (subclasse) herde atributos e métodos de outra classe
 * (superclasse), possibilitando o reuso de código e a especialização de comportamentos.
 * 
 * Além disso, esta classe implementa as interfaces Transferencia e Pagamento, demonstrando como
 * uma classe pode herdar de uma superclasse e implementar múltiplas interfaces simultaneamente.
 * Isso permite que a classe ContaCorrente tenha o comportamento de uma conta bancária,
 * a capacidade de realizar transferências e efetuar pagamentos de boletos.
 */
public class ContaCorrente extends ContaBancaria implements Transferencia, Pagamento {
    
    // Taxa para pagamento de boletos
    private static final double TAXA_BOLETO = 2.0;
    
    /**
     * Construtor da classe ContaCorrente
     * 
     * @param numero Número da conta
     * @param agencia Número da agência
     * @param saldoInicial Saldo inicial da conta
     */
    public ContaCorrente(String numero, String agencia, double saldoInicial) {
        // Chama o construtor da superclasse (ContaBancaria)
        super(numero, agencia, saldoInicial);
    }
    
    /**
     * Implementação do método abstrato calcularTarifaMensal()
     * 
     * Para ContaCorrente, a tarifa é fixa em R$ 15,00
     * 
     * @return Valor da tarifa mensal (R$ 15,00)
     */
    @Override
    public double calcularTarifaMensal() {
        return 15.0; // Tarifa fixa de R$ 15,00
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
            Logger.getLogger(ContaCorrente.class.getName()).log(Level.SEVERE, null, ex);
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
        return "Conta Corrente - Número: " + numero + ", Agência: " + agencia + ", Saldo: R$ " + saldo;
    }
}
