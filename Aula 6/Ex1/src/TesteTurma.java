import java.util.Scanner;

public class TesteTurma {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String[] mensagens = {"Digite o nome da turma: ", "Digite o curso: ", "Digite a quantidade de alunos: ", "Digite a serie: ", "Digite novamente a quantidade de alunos: "};

        String[] respostas = new String[mensagens.length];

        for(int i=0; i<mensagens.length-1; i++) {
            System.out.print(mensagens[i]);
            respostas[i] = sc.nextLine();
        }

        new Turma(respostas[0], respostas[1], Integer.parseInt(respostas[2]), Integer.parseInt(respostas[3]));

        for (int i=0; i<2; i++) {
            if (i == 1) {
                System.out.print(mensagens[4]);
                Turma.setQntDeAlunos(sc.nextInt());
            }
            System.out.println("\nDADOS:\nNome da turma: " + Turma.getNome() + "\nNome do curso: " + Turma.getCurso() + "\nQuantidade de alunos: " + Turma.getQntDeAlunos() + "\nSerie: " + Turma.getSerie() + "\n");
        }
        sc.close();
    }
}
