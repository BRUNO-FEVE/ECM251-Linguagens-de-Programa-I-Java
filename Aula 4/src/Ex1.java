import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        for (int i=1; i<3; i++) {
            System.out.print("Digite o " + i + " numero: ") ;
            num += sc.nextInt();
        };

        if(num > 10) {
            System.out.println("\nA soma dos numeros é: " + num);
        } else {
            System.out.println("O numero nao atingiu o valor minimo!!");
        }
        sc.close();
    }
}
