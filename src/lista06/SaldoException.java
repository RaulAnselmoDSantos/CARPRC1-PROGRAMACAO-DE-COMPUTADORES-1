
package lista06;

/**
 *
 * @author Raul
 */
public class SaldoException extends Exception {

    private double valorTentado;
    private double saldoAtual;
    
    public SaldoException(double valorTentado, double saldoAtual) {
        this.saldoAtual = saldoAtual;
        this.valorTentado = valorTentado;
    }
    
    @Override
    public String getMessage(){
        return String.format(
            "Saldo insuficiente: tentou sacar R$ %.2f, mas o saldo é R$ %.2f",
            valorTentado, saldoAtual
        );
    }
}
