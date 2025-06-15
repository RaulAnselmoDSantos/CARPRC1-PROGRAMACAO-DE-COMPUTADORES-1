/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista06;

import javax.swing.JOptionPane;

/**
 *
 * @author Raul
 */
public class ExercicioSala01 {
        
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        try{
            int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
            int y = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
            JOptionPane.showMessageDialog(null, x + "/"+ y + "=" + calc.div(x, y));
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Formato Invalido: " + e.getMessage());
        }
        catch(ArithmeticException e){
            JOptionPane.showMessageDialog(null,"Operação Invalida: " + e.getMessage());
        }
        finally{
            JOptionPane.showMessageDialog(null,"Execussão Concluida");
        }
    }
    
}
