import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex9 {
    /* 9. Entrar com um número e imprimir o seu logaritmo na base 10. */
    public static void main(String[] args) throws Exception { 
        Scanner sc = new Scanner(System.in);
        System.out.print("\nDigite o numero: ");
        int numero = sc.nextInt();

        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);

        System.out.println("\nO resultado é: " + df.format(Math.log10(numero)) + "\n");

        sc.close();
    }
}
