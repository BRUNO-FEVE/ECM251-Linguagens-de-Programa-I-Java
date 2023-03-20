import java.util.Scanner;

public class Ex2 {
    /*2. Crie um algoritmo para calcular a área de um retângulo, com base nas medidas de sua base e de sua altura. */
    public static void main(String[] args) throws Exception {
        Scanner altura = new Scanner(System.in);
        System.out.print("Digite a altura em cm: ");
        int numAltura = altura.nextInt();

        Scanner base = new Scanner(System.in);
        System.out.print("Digite a base em cm: ");
        int numBase = base.nextInt();

        System.out.printf("A area do retangula é: %d em cmˆ2 \n", (numAltura*numBase));

        altura.close();
        base.close();
    }
}
