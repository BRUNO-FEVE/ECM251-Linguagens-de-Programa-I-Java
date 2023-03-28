import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int idade = 0;
        int i = 0;
        int l = 0;

        do {
            System.out.println("Digite a sua idade: ");
            idade = sc.nextInt();

            if (idade < 21 && idade > 0 && idade < 120) {
                i++;
            } else if (idade > 50 && idade > 0 && idade < 120) {
                l++;
            }


        } while (idade > 0 && idade < 120);

        System.out.println("O numero de pessoas com menos de 21 anos é de " + i + "\nO numero de pessoas com mais de 50 ano é de " + l);
        sc.close();
    }
}
