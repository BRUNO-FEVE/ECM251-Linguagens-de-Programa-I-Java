import java.util.Scanner;

public class Ex20 { 
    /* 20.Criar um programa capaz de calcular o 3o lado de um triângulo, digitados os outros dois lados e o ângulo entre eles esses dois lados. */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nInsira o lado 1: ");
        int lado1 = sc.nextInt();
        System.out.print("\nInsira o lado 2: ");
        int lado2 = sc.nextInt();
        System.out.print("\nInsira o angulo: ");
        int angulo = sc.nextInt();

        double radianos = Math.toRadians(angulo);
        double lado3 = Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2) - 2 * lado1 * lado2 * Math.cos(radianos));
        
        System.out.println("O lado 3: " + lado3);
        sc.close();
    }
}
