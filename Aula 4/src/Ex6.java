import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        int num = sc.nextInt();

        if(num < 20) {
            System.out.println("Numero digitado menor que 20!!");
        } else if (num > 20) {
            System.out.println("Numero digitado maior que 20!!"); 
        } else {
            System.out.println("Numero digitado é igual a 20");
        }
        sc.close();
    }
}
