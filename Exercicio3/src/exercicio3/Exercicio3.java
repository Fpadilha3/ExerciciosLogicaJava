
package exercicio3;

import java.util.Scanner;


public class Exercicio3 {

 
    public static void main(String[] args) {
        
        

        Scanner ler = new Scanner(System.in);

        System.out.println("Quantos números deseja inserir?");
        int tamanho = ler.nextInt();

        int[] numeros = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            numeros[i] = ler.nextInt();
        }

        int maiorAbsoluto = encontrarMaiorValorAbsoluto(numeros);
        System.out.println("Maior valor absoluto é: " + maiorAbsoluto);
    }

    public static int encontrarMaiorValorAbsoluto(int[] vetor) {
        int maior = valorAbsoluto(vetor[0]);

        for (int i = 1; i < vetor.length; i++) {
            int valorAtual = valorAbsoluto(vetor[i]);
            if (valorAtual > maior) {
                maior = valorAtual;
            }
        }

        return maior;
    }


    public static int valorAbsoluto(int numero) {
        if (numero < 0) {
            return -numero;
        } else {
            return numero;
        }
    }
}

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
   
    }
    
}
