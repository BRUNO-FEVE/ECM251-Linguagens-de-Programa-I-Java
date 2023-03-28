import java.util.Scanner;

public class TesteProduto {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String[] mensagens = {"Digite o nome do produto: ", "Digite o preco: ", "Digite a quantidade: "};
        String[] respostas = new String[mensagens.length];

        for(int i=0; i<mensagens.length; i++) {
            System.out.print(mensagens[i]);
            respostas[i] = sc.nextLine();
        }

        new Produto(respostas[0], Double.parseDouble(respostas[1]), Integer.parseInt(respostas[2]));

        System.out.println("\nDADOS:\nNome da turma: " + Produto.getNome() + "\nNome do curso: " + Produto.getPreco() + "\nQuantidade de alunos: " + Produto.getQuatidade() + "\n");
            
        sc.close();
    }
}
