/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CG3023681
 */
public class Math {
    public static int quadrado(int n){
        return n*n;
    }
    
    public static int soma(int n, int y){
        return n+y;
    }
    
    public static float mediaPonderda(float p, int x, int y){
        
        float p2 = 10 - p;
        
        float media = ((x*p) + (y*p2)) / (p+p2); 
        
        return media; 
    }
}
