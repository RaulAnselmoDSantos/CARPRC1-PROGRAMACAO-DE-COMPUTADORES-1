
package lista05;

/**
 *
 * @author Raul
 */
public class TesteTributavel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        
        cc.deposita(1000.0);
        cc.saca(200.0);
        System.out.println("Saldo Conta Corrente: " + cc.getSaldo());
        System.out.println("Tributos Conta Corrente: " + cc.calcularTributos());
        
        System.out.println();
        
        ContaPoupanca cp = new ContaPoupanca();
        cp.deposita(500.0);
        System.out.println("Saldo Conta Poupança: " + cp.getSaldo());
        cp.saca(100.0);
        System.out.println("Saldo Conta Poupança: " + cp.getSaldo());
        
        System.out.println();
        
        SeguroDeVida sv = new SeguroDeVida();
        System.out.println("Tributos Seguro de Vida: " + sv.calcularTributos());
        
        System.out.println();
        
        Tributavel[] lista = { cc, sv};
        double total = 0;
        for(Tributavel t: lista){
            total += t.calcularTributos();
        }
        System.out.println("Total de Tributos (cc + sv): " + total);
    }
    
}
