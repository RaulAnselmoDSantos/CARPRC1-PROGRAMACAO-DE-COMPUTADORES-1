/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
