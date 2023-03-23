import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        int num = sc.nextInt();

        if (num%3 == 0) {
            System.out.println("É multiplo de 3!!");
        } else {
            System.out.println("Nao é multiplo de 3!!");
        }
        sc.close();
    }
}
