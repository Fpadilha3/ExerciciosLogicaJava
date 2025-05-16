
package exercicio4;

import java.util.Scanner;

public class Exercicio4 {

    
    public static void main(String[] args) {
        
        
        
 
        Scanner ler = new Scanner(System.in);

        System.out.println("Quantas palavras deseja inserir?");
        int tamanho = ler.nextInt();
        ler.nextLine(); 

        String[] palavras = new String[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite a palavra " + (i + 1) + ":");
            palavras[i] = ler.nextLine();
        }

        String resultado = stringComMaisVogais(palavras);
        System.out.println("A string com mais vogais é: " + resultado);
    }

    public static String stringComMaisVogais(String[] lista) {
        int maxVogais = -1;
        String comMaisVogais = "";

        for (int i = 0; i < lista.length; i++) {
            int quantidade = contarVogais(lista[i]);
            if (quantidade > maxVogais) {
                maxVogais = quantidade;
                comMaisVogais = lista[i];
            }
        }

        return comMaisVogais;
    }

    public static int contarVogais(String texto) {
        int contador = 0;
        char[] letras = texto.toCharArray();

        for (int i = 0; i < letras.length; i++) {
            char c = letras[i];
            if (ehVogal(c)) {
                contador++;
            }
        }

        return contador;
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
