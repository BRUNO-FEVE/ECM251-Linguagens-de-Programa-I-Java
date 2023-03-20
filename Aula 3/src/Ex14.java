import java.util.Scanner;

public class Ex14 {
    /* 14. Escrever um algoritmo que leia três números reais a, b e c, calcule e escreva o resultado da expressão:
        x = 2 * ( ( a – c ) / 8 ) – b * 5. */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o numero a: ");
        int a = sc.nextInt();
        System.out.print("\nDigite o numero b: ");
        int b = sc.nextInt();
        System.out.print("\nDigite o numero c: ");
        int c = sc.nextInt();
        

        double resultado = 2*((a-c)/8)-b*5;
        System.out.println("\nO resultado é: " + resultado);

        sc.close();
    }
}
