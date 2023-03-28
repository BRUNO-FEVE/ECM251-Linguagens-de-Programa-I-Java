import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = sc.nextInt();
        int resultado = 1;

        for (int i=1; i<=num; i++) {
             resultado *= i;
        }
        System.out.println(resultado);
        sc.close();
    }
}