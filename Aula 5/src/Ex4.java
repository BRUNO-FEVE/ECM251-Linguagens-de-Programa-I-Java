import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nome = "";
        String nomes = "" ;

        do {
            System.out.println("\nOBS: Para finalizar o programa basta precionar enter com 'FIM' no input!!!");
            System.out.print("Digite o nome:");
            nome = sc.nextLine();
            nomes += nome + " ";

            
        } while (!nome.equals("FIM")); 
        
        System.out.println("Foram digitados os seguintes nomes: " + nomes);
        sc.close();


    }
}
