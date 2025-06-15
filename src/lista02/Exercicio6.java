
package lista02;


public class Exercicio6 {

    
    public static void main(String[] args) {
        
        int[] vetor1 = {1, 5, 8, 3, 9};
        int[] vetor2 = {8, 6, 2, 0, 7};
        int[] vetoResultado = new int [vetor1.length + 1];     
        
        int sobe = 0; 
        
        for(int i = vetor1.length -1; i >= 0; i--){
            int soma = vetor1[i] + vetor2[i] + sobe;
            
            if(soma > 9){
                vetoResultado[i +1] = soma % 10; //guarda a unidade
                sobe = soma / 10; //guarda a dezena
            }else{
                vetoResultado[i + 1] = soma; //guarda normal
                sobe = 0; //
            }            
        }
        
        vetoResultado[0] = sobe;
        
        //Se o inicio for zero troca para a proxima posição
        int inicioZero = 0;
        if(vetoResultado[0] == 0){
           inicioZero = 1; 
        }
        System.out.print("  ");
        for(int i = 0; i < vetor1.length; i++){
            System.out.print(vetor1[i] + " ");
        }
        System.out.println("");
        System.out.print("+ ");
        for(int i = 0; i < vetor2.length; i++){
            System.out.print(vetor2[i] + " ");
        }
        System.out.println("");
        System.out.println("-----------");
        for(int i = inicioZero; i < vetoResultado.length; i++){
            System.out.print(vetoResultado[i] + " ");
        }
        System.out.println("");
    }
    
}
