
package lista03;

public class Aluno {
    
    private String matricula;
    private String nome;
    private float prova1;
    private float prova2;
    private float trabalho;

    public Aluno(String matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
        this.prova1 = 0;
        this.prova2 = 0;
        this.trabalho = 0;
    }
    
    public float calcMedia(){        
        float result = (float) ((prova1 * 2.5) + (prova2 * 2.5) + (trabalho * 2))/7; 
        return result;
    }
    
    public float recAluno(){        
        float result = 0;
        float media = calcMedia();
        if(media < 6){
            result = 12 - media;
        }
        return result;      
    }
    
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the prova1
     */
    public float getProva1() {
        return prova1;
    }

    /**
     * @param prova1 the prova1 to set
     */
    public void setProva1(float prova1) {
        this.prova1 = prova1;
    }

    /**
     * @return the prova2
     */
    public float getProva2() {
        return prova2;
    }

    /**
     * @param prova2 the prova2 to set
     */
    public void setProva2(float prova2) {
        this.prova2 = prova2;
    }

    /**
     * @return the trabalho
     */
    public float getTrabalho() {
        return trabalho;
    }

    /**
     * @param trabalho the trabalho to set
     */
    public void setTrabalho(float trabalho) {
        this.trabalho = trabalho;
    }
    
    
    
}
