import java.util.Scanner;

public class Ex25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num1, num2;
        int opcao;

        do {
            System.out.println("Operações Disponíveis:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("9. Sair do Programa");
            System.out.print("Digite o número de ordem da opção desejada: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    num1 = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = sc.nextDouble();
                    System.out.println("Resultado da adição: " + (num1 + num2));
                    break;
                case 2:
                    System.out.print("Digite o primeiro número: ");
                    num1 = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = sc.nextDouble();
                    System.out.println("Resultado da subtração: " + (num1 - num2));
                    break;
                case 3:
                    System.out.print("Digite o primeiro número: ");
                    num1 = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = sc.nextDouble();
                    System.out.println("Resultado da multiplicação: " + (num1 * num2));
                    break;
                case 4:
                    System.out.print("Digite o primeiro número: ");
                    num1 = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = sc.nextDouble();
                    if (num2 == 0) {
                        System.out.println("Não é possível dividir por zero.");
                    } else {
                        System.out.println("Resultado da divisão: " + (num1 / num2));
                    }
                    break;
                case 9:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println();
        } while (opcao != 9);

        sc.close();
    }

}
