
package exercicio7;

import java.util.Scanner;


public class Exercicio7 {


    public static void main(String[] args) {
        
   
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = ler.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = ler.nextInt();

        int mdc = calcularMDC(num1, num2);
        System.out.println("O MDC de " + num1 + " e " + num2 + " é: " + mdc);
    }

    public static int calcularMDC(int a, int b) {
       
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }
}
   
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
    }
    
}
