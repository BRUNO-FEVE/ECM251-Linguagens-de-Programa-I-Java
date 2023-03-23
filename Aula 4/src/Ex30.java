import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int maior = 0;
        int menor = 0;
        int numAnt = 0;

        for (int i=0; i<5; i++) {
            System.out.print("Digite o numero " + (i+1) + ": ");
            int num= sc.nextInt();

            if (num == numAnt && i != 0) {
                System.out.println("Error numeros IGUAIS!!");
            }
            numAnt = num;
            
            if (i==0) {
                menor = num;
            }
            
            maior = Math.max(maior, num);
            menor = Math.min(menor, num);
        }
        System.out.println("Maior: " + maior + " Menor: " + menor);  
        sc.close();
    } 
}
