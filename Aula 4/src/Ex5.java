import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        int num = sc.nextInt();

        if(num > 20 && num < 90) {
            System.out.println("O numero" + num + "esta entre 20 e 90");
        } else {
            System.out.println("Ele nao atende os requisitos");
        }
        sc.close();
    }
}
