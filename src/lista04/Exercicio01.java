
package lista04;

public class Exercicio01 {

   
    public static void main(String[] args) {
        Tecnico tecnico = new Tecnico( "Raul", 1200.0, "000", 50.0);
        Administrativo admin = new Administrativo("Anselmo", 2000.0, "001", "dia", 10.0);
        
        System.out.println("====> Tecnico <====");
        System.out.println("");
        tecnico.exibeDados();
        System.out.println("Salario Anual: " + tecnico.ganhoAnual());
        System.out.println("");
        
        System.out.println("====> Administrador <====");
        System.out.println("");
        admin.exibeDados();
        System.out.println("Salario Anual: " + admin.ganhoAnual());
        System.out.println("");
    }
    
}
