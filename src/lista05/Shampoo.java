
package lista05;

/**
 *
 * @author Raul
 */
public class Shampoo extends Produto {
    private int irritabilidade;

    public Shampoo(String nome, double preco, int irritabilidade) {
        super(nome, preco);
        this.irritabilidade = irritabilidade;
    }

    public int getIrritabilidade() {
        return irritabilidade;
    }
    
    @Override
    protected double indiceCustoBeneficio(){
        return 100.0*(1.0 / irritabilidade) / getPreco();    
    }
}
