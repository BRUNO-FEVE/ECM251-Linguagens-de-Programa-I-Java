import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        int num = sc.nextInt();

        for(int i=0; i<4; i++) {
            String separador = Integer.toString(num).substring(i, i+1);
            if (Integer.parseInt(separador)%4 == 0 && i != 2) {
                System.out.println("O " + separador + " é multiplo de 4!!");
            } else if (i != 2) {
                System.out.println("O " + separador + " nao é multiplo de 4!!");
            }
        }
        sc.close();
    }
}
