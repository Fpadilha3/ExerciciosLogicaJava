
package exercicio8;

import java.util.Scanner;


public class Exercicio8 {

    public static void main(String[] args) {
        
        
        
        
 
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o tamanho do array:");
        int tamanho = ler.nextInt();

        int[] arrayOriginal = new int[tamanho];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < tamanho; i++) {
            arrayOriginal[i] = ler.nextInt();
        }

        int[] arrayInvertido = inverterArray(arrayOriginal);

        System.out.println("Array invertido:");
        for (int i = 0; i < arrayInvertido.length; i++) {
            System.out.print(arrayInvertido[i] + " ");
        }
    }

    public static int[] inverterArray(int[] arr) {
        int tamanho = arr.length;
        int[] invertido = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            invertido[i] = arr[tamanho - 1 - i];
        }

        return invertido;
    }
}

        
        
        

    }
    
}
