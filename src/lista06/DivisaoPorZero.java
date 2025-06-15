/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
