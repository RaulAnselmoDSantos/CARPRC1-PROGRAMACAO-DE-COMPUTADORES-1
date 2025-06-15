
package lista02;

import java.util.Scanner;

public class Exercicio02Prova01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resultado;
        
       
        System.out.println("Entre com um número de até quatro digitos");
        int num = sc.nextInt();
        
            if(num < 0 || num > 9999){
                System.out.println("Numero invalido!");
            }
        
        int milhar = num / 1000;
        int centena = ((num / 100) % 10);
        int dezena = (num % 100) / 10;
        int unidade = num % 10;
        
        System.out.println("Milhar: " + milhar);
        System.out.println("Centena: " + centena);
        System.out.println("Dezena: " + dezena);
        System.out.println("Unidade: " + unidade);
        
        if(milhar != 0){
            resultado = ((milhar * milhar * milhar * milhar) + (centena * centena * centena * centena) + (dezena * dezena * dezena * dezena) + (unidade * unidade * unidade * unidade));
            System.out.println(resultado);
            if(resultado == num){                
                System.out.println("É um numero de Armstrong");
            }else System.out.println("Não é um numero de Armstrong");            
        }
        if(milhar == 0 && centena != 0){
            resultado = ((centena * centena * centena) + (dezena * dezena * dezena) + (unidade * unidade * unidade));
            System.out.println(resultado);
            if(resultado == num){               
                System.out.println("É um numero de Armstrong");
            }else System.out.println("Não é um numero de Armstrong");            
        }
        if(milhar == 0 && centena == 0 && dezena != 0){
            resultado = ((dezena * dezena) + (unidade * unidade));
            System.out.println(resultado);            
            if(resultado == num){
                System.out.println("É um numero de Armstrong");
            }else System.out.println("Não é um numero de Armstrong");            
        }
    }
    
}
