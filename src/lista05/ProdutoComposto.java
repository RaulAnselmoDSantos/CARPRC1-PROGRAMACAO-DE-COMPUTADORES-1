
package lista05;

/**
 *
 * @author Raul 
 */
public class ProdutoComposto implements IProdutoFabricado {
    private IProduto [] ingredientes; 
    
    public ProdutoComposto(IProduto[] ingredientes){
        this.ingredientes = ingredientes;
    }
    
    @Override
    public IProduto[] getIngredientes(){
        return ingredientes;
    }
    
    @Override
    public double getCusto(){
        double total = 0;
        for(IProduto p : ingredientes){
            total += p.getCusto();
        }
        return total;
    }
}
