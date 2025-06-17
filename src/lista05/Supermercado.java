
package lista05;

/**
 *
 * @author Raul
 */
public class Supermercado {
    public static void main(String[] args){
    Shampoo[] shampoos = {
        new Shampoo("Shampoo A", 20.0, 3),
        new Shampoo("Shampoo B", 18.0, 5),
        new Shampoo("Shampoo C", 22.0, 2),
    };
     Biscoito[] biscoitos  = {
        new Biscoito("Biscoito X",  5.0, 2),
        new Biscoito("Biscoito Y",  4.0, 4),
        new Biscoito("Biscoito Z",  6.0, 1)
    };
    Leite[]    leites     = {
        new Leite("Leite Integral",  6.0, 10),
        new Leite("Leite Desnatado", 5.5, 15),
        new Leite("Leite Semi",      5.8, 12)
    };
    
    findBest(shampoos);
    findBest(biscoitos);
    findBest(leites);
    
}
private static <T extends Produto> void findBest(T[] produtos) {
        T best = produtos[0];
        for (T p : produtos) {
            if (p.compareTo(best) > 0) {
                best = p;
            }
        }
        System.out.printf("Melhor %s: %s (índice = %.2f)%n",
            best.getClass().getSimpleName(),
            best.getNome(),
            best.indiceCustoBeneficio()
        );
    }    
}
