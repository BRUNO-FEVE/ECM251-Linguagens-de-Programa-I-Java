import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] perguntas = {"Digite o primeiro numero: ", "Digite o segundo numero: ", "\nOperações Disponíveis:\n1. Adição;\n2. Subtração;\n3. Multiplicação;\n4. Divisão;\n9. Sair do Programa.\nDigite o número de ordem da opção desejada: "};
        int numChoice = 0;
        int[] numbers = new int[perguntas.length];
        
        do {
            for (int i=0; i<2; i++) {
                System.out.print(perguntas[i]);
                numbers[i] = sc.nextInt();
            }

            System.out.print(perguntas[2]);
            numChoice = sc.nextInt();

            switch (numChoice) {
                case 1:
                    System.out.println("\nA soma dos numeros é: " + (numbers[0]+numbers[1]));;
                    break;
            
                case 2:
                    System.out.println("A soma dos numeros é: " + (numbers[0]-numbers[1])); 
                    break;
                case 3: 
                    System.out.println("A soma dos numeros é: " + (numbers[0]*numbers[1])); 
                    break;
                case 4: 
                    System.out.println("A soma dos numeros é: " + (numbers[0]/numbers[1])); 
                    break;
                default:
                    break;
            }
        } while (numChoice != 9);
        sc.close();
    }
}