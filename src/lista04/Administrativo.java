
package lista04;


public class Administrativo extends Assistente{
    
    private String turno;
    private Double adicionalNoturno;
    
    public Administrativo(String nome, Double salario, String matricula, String turno, Double adicionalNoturno) {
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        if(null == turno)System.out.println("Turno invalido");else switch (turno) {
            case "dia":
                this.turno = "dia";
                break;
            case "noite":
                this.turno = "noite";
                break;
            default:
                System.out.println("Turno invalido");
                break;
        }                
    }

    public Double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(Double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }
    
    @Override
    public double ganhoAnual(){
        double salario = getSalario();
        double salarioAjustado = salario + adicionalNoturno;        
        if("noite".equalsIgnoreCase(turno)){            
            return salarioAjustado*12;
        }
        return salario*12;
    }    
}
