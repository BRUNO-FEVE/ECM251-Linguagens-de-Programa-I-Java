import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        int num = sc.nextInt();
        String dez = Integer.toString(num).substring(1, 2);

        num = Integer.parseInt(dez);
        
        if (num%2 == 0) {
            System.out.println("O " + num + " da casa das dezenas é par!!");
        } else {

            System.out.println("O " + num + " numero da casa das dezenas é impar!!");
        }
        sc.close();
    }
}
