import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String num = "";
        float media = 0;
        int i = 0;

        do {
            i++;

            System.out.println("\nOBS: Para finalizar o programa basta precionar enter SEM VALOR no input!!!");
            System.out.print("Digite o numero: ");
            num = sc.nextLine();
            
            media += Integer.parseInt(num);

            System.out.println("\n" + num + " foi adicionado!");
            System.out.println("A media é: " + media/i);
        } while (num != ""); 
        sc.close();
    }
}
