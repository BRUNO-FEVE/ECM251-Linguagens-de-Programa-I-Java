import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numOne = 0;

        for (int i=0; i<2; i++) {
            System.out.print("Digite o numero " + (i+1) + ": ");
            int numTwo = sc.nextInt();

            if(numOne > numTwo && numOne != 0) {

                System.out.println("O quadrado do menor é: " + Math.pow(numTwo, 2) + "\nA raiz quadrada do menor é: " + Math.sqrt(numOne));
            } else if(numOne != 0) {
                System.out.println("O quadrado do menor é: " + Math.pow(numOne, 2) + "\nA raiz quadrada do menor é: " + Math.sqrt(numTwo));
            }
            numOne = numTwo;
        }
        sc.close();
    }
}
