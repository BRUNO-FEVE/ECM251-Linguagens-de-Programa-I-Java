import java.util.Scanner;

public class Ex3 {
    /*3. Crie um algoritmo que leia um número inteiro e o eleve ao quadrado usando a classe Math, onde a base e o expoente são números reais. */
    public static void main(String[] args) throws Exception {
        Scanner numero = new Scanner(System.in);
        System.out.print("Digite o numero que sera elevado: ");
        double num = numero.nextDouble();

        double resultado = Math.pow(num, 2);

        System.out.println("O resultado é: " + resultado);

        numero.close();
    }
}
