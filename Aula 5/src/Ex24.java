import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] perguntas = {"Digite o valor do seu candidato: "};
        int candOne = 0, candTwo = 0, candThree = 0, candFour = 0, voto = 0, numTotal = 0;;
        
        do {
            numTotal++;
            System.out.print(perguntas[0]);
            voto = sc.nextInt();

            switch (voto) {
                case 1:
                    candOne++;
                    break;
            
                case 2:
                    candTwo++;
                    break;
                case 3: 
                    candThree++;
                    break;
                case 4: 
                    candFour++;
                    break;
                default:
                    break;
            }
        } while (voto != -1);
        
        numTotal--;
        System.out.println("\nO percentual do cantidato um foi: " + (candOne*100)/numTotal + "%");
        System.out.println("O percentual do cantidato dois foi: " + (candTwo*100)/numTotal + "%");
        System.out.println("O percentual do cantidato tres foi: " + (candFour*100)/numTotal + "%");
        System.out.println("O percentual do cantidato quatro foi: " + (candThree*100)/numTotal + "%");
        System.out.println("\nTotal de eleitores foi de: " + numTotal);

        sc.close();
    }
}