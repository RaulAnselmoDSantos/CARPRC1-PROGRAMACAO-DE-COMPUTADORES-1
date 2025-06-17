package lista05;

/**
 * Produto que é composto por outros IProduto (ingredientes).
 * Calcula seu custo como a soma dos custos de cada ingrediente.
 */
public class ProdutoFabricado implements IProdutoFabricado {
    private String nome;             // (1)
    private IProduto[] ingredientes; // (2)

    /**
     * Construtor recebe o nome do produto e o vetor de ingredientes já instanciados.
     * @param nome         nome do produto fabricado
     * @param ingredientes array de IProduto que compõem este produto
     */
    public ProdutoFabricado(String nome, IProduto[] ingredientes) { // (3)
        this.nome = nome;              // (4)
        this.ingredientes = ingredientes; // (5)
    }                                  // (6)

    /**
     * @return o nome deste produto
     */
    public String getNome() {          // (7)
        return nome;                   // (8)
    }                                  // (9)

    /**
     * @return o array de ingredientes que compõem este produto
     */
    @Override
    public IProduto[] getIngredientes() { // (10)
        return ingredientes;             // (11)
    }                                    // (12)

    /**
     * Soma o custo de cada ingrediente para obter o custo total de fabricação.
     * @return custo total de fabricação
     */
    @Override
    public double getCusto() {         // (13)
        double total = 0.0;            // (14)
        for (IProduto ing : ingredientes) { // (15)
            total += ing.getCusto();   // (16)
        }
        return total;                  // (17)
    }                                  // (18)
}                                      // (19)
