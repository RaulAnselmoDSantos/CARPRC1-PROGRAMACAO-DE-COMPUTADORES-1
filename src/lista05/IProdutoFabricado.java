
package lista05;

/**
 *
 * @author Raul
 */
public interface IProdutoFabricado extends IProduto{
    IProduto[] getIngredientes();
    
    double getCusto();
}
