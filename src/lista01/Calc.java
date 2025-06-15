
package lista01;

/**
 *
 * @author Raul
 */
public class Calc {
    public static float inverte(int n){//123
        float centena = (n /100); //1 
        float dezena = (n /10)%10; //2
        float unidade = n%10; //3            
        float resultado = (unidade*100)+(dezena*10)+(centena*1);        
        return resultado;
    }
    
    public static int quadrado(int n){
        return n*n;
    }
    
    public static float adicao(float n, float y){
        return (n+y);
    }
    
    public static float mediaPonderda(float p, int x, int y){
        
        float p2 = 10 - p;
        
        float media = ((x*p) + (y*p2)) / (p+p2); 
        
        return media; 
    }  
    
    public static float subtracao(float x, float y){
        return (x - y);
    }
    
    public static float multiplicacao(float x, float y){
        return (x*y);
    }
    
    public static float divisao(float x, float y){
        return (x / y);
    }
}
