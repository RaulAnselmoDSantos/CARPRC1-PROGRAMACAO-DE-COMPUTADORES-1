
package lista03;


public class Funcionario {
    private String departamento;
    private String nome;
    private String dataEntrada;
    private String rg;
    private double salario;

    public Funcionario(String departamento, String nome, String dataEntrada, String rg, double salario) {
        this.departamento = departamento;
        this.nome = nome;
        this.dataEntrada = dataEntrada;
        this.rg = rg;
        this.salario = salario;
    }
    
    public Funcionario(String departamento, String nome, double salario){
        this.departamento = departamento;
        this.nome = nome;
        this.salario = salario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public float calculaBonifica(){
        return (float) (this.salario * 0.6f);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double recebeAumento(double aumento){
        double novo_Salario;
        
        novo_Salario = salario * (1 + (aumento/100));
        
        return novo_Salario;
    }
    
    public double ganhoAnual(){
        return salario*12;
    }
    
    
}
