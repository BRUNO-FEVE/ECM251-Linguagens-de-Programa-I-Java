import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int numAnt = 0;
        int numero = 1;

        System.out.print("Digite um numero: ");
        int num = sc.nextInt();

        do {
            soma = numAnt + numero;
            numAnt = numero;
            numero = soma;

            if(soma < num) {
                System.out.println(soma);
            }
        } while (soma < num);
        sc.close();
    }
}
