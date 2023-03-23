import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        for (int i=1; i<3; i++) {
            System.out.print("Digite o " + i + " numero: ") ;
            num += sc.nextInt();
        };

        if(num <= 20) {
            num -= 5;
            System.out.println("\nO numero final é: " + num);
        } else {
            System.out.println("O numero ultrapassou o valor maximo!!");
        }
        sc.close();
    }
}
