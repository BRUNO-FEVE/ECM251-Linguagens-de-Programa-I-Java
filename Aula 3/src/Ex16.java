import java.util.Scanner;

public class Ex16 {
    /* 16.Ler dois números inteiros e imprimir dividendo, divisor, quociente e resto. */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nInsira o dividendo: ");
        int dividendo = sc.nextInt();
        System.out.print("\nInsira o divisor: ");
        int divisor = sc.nextInt();

        System.out.println("\nCom o dividendo " + dividendo + " e divisor " + divisor + " temos os resultados:\n\nquociente: " + dividendo/divisor + "\nresto: " + dividendo%divisor);

        sc.close();
    }
}
