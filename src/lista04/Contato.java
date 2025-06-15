
package lista04;


public class Contato {
    private String nome;
    private String endereço;
    private String email;

    public Contato(String nome, String endereço, String email) {
        this.nome = nome;
        this.endereço = endereço;
        this.email = email;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
