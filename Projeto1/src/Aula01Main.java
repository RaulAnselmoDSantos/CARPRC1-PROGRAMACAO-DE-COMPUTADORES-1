import java.util.Scanner;

/**
 *
 * @author CG3023681
 */
public class Aula01Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Olá Mundo");
        
        
        String nome;
        int idade;
        float valor;
        Boolean vf;
        int x;
        int y;
        int p;
        
//        System.out.println("Digite um numero: ");;;
//        x = sc.nextInt();
//        System.out.println("Número digitado: " + x);
//        System.out.println("Digite outro número");
//        y = sc.nextInt();
//        System.out.println("Número digitado: " + y);
//        
//        System.out.println("Resultado da multiplicação do quadrado do " + y + " pela soma de  "+ x +" mais " + y);
//        System.out.println( Math.soma(x,y)*Math.quadrado(y));
        
        System.out.println("Faça a média aritmetica");
        
        System.out.print("Digite uma nota: ");
        x = sc.nextInt();
        System.out.println("Número digitado: " + x);
        System.out.print("Digite outra nota: ");
        y = sc.nextInt();
        System.out.println("Número digitado: " + y);
        
        System.out.print("Digite o peso da primeira nota(0-10): ");
        p = sc.nextInt();
        System.out.println("Peso digitado: " + p);
        
        System.out.println("Média Ponderda: " + Math.mediaPonderda(p, x, y));
    }
    
}
