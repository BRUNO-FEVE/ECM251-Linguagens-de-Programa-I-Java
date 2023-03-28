import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] perguntas = {"Digite o limite superior: "};
        int[] codigo = new int[perguntas.length];
        String intervalo = "";
        
        for (int i=0; i<perguntas.length; i++) {
            System.out.print(perguntas[i]);
            codigo[i] = sc.nextInt();
        }

        for (int i=1; i<=codigo[0]; i+=2) {
            intervalo += i + " ";
        }
        System.out.println(intervalo);
        sc.close();
    }
}