import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int l = 0;
        

        System.out.print("Digite o numero: ");
        num = sc.nextInt();

        for(int i=1; i<=num; i++) {
            if (num%i == 0) {
                l++;
            }
        }

        if (l < 3) {
            System.out.println("O numero " + num + " é primo!!" );
        } else {
            System.out.println("Nao é primo");
        }
        
        sc.close();

    }
}
