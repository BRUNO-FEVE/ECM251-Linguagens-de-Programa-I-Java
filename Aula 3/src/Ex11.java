import java.util.Arrays;
import java.util.Scanner;

public class Ex11 {
    /* 11.Crie um algoritmo que embaralhe mensagens fazendo o seguinte: leia três frases, separe cada uma delas ao meio. Então junte nesta ordem: primeira metade da segunda, segunda metade da terceira, segunda metade da segunda, primeira metade da primeira, primeira metade da terceira, segunda metade da primeira. Concatene então as três frases originais e imprima o resultado. Na linha de baixo, escreva a frase embaralhada e compare o resultado. */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 
        String[][] frases = new String[3] [50];
    
        for (int i=0; i<3; i++) {
            System.out.print("\nDigite a frase " + (i+1) + ": ");
            frases[i] = sc.nextLine().split(" ");
        }

        System.out.println("\nA frase embaralhada ficou: " + Arrays.toString(Arrays.copyOfRange(frases[1], 0, frases[1].length/2)) + " " + Arrays.toString(Arrays.copyOfRange(frases[2], frases[2].length/2, frases[2].length)) + " " + Arrays.toString(Arrays.copyOfRange(frases[1], frases[1].length/2, frases[1].length)) + " " + Arrays.toString(Arrays.copyOfRange(frases[0], 0, frases[0].length/2)) + " " + Arrays.toString(Arrays.copyOfRange(frases[2], 0, frases[2].length/2)) + " " + Arrays.toString(Arrays.copyOfRange(frases[0], frases[0].length/2, frases[0].length))); 

        sc.close();
    }
}