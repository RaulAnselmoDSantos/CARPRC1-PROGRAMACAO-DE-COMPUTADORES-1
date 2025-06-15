
package lista03;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }
    
    
    
    public void extrato(){
        System.out.println("             EXTRATO:");
        System.out.println("Numero da sua conta: " + numeroConta);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("------------------------------------");
    }
    
    public void saque(double valor){
        if((saldo - valor) >= 0){
            saldo = saldo - valor;
        }else{
            System.out.println("------------------------------------");
            System.out.println("             SAQUE:");
            System.out.println("Operação invalida, saldo insuficiente");
            System.out.println("Saldo atual: R$" + getSaldo());
            System.out.println("------------------------------------");
        
        }
        System.out.println("------------------------------------");
        System.out.println("             SAQUE:");
        extrato();
    }
    
    public void deposito(double valor){
        System.out.println("------------------------------------");
        System.out.println("             DEPOSITO:");
        saldo = saldo + valor;
        extrato(); 
    }
    
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
