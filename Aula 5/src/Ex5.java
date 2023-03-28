import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        do {
            System.out.println("\nOBS: Para finalizar o programa basta precionar enter com -999 no input!!!");
            System.out.print("Digite o nome: ");
            num = sc.nextInt();

            if (num != -999) {
                System.out.println("Numero digitado: " + num + " Sua raiz quadrada: " + Math.sqrt(num) + " Seu inverso: " + 1/num);
            } else {
                System.out.println("Programa encerrado!!");
            }
            
        } while (num != -999); 
        sc.close();


    }
}
