import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numOne = 0;

        for (int i=0; i<2; i++) {
            System.out.print("Digite o numero " + (i+1) + ": ");
            int numTwo = sc.nextInt();

            if(numOne > numTwo && numOne != 0) {
                System.out.println("A ordem decrescente é: " + numOne + " " + numTwo);
            } else if(numOne != 0) {
                System.out.println("O ordem decrescente é: " + numTwo + " " + numOne);
            }
            numOne = numTwo;
        }
        sc.close();
    }
}
