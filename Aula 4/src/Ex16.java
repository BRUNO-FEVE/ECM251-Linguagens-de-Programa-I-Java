import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numOne = 0;

        for (int i=0; i<2; i++) {
            System.out.print("Digite o ano atual: ");
            int numTwo = sc.nextInt();

            if (numOne == numTwo && i > 0) {
                System.out.println("Eles sao iguais!!");
            } else if (i>0){
                System.out.println("Nao sao iguais");
            }
            numOne = numTwo; 
        }
        sc.close();
    }
}
