import java.util.Scanner;

public class Ex18 {
    /* 18. Criar um algoritmo que calcule e imprime a área de um triângulo. */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nInsira o base: ");
        int base = sc.nextInt();
        System.out.print("\nInsira o altura: ");
        int altura = sc.nextInt();

        System.out.println("A area é: " + (base*altura)/2);
        sc.close();
    }
}
