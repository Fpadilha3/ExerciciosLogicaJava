
package exercicio1;

import java.util.Scanner;


public class Exercicio1 {

    
    public static void main(String[] args) {
       
      
         Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro:");
        int numero = ler.nextInt();
        
        boolean resultado = ehNumeroPerfeito(numero);
        System.out.println("É número perfeito? " + resultado);
    }


    public static boolean ehNumeroPerfeito(int n) {
        int soma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                soma += i;
            }
        }
        return soma == n;
        
    }
}  
        
     
    
    

