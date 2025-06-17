
package lista05;

/**
 *
 * @author Raul
 */

public class Conta {
    protected double saldo;
    
    public Conta(){
        this.saldo = 0.0;
    }
    
    public void deposita(double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Valor do deposito deve ser positivo");
        }
        saldo += valor;
    } 
    
    public void saca(double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Valor do saque deve ser positivo");
        }
        if(valor > saldo){
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        saldo -= valor;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
}
