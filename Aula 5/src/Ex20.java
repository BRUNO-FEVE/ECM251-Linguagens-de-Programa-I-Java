import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] perguntas = {"Digite o nome: ", "Digite idade: ", "Digite sexo: "};
        String[] codigo = new String[perguntas.length];
        String resultado = "";
        int l = 0;
        
        do {
            l++;
            for (int i=0; i<perguntas.length; i++) {
                System.out.print(perguntas[i]);
                codigo[i] = sc.nextLine();
            }

            if (Integer.parseInt(codigo[1]) > 21 && codigo[2].equals("masculino")) {
                resultado += codigo[0] + "\n";
            }
        } while (l < 20);
        System.out.println("Lista de nomes:\n" + resultado);
        sc.close();
    }
}
