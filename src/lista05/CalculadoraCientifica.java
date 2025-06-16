
package lista05;

/**
 *
 * @author Raul
 */
public class CalculadoraCientifica extends Calculadora{

    @Override
    public double soma(double a, double b) {
        return a + b;
    }

    @Override
    public double subtracao(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicacao(double a, double b) { 
        return a * b;
    }

    @Override
    public double divisao(double a, double b) {
       if(b == 0){
           throw new ArithmeticException("Divisor Não pode ser zero");
       }             
       return a /b;
    }
    
    public double raizQuadrada(double x){
        if(x<0){
            throw new IllegalArgumentException("Não possível tirar raiz de números negativos");
        }
        return Math.sqrt(x);
    }
   
    public double potencia(double base, double expoente){
        return Math.pow(base, expoente);
    }
}
