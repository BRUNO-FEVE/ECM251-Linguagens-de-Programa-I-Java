import java.util.Scanner;

public class Ex1 {

    /*1. Crie um algoritmo para calcular o número de dias que você está vivo, com base em sua idade, que deverá ser digitada. */
    
    public static void main(String[] args) throws Exception {

        Scanner idade = new Scanner(System.in);
        System.out.print ("Digite a sua idade: ");

        int dias = idade.nextInt();
        dias *= 365;

        System.out.println("Voce ja viveu " + dias + " dias.");
        idade.close();
    }
}
