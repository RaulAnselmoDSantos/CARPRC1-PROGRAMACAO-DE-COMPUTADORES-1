
package lista03;

public class Exercicio02 {

    
    public static void main(String[] args) {
        Funcionario f = new Funcionario("vendas", "Raul A","01-01-2020","3798712319", 1200);
        
        System.out.println("Nome: " + f.getNome());
        System.out.println("Salario: R$" + f.getSalario());
        System.out.println("Novo salario pós aumento: " + f.recebeAumento(20));
        System.out.println("Ganho anual: " + f.ganhoAnual());
    }   
}
