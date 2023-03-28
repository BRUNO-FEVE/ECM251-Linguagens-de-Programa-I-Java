import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = 0; 
        int numAnt = 0;

        do {
            System.out.print("Digite um numero: ");
            num = sc.nextInt();

            if (num > numAnt) {
                numAnt = num;
            }

        } while (num != -9999);
        System.out.println("O maior numero digitado foi: " + numAnt);
        sc.close();
    }
}
