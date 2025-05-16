
package exercicio5;

import java.util.Scanner;


public class Exercicio5 {

  
    public static void main(String[] args) {
        

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo:");
        int numero = ler.nextInt();

        int resultado = calcularFatorial(numero);
        System.out.println("Fatorial de " + numero + " é: " + resultado);
    }

    public static int calcularFatorial(int n) {
        int fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial = fatorial * i;
        }

        return fatorial;
    }
}

        
      
        
        
        
        
        
        
        
        
        
        
        
        
        
      
    }
    
}
