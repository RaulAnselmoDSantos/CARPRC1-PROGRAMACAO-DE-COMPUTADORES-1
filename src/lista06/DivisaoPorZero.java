
package lista06;

/**
 *
 * @author Raul
 */

public class DivisaoPorZero extends ArithmeticException{
    public DivisaoPorZero(){
        super("Tentativa de Divisão Por Zero");
    }
    
    public DivisaoPorZero(String msg){
        super(msg);
    }
    
    @Override
    public String toString(){
        return "Divisão Por Zero: ";
    }
}
