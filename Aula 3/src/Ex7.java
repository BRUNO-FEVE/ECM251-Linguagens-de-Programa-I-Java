import java.util.Scanner;

public class Ex7 {
    /* 7. Entrar com um único número inteiro, com 5 dígitos, e imprimir o algarismo correspondente à casa da dezena. */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número de 5 digitos: ");
        String num = sc.nextLine();

        if (num.length() == 5) {
            System.out.println(num.substring(3, 5));
        } else {
            System.out.println("O número nao possui 5 digitos!!");
        }
        sc.close();
    }
}
