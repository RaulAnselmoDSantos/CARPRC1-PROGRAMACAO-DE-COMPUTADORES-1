
package lista06;

/**
 *
 * @author Raul
 */
public class Conta {
    protected double saldo;
    
    public Conta(){
        this.saldo = 0.0;
    }
    
    public void deposita(double valor) throws SaldoException{
        if(valor <= 0){
            throw new IllegalArgumentException("Valor do deposito deve ser positivo");
        }
        saldo += valor;
    } 
    
    public void saca(double valor)throws SaldoException{
        if(valor <= 0){
            throw new IllegalArgumentException("Valor do saque deve ser positivo");
        }
        if(valor > saldo){
            throw new SaldoException(valor, saldo);
        }
        saldo -= valor;
    }
    
    public double getSaldo(){
        return saldo;
    }
}
