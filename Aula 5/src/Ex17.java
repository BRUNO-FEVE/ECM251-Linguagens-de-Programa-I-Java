import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] perguntas = {"Digite o limite inferior: ", "Digite o limite superior: "};
        int[] codigo = new int[2];
        double resultados = 0;
        
        for (int i=0; i<perguntas.length; i++) {
            System.out.print(perguntas[i]);
            codigo[i] = sc.nextInt();
        }

        System.out.println("Celsius      Fahrenheit");
        for(int l=codigo[0]; l<codigo[1]+1; l++) {
            resultados = (l*9/5)+32;
            System.out.println("   " + l + "           " + resultados);
        }
        sc.close();
    }
}
