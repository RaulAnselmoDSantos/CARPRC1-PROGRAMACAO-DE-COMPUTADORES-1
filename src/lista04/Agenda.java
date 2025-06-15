
package lista04;


public class Agenda {
    private Contato[] contatos;
    private int quantidadeContatos;

    public Agenda(int tamanho) {
        contatos = new Contato[tamanho];
        quantidadeContatos = 0;
    }
    
    public void adicionaContato(Contato contato){
        if(quantidadeContatos < contatos.length){
            contatos[quantidadeContatos] = contato;
            quantidadeContatos++;
        }else System.out.println("Agenda cheia");
    }
    
    public void removeContato(String nome){
        
    }
    
}
