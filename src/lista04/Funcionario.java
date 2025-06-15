
package lista04;


public class Funcionario {
    private String nome; 
    private Double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    
    
    public void addAumento(double valor){
        salario += valor;
        System.out.println("Novo salario: R$"+salario);
    }
    
    public double ganhoAnual(){   
        double ganhoAnual = salario*12;
        System.out.println("Salario anual simpels: R$"+ ganhoAnual); 
        return ganhoAnual;
    }
    
    public void exibeDados(){
        System.out.println("Seus dados:");
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
    }
    
}
