
package lista04;


public class Agenda {
    private Contato[] contatos;
    private int quantidadeContatos = 0;

    public Agenda(int tamanho) {
        contatos = new Contato[tamanho];        
    }
    
    public void adicionaContato(Contato contato){
        if(quantidadeContatos < contatos.length){
            contatos[quantidadeContatos] = contato;
            quantidadeContatos++;
        }else System.out.println("Agenda cheia");
    }
    
    public void removeContato(String nome){
        for(int i = 0; i < quantidadeContatos; i++){
            if(contatos[i].getNome().equalsIgnoreCase(nome)){
                for(int j = i; j < quantidadeContatos - 1; j++){
                    contatos[j] = contatos[j + 1];
                }
                contatos[--quantidadeContatos] = null;
                System.out.println("Contato \"" + nome + "\" removido");
                return;
            }
        }
        System.out.println("Contato \"" + nome + "\" Não encontrado");
    }
 
    public Contato buscaPorNome(String nome){
        for(int i = 0; i < quantidadeContatos; i++){
            if(contatos[i].getNome().equalsIgnoreCase(nome)){
                return contatos[i];
            }
        }
        return null;
    }
    
    public Contato buscaPorDocumento(String documento){
        for(int i = 0; i < quantidadeContatos; i++){
            if(contatos[i].getDocumento().equalsIgnoreCase(documento)){
                return contatos[i];
            }
        }
        return null;
    }
    
    public void ordenar(){
        for(int i = 0; i < quantidadeContatos - 1; i++){
            for(int j = 0; j < quantidadeContatos - 1 - i; j++){
                boolean atualEhPJ = contatos[j] instanceof PessoaJuridica; 
                boolean atualEhPF = contatos[j+1] instanceof PessoaFisica; 
                if(atualEhPJ && atualEhPF){
                    Contato temp = contatos[j];
                    contatos[j] = contatos[j+1];
                    contatos[j+1] = temp; 
                }
            }
        }
    }
    
    public void exibeTodos(){
        for(int i = 0; i < quantidadeContatos; i++){
           contatos[i].exibeContato();
        }
    }
}
