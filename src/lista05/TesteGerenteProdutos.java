package lista05;

public class TesteGerenteProdutos {
    public static void main(String[] args) {
        // 1) Produto comprado “Pizza” a custo de compra cadastrado
        IProduto comprado = new ProdutoBasico(
            "Pizza",
            GerenteProdutos.getBasicCost("Pizza")
        );
        System.out.println("Custo compra da Pizza:    " + comprado.getCusto());

        // 2) Aplica redução de custo recursiva
        IProduto otimizado = GerenteProdutos.reduzirCusto(comprado);
        System.out.println("Custo otimizado da Pizza: " + otimizado.getCusto());

        // 3) Verifica se virou fabricado
        System.out.println("É fabricado?             " 
            + (otimizado instanceof IProdutoFabricado));
    }
}
