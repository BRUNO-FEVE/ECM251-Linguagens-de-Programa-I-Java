import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numOne = 0;
        int numTwo = 0;

        int maior = 0;

        for (int i=0; i<3; i++) {
            System.out.print("Digite o numero " + (i+1) + ": ");
            int numThree = sc.nextInt();

            if (i == 0) {
                numOne = numThree;
            } else if (i == 1) {
                numTwo = numThree;
            }

            if(numOne > numTwo && numOne > numThree && i == 2) {
                maior = numOne;
            } else if(numTwo > numOne && numTwo > numThree && i == 2) {
                maior = numTwo;
            } else if (i==2) {
                maior = numThree;
            }
        }
        System.out.println(maior);
        sc.close();
    }
}