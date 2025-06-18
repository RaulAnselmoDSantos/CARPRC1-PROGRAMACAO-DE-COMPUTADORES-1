
package lista07;

/**
 *
 * @author Raul feito para estudo
 */

public class PessoaJuridica extends Contato {
    public static final String TIPO = "Pessoa Jurídica";
    private String cnpj;
    private String inscricaoEstadual;
    private String razaoSocial;

    public PessoaJuridica(String nome, String endereco, String email,
                          String cnpj, String inscricaoEstadual, String razaoSocial) {
        super(nome, endereco, email);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String getDocumento() {
        return cnpj;
    }

    @Override
    public void exibeContato() {
        System.out.println("[" + TIPO + "] "
                + "Nome: " + getNome()
                + " | Endereço: " + getEndereco()
                + " | Email: " + getEmail()
                + " | CNPJ: " + cnpj
                + " | Inscrição Estadual: " + inscricaoEstadual
                + " | Razão Social: " + razaoSocial);
    }
}