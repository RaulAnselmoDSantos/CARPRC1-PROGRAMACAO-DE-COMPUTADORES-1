
package lista05;

/**
 *
 * @author Raul
 */
public class Biscoito extends Produto {

    private int canceriginos;            

    public Biscoito(String nome, double preco, int canceriginos) {
        super(nome, preco);
        this.canceriginos = canceriginos;
    }

    public int getCanceriginos() {
        return canceriginos;
    }
    
    @Override
    protected double indiceCustoBeneficio() {
        return 100.0*(canceriginos + 1) / getPreco();
    }
    
}
