import java.util.Scanner;

public class Ex4 {
    /* 4. Crie um algoritmo capaz de ler três Strings quaisquer, digitadas por meio do console, e apresente a soma do comprimento destas Strings. */
    public static void main(String[] args) throws Exception {
        int comprimentoTotal = 0;
        Scanner sc;
        for ( int i=0; i<3; i++) {
            sc = new Scanner(System.in);
            System.out.print("Digite a frase de numero " + i+1 + ":");
            String comprimento = sc.nextLine();
            comprimentoTotal += comprimento.length();
        }
        System.out.println("As frase inseridas tem o comprimento de: " + comprimentoTotal + " caracteres.");
    } 
}
