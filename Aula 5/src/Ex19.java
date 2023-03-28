import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] perguntas = {"Digite o limite superior: ", "Digite o incremento: "};
        int[] codigo = new int[2];
        String intervalo = "";
        
        for (int i=0; i<perguntas.length; i++) {
            System.out.print(perguntas[i]);
            codigo[i] = sc.nextInt();
        }

        for (int i=0; i<=codigo[0]; i+=codigo[1]) {
            intervalo += i + " ";
        }
        System.out.println(intervalo);
        sc.close();
    }
}