import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numOne = 0;
        
        for (int i=0; i<2; i++) {
            System.out.print("Digite o numero " + i + ": ");
            int num = sc.nextInt();
            
            if (num > numOne && numOne != 0) {
                System.out.println("\nO maior numero é: " + num);
            } else if (num < numOne && numOne != 0) {
                System.out.println("\nO maior numero é: " + numOne);
            }
            numOne = num;
        }
        sc.close();
    }
}
