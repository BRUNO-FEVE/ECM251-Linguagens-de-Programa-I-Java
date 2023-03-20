import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex15 {
    /* 15. Crie um algoritmo para calcular a área de um círculo, com base no seu raio (Área = PI*raio*raio, onde PI = 3.14159). Use variáveis reais. */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nInsira o raio: ");
        int raio = sc.nextInt();
        
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);

        double area = Math.PI*raio*raio;

        System.out.println("A area do circulo é: " + df.format(area));
        sc.close();
    }
}
