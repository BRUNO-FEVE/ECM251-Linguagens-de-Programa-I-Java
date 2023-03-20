import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex10 {
    /* 10. Entrar com um número e a base em que se deseja calcular o logaritmo desse número. Após isto, calcular tal logaritmo e imprimir o resultado. */
    public static void main(String[] args) throws Exception { 
        Scanner sc = new Scanner(System.in);
        System.out.print("\nDigite a o número: ");
        int num = sc.nextInt();
        System.out.print("\nDigite a base do logaritimo: ");
        int base = sc.nextInt();

        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);

        System.out.println("O resultado do logaritimo é: " + df.format(Math.log(num)/Math.log(base)));

        sc.close();
    }
}
