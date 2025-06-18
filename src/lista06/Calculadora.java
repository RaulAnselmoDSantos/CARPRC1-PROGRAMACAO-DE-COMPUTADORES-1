
package lista06;

/**
 *
 * @author Raul
 */
public class Calculadora {
    
    public int div(int x, int y) throws DivisaoPorZero{
        if(y == 0 || x == 0){
           throw new DivisaoPorZero();
        }
        return x/y;
    }
    
}
