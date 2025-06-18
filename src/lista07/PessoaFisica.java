
package lista07;

/**
 *
 * @author Raul feito para estudo
 */

public class PessoaFisica extends Contato {
    public static final String TIPO = "Pessoa Física";
    private String cpf;
    private String dataNascimento;
    private String estadoCivil;

    public PessoaFisica(String nome, String endereco, String email,
                        String cpf, String dataNascimento, String estadoCivil) {
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
    public String getDocumento() {
        return cpf;
    }

    @Override
    public void exibeContato() {
        System.out.println("[" + TIPO + "] "
                + "Nome: " + getNome()
                + " | Endereço: " + getEndereco()
                + " | Email: " + getEmail()
                + " | CPF: " + cpf
                + " | Nascimento: " + dataNascimento
                + " | Estado Civil: " + estadoCivil);
    }
}