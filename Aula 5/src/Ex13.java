import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int l = 0;
        int primos = 0;

        do {
            System.out.print("Digite o numero: ");
            num = sc.nextInt();
            if (num > 0) {
                l = 0;

                for(int i=1; i<=num; i++) {
                    if (num%i == 0) {
                        l++;
                    }
                }

                if (l < 3) {
                    System.out.println("O numero " + num + " é primo!!" );
                    primos++;
                } else {
                    System.out.println("Nao é primo");
                }
            }

        } while (num > 0);

        System.out.println("O numero de numeros primos é de " + primos );
        sc.close();
    }
}
