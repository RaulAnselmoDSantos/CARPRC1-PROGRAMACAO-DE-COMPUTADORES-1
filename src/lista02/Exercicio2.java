
package lista02;

import javax.swing.JOptionPane;

public class Exercicio2 {
    static int verificarBissexto(int ano){
        int dia = 28;
        if((ano % 400 == 0) || (ano % 4 == 0) && (ano % 100 != 0)){
            dia = 29;
        }   
        return dia;
    }
    
    public static void main(String[] args) {
        
        
        int dia, mes, ano, diaFim;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o mes: "));
        ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano (YYYY): "));
        
        if((mes < 1) || (mes > 12)){
            JOptionPane.showMessageDialog(null, "Data Invalida!");
        }
        else{
            if ((dia < 1) || (dia > 31)){
                JOptionPane.showMessageDialog(null, "Data Invalida!");
            }
            else {
                switch(mes){                  
                        
                    case 4, 6, 9, 11 -> {
                        if((dia < 1) || (dia > 30)){
                            JOptionPane.showMessageDialog(null, "Data Invalida!");
                        }
                        else{
                           JOptionPane.showMessageDialog(null, "Data Valida!"); 
                        }
                        break;
                    }
                    case 2 -> {
                        diaFim = verificarBissexto(ano);
                        if((dia < 1) || (dia > diaFim)){
                            JOptionPane.showMessageDialog(null, "Data Invalida!");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Data Valida!");
                        }
                        break;
                    }
                    default ->  JOptionPane.showMessageDialog(null, "Data Valida!");
                    
                }
            }
        }
        
        
    }
    
}
