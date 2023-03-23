import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o verbo no infinitivo: ");
        String verbo = sc.nextLine();

        verbo = verbo.substring(verbo.length()-2, verbo.length());

        boolean conjOne = verbo.equals("ar") == true ? true : false;
        boolean conjTwo = verbo.equals("er") == true ? true : false;
        boolean conjThree = verbo.equals("ir") == true ? true : false;

        verbo = verbo.substring(verbo.length()-1, verbo.length());
        boolean ultima = verbo.equals("r") == true ? true : false;

        if (conjOne || conjTwo || conjThree) {
            if (conjOne) {
                System.out.println("O verbo esta na primeira conjugacao!!");
            } else if (conjTwo) {
                System.out.println("O verbo esta na segunda conjugacao!!");
            } else {
                System.out.println("O verbo esta na terceira conjugacao!!");
            }
        } else if (!ultima) {
            System.out.println("O verbo nem no infinitivo esta");
        } else {
            System.out.println("Provavelmente nao é verbo");
        }
        sc.close();
    }
}