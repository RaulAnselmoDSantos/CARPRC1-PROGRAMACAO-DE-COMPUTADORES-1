
package lista04;


public class PessoaFisica extends Contato {
    private String cpf;
    private String dataNascimento;
    private String estadoCivil;
    public static final String TIPO = "Pessoa Física";

    public PessoaFisica(String nome, String endereco, String email, String cpf, String dataNascimento, String estadoCivil) {
        super(nome, endereco, email);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.estadoCivil = estadoCivil;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    @Override
    public void exibeContato(){
        System.out.println("[" + TIPO + "]"
            + "Nome: " + super.getNome()
            + " | Endereço: " + super.getEndereco()
            + " | Email: " + super.getEmail()
            + " | CPF: " + getCpf()
            + " | Nascimento: " + getDataNascimento()
            + " | Estado Civil: " + getEstadoCivil()
        );
        
    }
    
    @Override
    public String getDocumento(){
        return cpf;
    }
    
}
