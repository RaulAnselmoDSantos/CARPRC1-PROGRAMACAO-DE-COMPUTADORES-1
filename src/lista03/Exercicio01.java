
package lista03;

public class Exercicio01 {
    
    

    
    public static void main(String[] args) {      
        
        Aluno a = new Aluno("0000", "Raul");
        
        a.setProva1(3.5f);
        a.setProva2(5.8f);
        a.setTrabalho(6.0f);
        
        System.out.println("Nome: " + a.getNome());
        System.out.println("Matricula: " + a.getMatricula());
        System.out.println("Media: " + a.calcMedia());
        System.out.println("Nota necessaria para passar: " + a.recAluno());
    }
    
}
