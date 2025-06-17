
package lista05;

import lista05.CalculadoraCientifica;

/**
 *
 * @author Raul
 */
public class Exercicio01Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculadoraCientifica calc = new CalculadoraCientifica();  
        
        
        System.out.println("Soma 2 + 2: " + calc.soma(2, 2));
        
        System.out.println("Subtração: 6 - 5: " + calc.subtracao(6, 5));
        
        System.out.println("Multiplicação 2*2: " + calc.multiplicacao(2, 2));
        
        
        System.out.println("Divisão: " + calc.divisao(10, 2));
        System.out.print("Divisão teste por zero(10/0): ");
        try{
            System.out.println(calc.divisao(10, 0));
        }catch (ArithmeticException e){
            System.out.println("Erro: -> " + e.getMessage());
        }
        
        System.out.println("Raiz Quadrada: " + calc.raizQuadrada(144));
        System.out.print("Raiz Quadrada teste com numero negativo (-4): ");
        try{
            System.out.println(calc.raizQuadrada(-4));
        }catch (IllegalArgumentException e){
            System.out.println("Erro -> " + e.getMessage());
        }
        System.out.println("Potência: " + calc.potencia(10, 10));
    }
    
}
