
package lista03;

public class Exercicio03 {

    
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria("123456", 100);
        
        cb.extrato();
        cb.deposito(200);
        cb.saque(300);
        cb.saque(100);
        
        
        
    }       
}
