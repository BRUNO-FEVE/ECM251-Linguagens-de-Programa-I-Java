import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex8 {

    /* 8. Entrar com um ângulo em graus e imprimir seu seno, cosseno, tangente, secante, cossecante e cotangente. */
    public static void main(String[] args) throws Exception { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o angulo em graus: ");
        double angulo = Math.toRadians(sc.nextInt());

        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);

        double seno = (Math.sin(angulo));
        double cosseno = Math.cos(angulo);
        double tangente = Math.tan(angulo);
        double secante = 1/cosseno;
        double cossecante = 1/seno;
        double cotangente = 1/tangente;
        
        System.out.println("\n O seno do angulo: " + df.format(seno) + "\n O cosseno: " + df.format(cosseno) + "\n A tangente: " + df.format(tangente) + "\n A secante: " + df.format(secante) + "\n O cossecante: " + df.format(cossecante) + "\n A contange: " + df.format(cotangente) + "\n");

        sc.close();
    }
}
