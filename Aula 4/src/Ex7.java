import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        sc.nextLine();
        System.out.print("Digite o seu sexo: ");
        String sexo = sc.nextLine();
        System.out.print("Digite o sua idade: ");
        int idade = sc.nextInt();

        if(sexo.equals("feminino") || sexo.equals("Feminino")) {
            if(idade < 25) {
                System.out.println("ACEITA");
            } else {
                System.out.println("NAO ACEA");
            }
        } else {
            System.out.println("NAO AITA");
        }
        sc.close();
    }
}
