import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int firstNum = 0;
        int num = 0;
        int numAnt = 0;
        String crescente = "";

        for ( int i=0; i<3; i++) {
            System.out.print("Digito o " + i + " numero: ");
            num = sc.nextInt();
            firstNum = num;
 
            if (num > numAnt) {
                crescente += Integer.toString(num)+ " ";
            } else if (num < numAnt){
                if (num > firstNum) {
                    crescente = Integer.toString(firstNum) + " " + Integer.toString(num) + " " + Integer.toString(numAnt);
                } else {
                    crescente = Integer.toString(num) + " " + crescente;
                }
            } 
            numAnt = num;
        }
        System.out.println(crescente);
        sc.close();
    }
}
