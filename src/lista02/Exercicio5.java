
package lista02;

import java.util.Scanner;




public class Exercicio5 {    
    public static boolean confereSenha(String senha){        
        //variaveis de verificação
        boolean maiusculas = false, minusculas = false, 
                numero = false, especial = false, 
                verificada = false, tamanho = false;               
        //Verifica tamanho da senha
        if(senha.length() < 8){
            System.out.println("Tamanho minimo é 8 caracteres");
            return false;
        }else if(senha.length() > 8){
            System.out.println("Tamanho maximo é 8 caracteres");
            return false;
        }else tamanho = true;        
        //transforma String em array
        char[] caracteres = senha.toCharArray();
        //verifica cada posição do array
        for(int i = 0; i < caracteres.length ; i++){                       
            //verifica se atende as condições
            if(caracteres[i] >= 'A' && caracteres[i] <= 'Z'){
                maiusculas = true;
            } else if(caracteres[i] >= 'a' && caracteres[i] <= 'z'){
                minusculas = true;
            }else if(caracteres[i] >= '0' && caracteres[i] <= '9'){
                numero = true;
            }else especial = true;                        
        }        
        //verifica se está tudo dentro do esperado.
            if(!maiusculas){
                System.out.println("É preciso ter ao menos 1 Caracter em Maiusculo");                
                verificada = false;
            }
            if(!minusculas){
                System.out.println("É preciso ter ao menos 1 Caracter em Minusculo");
                verificada = false;
            }
            if(!numero){
                System.out.println("É preciso ter ao menos 1 Numero");
                verificada = false;
            }
            if(!especial){
                System.out.println("É preciso ter ao menos 1 Caracter especial");
                verificada = false;
            }if(maiusculas && minusculas && numero && especial){
                verificada = true; 
            }        
        return verificada;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        boolean confere = false;         
        while(!confere){            
            System.out.print("Entre com a nova senha: ");
            String senha = sc.nextLine();                    
            if(confereSenha(senha)){
                System.out.println("Senha Valida");
                confere = true;
            }else System.out.println("Senha Invalida");
        }                   
    }   
}