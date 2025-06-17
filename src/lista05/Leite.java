
package lista05;

/**
 *
 * @author F1
 */
public class Leite extends Produto {
    
    private int validade;

    public Leite(String nome, double preco, int validade) {
        super(nome, preco);
        this.validade = validade;
    }

    public int getValidade() {
        return validade;
    }        
    
    @Override
    protected double indiceCustoBeneficio() {
        return 100.0 * validade / getPreco(); 
    }
    
}
