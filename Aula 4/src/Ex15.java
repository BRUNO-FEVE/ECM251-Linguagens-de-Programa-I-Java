import java.util.Scanner;

public class Ex15 { 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o ano do seu nascimento: ");
        int anoNascimento = sc.nextInt();
        System.out.print("Digite o ano atual: ");
        int anoAtual = sc.nextInt();

        if ((anoAtual - anoNascimento) > 100 || anoNascimento < 0) {
            System.out.println("Ano " + anoNascimento + " invalido!");
        } else {
            System.out.println("A sua idade é de " + (anoAtual - anoNascimento) + " anos.");
        }
        sc.close();
    }
}
