import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numOne = 0;
        int numTwo = 0;
        int numThree = 0;

        for (int i=0; i<3; i++) {
            System.out.print("Digite o numero " + (i+1) + ": ");
            numThree = sc.nextInt();

            if (i == 0) {
                numOne = numThree;
            } else if (i == 1) {
                numTwo = numThree;
            }
        }

        boolean sumOne = (numOne + numTwo) > numThree ? true : false;
        boolean sumTwo = (numOne + numThree) > numTwo ? true : false;
        boolean sumThree = (numTwo + numThree) > numOne ? true : false;

        if (sumOne == true && sumTwo == true && sumThree == true) {
            System.out.print("Podem ser lados de triangulo!!");
            if (numOne == numTwo  && numOne == numThree) {
                System.out.println(" E é um triangulo equilatero");
            } else if (numOne == numTwo || numOne == numThree) {
                System.out.println(" E é um triangulo isóceles");
            } else {
                System.out.println(" E é um triangulo escaleno");
            }
        } else {
            System.out.println("Nao sao lados de umtriangulo!!");
        }
        sc.close();
    } 
}
