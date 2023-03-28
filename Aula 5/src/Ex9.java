import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        String divisores = "";

        do {
            System.out.println("\nOBS: Para finalizar o programa basta precionar enter com -999 no input!!!");
            System.out.print("Digite o numero: ");
            num = sc.nextInt();
            divisores = "";

            if (num != -999) {
                for(int i=1; i<=num; i++) {
                    if (num%i == 0) {
                        divisores += " " + i;
                    }
                }
                System.out.println("Os divisores do numero: " + num + " sao:" + divisores);
            } else {
                System.out.println("Programa encerrado!!\n");
            }
            
        } while (num != -999); 
        sc.close();


    }
}
