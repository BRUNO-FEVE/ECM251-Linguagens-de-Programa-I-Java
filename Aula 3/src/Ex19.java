import java.util.Scanner;

public class Ex19 {
    /* 19. Criar um algoritmo que calcule e imprime a área de um losango. */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nInsira o D: ");
        int D = sc.nextInt();
        System.out.print("\nInsira o d: ");
        int d = sc.nextInt();

        System.out.println("A area do losangolo é: " + (D*d)/2);
        sc.close();
    } 
}
