
package exercicio2;

import java.util.Scanner;


public class Exercicio2 {


    public static void main(String[] args) {
        
        
        
        
        
        

        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite uma frase:");
        String frase = ler.nextLine();

        String novaFrase = substituirVogais(frase);
        System.out.println("Frase com vogais substituídas: " + novaFrase);
    }

    public static String substituirVogais(String texto) {
        char[] caracteres = texto.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            char c = caracteres[i];
            if (ehVogal(c)) {
                caracteres[i] = '*';
            }
        }

       
        String resultado = "";
        for (int i = 0; i < caracteres.length; i++) {
            resultado += caracteres[i];
        }

        return resultado;
    }

    public static boolean ehVogal(char c) {
       
        return c == 'a' || c == 'A' ||
               c == 'e' || c == 'E' ||
               c == 'i' || c == 'I' ||
               c == 'o' || c == 'O' ||
               c == 'u' || c == 'U';
    }
}

 
    }
    
}
