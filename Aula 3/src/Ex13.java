import java.util.Scanner;

public class Ex13 {
    /* 13. Entre com uma data em uma variável do tipo String no formato dd/mm/aa e imprimir dia, mês e ano separados. */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nInsira a data: ");
        String data = Integer.toString(sc.nextInt());

        System.out.println(data.substring(0, 2) + " dia " + data.substring(2, 4) + " mes " + data.substring(4, 8) + " ano.");

        sc.close();
    }
}
