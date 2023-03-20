import java.util.Scanner;

public class Ex12 {
    /* 12. Entre com uma data em uma variável do tipo inteiro no formato ddmmaa e imprimir dia, mês e ano separados. */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nInsira a data: ");
        int data = sc.nextInt();

        String divisor = Integer.toString(data);

        System.out.println(divisor.substring(0, 2) + " dia " + divisor.substring(2, 4) + " mes " + divisor.substring(4, 6) + " ano.");

        sc.close();
    }
}
