
package lista04;


public class Assistente extends Funcionario{

    private String matricula;
    
    public Assistente(String nome, Double salario, String matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public void exibeDados(){
        super.exibeDados();
        System.out.println("Matricula: "+ matricula);
    }
}
