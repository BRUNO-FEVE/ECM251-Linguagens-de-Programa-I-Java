import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numOne = 0;
        int numTwo = 0;
        int numThree = 0;
        String ordem = "";

        for (int i=0; i<3; i++) {
            System.out.print("Digite o numero " + (i+1) + ": ");
            numThree = sc.nextInt();

            if (i == 0) {
                numOne = numThree;
            } else if (i == 1) {
                numTwo = numThree;
            }
        }

        if(numOne > numTwo && numOne > numThree) {
            ordem += "Maior: " + numOne;
            if(numTwo > numThree) {
                ordem += " Intermediario: " + numTwo + " Menor: " + numThree;
            } else {
                ordem += " Intermediario: " + numThree + " Menor: " + numTwo;
            }
        } else if (numTwo > numOne && numTwo > numThree) {
            ordem += "Maior: " + numTwo;
            if(numOne > numThree) {
                ordem += " Intermediario: " + numOne + " Menor: " + numThree;
            } else {
                ordem += " Intermediario: " + numThree + " Menor: " + numOne;
            }
        } else {
            ordem += "Maior: " + numThree;
            if (numOne > numTwo) {
                ordem += " Intermediario: " + numOne + " Menor: " + numTwo;
            } else {
                ordem += " Intermediario: " + numTwo + " Menor: " + numOne;
            }
        }
        System.out.println(ordem);
        sc.close();
    }
}