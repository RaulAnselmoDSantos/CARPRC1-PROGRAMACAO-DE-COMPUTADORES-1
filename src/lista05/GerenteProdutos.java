package lista05;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe feita com ajuda do GPT
 * Classe auxiliar que:
 * - controla custo de compra de produtos básicos;
 * - controla receitas (ingredientes) de produtos fabricados;
 * - reduz custo recursivamente transformando comprados em fabricados quando vantajoso.
 */
public class GerenteProdutos {

    // (A) mapa nomeProduto → custoCompra
    private static final Map<String, Double> basicCosts = new HashMap<>();
    // (B) mapa nomeProduto → array de nomes de ingredientes
    private static final Map<String, String[]> recipes   = new HashMap<>();

    static {
        // Exemplo de cadastro inicial; você pode chamar register... de onde quiser
        registerBasic("Farinha", 2.5);
        registerBasic("Fermento", 1.0);
        registerBasic("Água",    0.1);
        registerBasic("Queijo",  7.0);
        registerBasic("Pizza",  20.0);
        registerBasic("Molho",   3.0);
        registerBasic("Tomate", 1.5);
        registerBasic("Azeite", 2.5);
        
        registerRecipe("Massa",  "Farinha", "Fermento", "Água");
        registerRecipe("Molho",  "Tomate", "Azeite");
        registerRecipe("Pizza",  "Massa", "Molho", "Queijo");
    }

    /** (1) Registra produto comprado e seu custo de aquisição. */
    public static void registerBasic(String nome, double custo) {
        basicCosts.put(nome, custo);
    }

    /** (2) Registra receita de produto fabricado pelos nomes dos ingredientes. */
    public static void registerRecipe(String produto, String... ingredientes) {
        recipes.put(produto, ingredientes);
    }

    /** (3) Retorna custo de compra; se não cadastrado, devolve infinito. */
    public static double getBasicCost(String nome) {
        return basicCosts.getOrDefault(nome, Double.MAX_VALUE);
    }

    /** (4) Retorna os nomes dos ingredientes ou null se não houver receita. */
    public static String[] getRecipe(String produto) {
        return recipes.get(produto);
    }

    /**
     * (5) Método principal do exercício:
     * Recebe um IProduto (comprado ou já fabricado),
     * e devolve o produto otimizado:
     *  - se já for fabricado, aplica recursão nos ingredientes;
     *  - se for comprado, tenta fabricar e compara custos.
     */
    public static IProduto reduzirCusto(IProduto p) {
        // == Caso A: produto já fabricado ==
        if (p instanceof IProdutoFabricado) {
            IProdutoFabricado fab = (IProdutoFabricado) p;
            // 5.1) Otimiza todos os subingredientes
            IProduto[] ingOtimizados = new IProduto[fab.getIngredientes().length];
            for (int i = 0; i < ingOtimizados.length; i++) {
                ingOtimizados[i] = reduzirCusto(fab.getIngredientes()[i]);
            }
            // 5.2) Recria o fabricado com os ingredientes otimizados
            ProdutoFabricado novoFab = new ProdutoFabricado(p.getNome(), ingOtimizados);
            // 5.3) Compara custo de fabricação vs. custo original
            return (novoFab.getCusto() < p.getCusto()) ? novoFab : p;
        }

        // == Caso B: produto comprado ==
        String nome = p.getNome();
        String[] ingrNomes = getRecipe(nome);
        // 5.4) Se não há receita, retorna o próprio objeto
        if (ingrNomes == null) {
            return p;
        }

        // 5.5) Monta array de ingredientes básicos
        IProduto[] ingredientes = new IProduto[ingrNomes.length];
        for (int i = 0; i < ingrNomes.length; i++) {
            double custoCompra = getBasicCost(ingrNomes[i]);
            ingredientes[i] = new ProdutoBasico(ingrNomes[i], custoCompra);
        }

        // 5.6) Otimiza recursivamente cada ingrediente
        for (int i = 0; i < ingredientes.length; i++) {
            ingredientes[i] = reduzirCusto(ingredientes[i]);
        }

        // 5.7) Cria o fabricado e compara custos
        ProdutoFabricado fabricado = new ProdutoFabricado(nome, ingredientes);
        return (fabricado.getCusto() < p.getCusto()) ? fabricado : p;
    }
}
