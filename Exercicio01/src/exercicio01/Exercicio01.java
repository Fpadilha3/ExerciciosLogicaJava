
package exercicio01;

import java.util.Scanner;

public class Exercicio01 {

    
    public static void main(String[] args) {
        

    }
    public static String substituirVogaisPorAsterisco(String texto) {
        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (ehVogal(c)) {
                resultado += "*";
            } else {
                resultado += c;
            }
        }

        return resultado;
    }

    private static boolean ehVogal(char c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}





        
       
            
        
      
