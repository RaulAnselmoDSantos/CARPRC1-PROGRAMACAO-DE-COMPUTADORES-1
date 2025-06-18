/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista06;

import javax.swing.JOptionPane;
/**
 *
 * @author Raul
 */
public class Exercicio2 {
    public static void main(String[] args){
        int numero = 0;
        String linha;
        
        while(true){
            linha = JOptionPane.showInputDialog(
                    null,
                    "Digite um número interiro:",
                    "Entrada de número",
                    JOptionPane.QUESTION_MESSAGE
            );
            if (linha == null){
                JOptionPane.showMessageDialog(
                    null,
                    "Cancelado pelo Usuario",
                    "Cancelado",
                    JOptionPane.INFORMATION_MESSAGE
                );
                System.exit(0);
            }
            
            try{
                numero = Integer.parseInt(linha);
                break;
            }catch(NumberFormatException e){
                JOptionPane.showConfirmDialog(
                    null,
                    "Opa.. Acho que você se enganou! Digite novamente...",
                    "Entrada Invalida",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        }
        int quadrado = numero *numero;
        JOptionPane.showMessageDialog(
            null,
            "Você digitou: " + numero +
            "\n0 quadrado de " + numero + " é: " + quadrado,
            "Resultado",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
