package lista02;

import javax.swing.JOptionPane;

public class Exercicio1 {

    public static int QUOCIENTE(int x) {
        return x / 4;
    }

    public static int RESTO(int x) {
        return x % 7;
    }

    public static float TRUNCA(double x) {
        return (int) x;
    }

    public static void main(String[] args) {

        int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o dia: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o mes: "));
        int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano (YYYY): "));
        
        int M = mes;
        
        if (M == 1 || M == 2) {
            M += 10;
            ano--;
        } else {
            M -= 2;
        }

        int D = dia;
        int A = ano % 100;
        int S = ano / 100;

        //int diaSemana = RESTO((TRUNCA(2.6*M-0.1) + D + A + QUOCIENTE(A, 4)+QUOCIENTE(S)-2*S), 7;
        var diaSemana = RESTO((int) ((TRUNCA(M * 2.6f - 0.1f) + D + A + QUOCIENTE(A) + QUOCIENTE(S) - 2 * S)));
        
        
        
        
        
        String[] dias = {"Domingo","Segunda-feira","Terça-feira","Quarta-feira","Quinta-feira","Sexta-feira", "Sábado"};
        
        System.out.println(M);
        System.out.println(diaSemana);
        
        System.out.printf("A data %02d/%02d/%d cai em um %s%n", D, mes, ano, dias[(diaSemana + 7) % 7]);
    }

}
