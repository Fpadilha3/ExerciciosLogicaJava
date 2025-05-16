
package exercicio6;

import java.util.Scanner;


public class Exercicio6 {

   
    public static void main(String[] args) {
        

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase:");
        String entrada = ler.nextLine();

        boolean resultado = ehPalindromo(entrada);
        if (resultado) {
            System.out.println("É palíndromo!");
        } else {
            System.out.println("Não é palíndromo.");
        }
    }

    public static boolean ehPalindromo(String texto) {
        // Remove espaços e converte para minúsculas manualmente
        char[] letras = texto.toCharArray();
        char[] limpo = new char[letras.length];
        int tamanho = 0;

        for (int i = 0; i < letras.length; i++) {
            char c = letras[i];

           
            if (c != ' ') {
          
                if (c >= 'A' && c <= 'Z') {
                    c = (char)(c + 32);
                }
                limpo[tamanho] = c;
                tamanho++;
            }
        }

     
        for (int i = 0; i < tamanho / 2; i++) {
            if (limpo[i] != limpo[tamanho - 1 - i]) {
                return false;
            }
        }

        return true;
    }
}

        
        
        
        
        
        
        
        
        
        
  
    }
    
}
