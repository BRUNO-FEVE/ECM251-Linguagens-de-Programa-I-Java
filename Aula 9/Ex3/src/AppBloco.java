import java.util.Scanner;

public class AppBloco { 
    public static void main(String[] args) {
        BlocoDeNotas blocoDeNotas = new BlocoDeNotas();

        Scanner sc = new Scanner(System.in);
        String[] listaDeMensagens = {"Insira uma nota", "Remova uma nota", "Altere uma nota", "Listar todas as notas", "Saia do sistema"};

        int comando;
        do {
            System.out.println("\nDigite um dos comandos abaixo: \n");
            for(int i=1; i<listaDeMensagens.length+1; i++) {
                System.out.print(i + ") " + listaDeMensagens[i-1] + "\n");
            }

            System.out.print("\nComando:");
            comando = sc.nextInt();
            sc.nextLine();

            switch(comando) {
                case 1:
                    System.out.print("Escreva a nota que sera adicionada: ");
                    String novaNota = sc.nextLine();
                    blocoDeNotas.insiraUmaNota(novaNota);
                    System.out.println(novaNota + " Adicionado!!");
                    break;
                
                case 2:
                    System.out.print("\nDigite a opção de remoção: \n1) Por index \n2) Por string\nCoamndo: ");
                    int opcaoDeRemocao = sc.nextInt();
                    sc.nextLine();
                    if (opcaoDeRemocao == 1) {
                        System.out.print("Digite o index da nota que sera removida: ");
                        int index = sc.nextInt();
                        String notaRemovida = blocoDeNotas.getNotaPorIndex(index);
                        blocoDeNotas.removaUmaNotaPorIndex(index);
                        System.out.println(notaRemovida + " Removida!!");
                        break;
                    } else if (opcaoDeRemocao == 2) {
                        System.out.print("Digite a nota que sera removida: ");
                        String notaRemovida = sc.nextLine();
                        blocoDeNotas.removaUmaNotaPorString(notaRemovida);
                        System.out.println(notaRemovida + " Removida!!");
                        break;
                    } else {
                        System.out.println("Número digitado fora das opções!!"); 
                        break;
                    }                
                case 3:
                    System.out.print("\nDigite a opção de alteração: \n1) Por index \n2) Por string\nCoamndo: ");
                    int opcaoDeAlteração = sc.nextInt();
                    sc.nextLine();
                    if (opcaoDeAlteração == 1) {
                        System.out.print("Digite o index da nota que sera removida: ");
                        int index = sc.nextInt();
                        String notaAntiga = blocoDeNotas.getNotaPorIndex(index);
                        sc.nextLine();
                        System.out.print("Digite a nota que sera adicionada: ");
                        String notaNova = sc.nextLine();
                        blocoDeNotas.altereUmaNotaPorIndex(index, notaNova);
                        System.out.println( notaAntiga + " Removida!! " + notaNova + " Adicionada!! ");
                        break;
                    } else if (opcaoDeAlteração == 2) {
                        System.out.print("Digite a nota que sera removida: ");
                        String notaAntiga = sc.nextLine();
                        System.out.print("Digite a nota que sera adicionada: ");
                        String notaNova = sc.nextLine();
                        blocoDeNotas.altereUmaNotaPorString(notaAntiga, notaNova);
                        System.out.println(notaAntiga + " Removida!! " + notaNova + " Adicioanda!! ");
                        break;
                    } else {
                        System.out.println("Número digitado fora das opções!!"); 
                        break;
                    }
                case 4:
                    System.out.println("\n" + blocoDeNotas.getBlocoDeNotas());
            }

        } while (comando != 5);
        System.out.println("\nPROGRAMA ENCERRADO!!\n");
        sc.close();
    }
}

