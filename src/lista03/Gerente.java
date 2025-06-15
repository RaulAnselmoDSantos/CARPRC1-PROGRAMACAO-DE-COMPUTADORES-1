
package lista03;


public class Gerente extends Funcionario{
    
    private String usuario;
    private String senha;
    
    public Gerente(String departamento, String nome, double salario, String usuario, String senha){
        super(departamento, nome, salario);
        this.usuario = usuario;
        this.senha = senha;
    }
    
    
    @Override
    public float calculaBonifica(){
        return super.calculaBonifica()*6+100;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
