import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        int num = sc.nextInt();

        if (num%3 == 0 && num%7 == 0) {
            System.out.println("É divisivel por 3 e 7!!");
        } else {
            System.out.println("Nao é divisivel por 3 e 7!!");
        }
        sc.close();
    }
}
