
package lista05;

/**
 *
 * @author Raul
 */
public class Exercicio2TesteProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IProduto farinha = new ProdutoBasico("Farinha", 2.5);
        IProduto agua   = new ProdutoBasico("Água", 0.1);
        
        IProdutoFabricado massa = new ProdutoComposto(new IProduto[]{farinha, agua});
        System.out.println("Custo da massa: " + massa.getCusto()); // 2.6
        
        IProduto queijo  = new ProdutoBasico("Queijo", 5.0);
        IProduto molho   = new ProdutoBasico("Molho", 3.0);
        
//        IProdutoFabricado pizza = new ProdutoComposto(
//           // new IProduto[]{massa, queijo, molho}
//        );
//        System.out.println("Custo da pizza: " + pizza.getCusto());
    }
    
    
}
