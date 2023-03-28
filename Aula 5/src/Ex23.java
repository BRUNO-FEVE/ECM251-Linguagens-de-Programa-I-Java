import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] perguntas = {"Digite o valor da unidade: ", "Digite a quantidade do produto: "};
        int[] codigo = new int[perguntas.length];
        int total = 0;
        
        do {
            for (int i=0; i<perguntas.length; i++) {
                System.out.print(perguntas[i]);
                codigo[i] = sc.nextInt();
            }

            if(codigo[0] > 0 && codigo[1] > 0) {
                total += codigo[0]*codigo[1];
            } else {
                System.out.println("Valor NEGATIVO!! DIGITE DE FORMA CORRETA");
            }
            
        } while (codigo[1] != 0);
        System.out.println("Valor total a ser pago: " + total);
        sc.close();
    }
}