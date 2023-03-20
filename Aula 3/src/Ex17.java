import java.util.Scanner;

public class Ex17 {
    /* 17. Entrar com um número e imprimir o número, seu quadrado e sua raiz quadrada. */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nInsira o numero: ");
        int num = sc.nextInt();

        System.out.println("O numero ao quadrado é: " + Math.pow(num, 2) + "\nE sua raiz quadrada é: " + Math.sqrt(num));
        sc.close();
    }
}
