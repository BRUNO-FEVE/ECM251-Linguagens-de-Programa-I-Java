import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String[] perguntas = {"Digite o codigo do consumidor: ", "Digite quantidade de kWh consumidos durante o mês: ", "Digite o tipo de consumidor:"};
        int[] codigo = new int[3];
        double total = 0;
        double totalOneTwo = 0;
        int l = 0;

        do {
            
            for (int i=0; i<3; i++) {
                System.out.print(perguntas[i]);
                codigo[i] = sc.nextInt();
            }
            
            if (codigo[0] != 0) {
                double consumo = 0; 
            
                switch (codigo[2]) {
                    case 1:
                        consumo += 0.3*codigo[1];
                        break;
                
                    case 2:
                        consumo = 0.5*codigo[1];
                        break;
                    case 3: 
                        consumo = 0.7*codigo[1];
                        break;
                    default:
                        break;
                }

                total += consumo;

                System.out.println("\nO consumo do consumidor " + codigo[0] + " foi " + consumo + " reais");
                
                if (codigo[2] == 1 || codigo[2] == 2) {
                    l++;
                    totalOneTwo += consumo; 
                }
            }
            
        } while (codigo[0] != 0);
        sc.close();

        System.out.println("\nRESULTADOS: \nO total para os tres tipos foi de " + total + " reais");
        System.out.println("A media para os tipos 1 e 2 foi de " + totalOneTwo/l + " reais");
    }
}
