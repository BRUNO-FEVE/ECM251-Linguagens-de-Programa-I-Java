import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        int num = sc.nextInt();

        if (num%5 == 0) {
            System.out.println("É divisivel por 5!!");
        } else {
            System.out.println("Nao é divisivel por 5!!");
        }
        sc.close();
    }
}
