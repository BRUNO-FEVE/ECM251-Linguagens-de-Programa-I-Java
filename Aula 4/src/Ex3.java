import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        double num = sc.nextInt();

        if (num > 0) {
            num = Math.sqrt(num);
            System.out.println("A raiz quadrado é: " + num);
        } else if (num < 0) {
            num = num*num;
            System.out.println("O quadrado do nuemro é: " + num);
        } else {
            System.out.println("O numero inserido é neutro!!");
        };
        sc.close();
    }
}
