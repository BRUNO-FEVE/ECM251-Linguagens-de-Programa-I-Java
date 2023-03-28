import java.util.Scanner;

public class TesteDiciplina {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String[] mensagens = {"Digite o nome da disciplina: ", "Digite o nome do professor: ", "Digite o semestre: ", "Digite se é ofertada: "};
        String[] respostas = new String[mensagens.length];

        for(int i=0; i<mensagens.length; i++) {
            System.out.print(mensagens[i]);
            respostas[i] = sc.nextLine();
        }

        new Disciplina(respostas[0], respostas[1], Integer.parseInt(respostas[2]), Boolean.parseBoolean(respostas[3]));

        System.out.println("\nDADOS:\nNome da turma: " + Disciplina.getNome() + "\nNome do curso: " + Disciplina.getProfessor() + "\nQuantidade de alunos: " + Disciplina.getSemestre() + "\nÉ ofertada: " + Disciplina.getOfertada());
            
        sc.close();
    }
}
