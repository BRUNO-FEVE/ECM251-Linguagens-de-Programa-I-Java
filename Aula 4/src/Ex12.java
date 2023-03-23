import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        int num = sc.nextInt();

        if (num%10 == 0 || num%5 == 0 || num%2 == 0) {
            System.out.println("É divisivel!!");
        } else {
            System.out.println("Nao é divisivel por 10, nem por 5 e nem por 2!!");
        }
        sc.close();
    }
}
