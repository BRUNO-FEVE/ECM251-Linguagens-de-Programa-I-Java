import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] perguntas = {"Digite quantos numeros pares: "};
        int[] codigo = new int[perguntas.length];
        String intervalo = "";
        int k = 0;
        int l = 0;

        for (int i=0; i<perguntas.length; i++) {
            System.out.print(perguntas[i]);
            codigo[i] = sc.nextInt();
        }
        
        do {
            k++;
            l += 2;

            intervalo += l + " ";
            
            
        } while (k < codigo[0]);
        System.out.println(intervalo);
        sc.close();
    }
}