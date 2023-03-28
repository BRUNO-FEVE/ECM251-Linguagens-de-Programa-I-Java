import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int i = 0;

        do {
            System.out.println("\nOBS: Para finalizar o programa basta precionar enter com 0 no input!!!");
            System.out.print("Digite o numero: ");
            num = sc.nextInt();
            
            if(num > 100 && num < 200) {
                i ++;
            } 
            
        } while (num != 0); 
        
        System.out.println("Foram contados " + i + " numeros entre 100 e 200!");

        sc.close();


    }
}
