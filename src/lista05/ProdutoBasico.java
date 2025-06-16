
package lista05;

/**
 *
 * @author Raul
 */
public class ProdutoBasico implements IProduto {
    private String nome;
    private double custo;
    
    public ProdutoBasico(String nome, double custo){
        this.nome = nome;
        this.custo = custo;
    }
    
    @Override
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
}
