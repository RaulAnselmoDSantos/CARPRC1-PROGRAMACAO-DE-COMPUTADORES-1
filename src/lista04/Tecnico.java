
package lista04;


public class Tecnico extends Assistente{
    
    private double bonusSalario;
    
    public Tecnico(String nome, Double salario, String matricula, Double bonusSalario) {
        super(nome, salario, matricula);
        this.bonusSalario = bonusSalario;
    }

    public double getBonusSalarial() {
        return bonusSalario;
    }

    public void setBonusSalarial(double bonus) {
        this.bonusSalario += bonus;
    }
    
    @Override
    public double ganhoAnual(){        
        double salario = getSalario();
        double ganhoAnual = (salario+bonusSalario)*12;
        return ganhoAnual;
    }
}
