
package lista04;


public class PessoaJuridica extends Contato{
    public static final String TIPO = "Pessoa Jurídica";
    
    private String cnpj;
    private String incricaoEstadual;
    private String razaoSocial;

    public PessoaJuridica(String nome, String endereço, String email, String cnpj, String incricaoEstadual, String razaoSocial) {
        super(nome, endereço, email);
        this.cnpj = cnpj;
        this.incricaoEstadual = incricaoEstadual;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return incricaoEstadual;
    }

    public void setIncricaoEstadual(String incricaoEstadual) {
        this.incricaoEstadual = incricaoEstadual;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
    @Override
    public void exibeContato(){
        System.out.println("[" + TIPO + "]"
            + "Nome: " + super.getNome()
            + " | Endereço: " + super.getEndereco()
            + " | Email: " + super.getEmail()
            + " | CNPJ: " + getCnpj()
            + " | Inscrição Estadual: " + getInscricaoEstadual()
            + " | Razão Social: " + getRazaoSocial()
        );
    }
    
    @Override
    public String getDocumento(){
        return cnpj;
    }
}
