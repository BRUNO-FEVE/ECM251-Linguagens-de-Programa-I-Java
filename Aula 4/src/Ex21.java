import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numOne = 0;
        int numTwo = 0;

        for (int i=0; i<3; i++) {
            System.out.print("Digite o numero " + (i+1) + ": ");
            int numThree = sc.nextInt();

            if (i == 0) {
                numOne = numThree;
            } else if (i == 1) {
                numTwo = numThree;
            }

            if(numOne > numTwo && numOne > numThree && i == 2) {
                System.out.println("O maior numero é: " + numOne);
            } else if(numTwo > numOne && numTwo > numThree && i == 2) {
                System.out.println("O maior numero é: " + numTwo);
            } else if (i==2) {
                System.out.println("O maior numero é: " + numThree);
            }
        }
        sc.close();
    }
}
