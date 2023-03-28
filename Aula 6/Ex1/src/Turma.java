public class Turma {

    private static String nome; 
    private static String curso;
    private static int qntDeAlunos;
    private static int serie;

    // método construtor
    public Turma (String newName, String newCurso, int numDeAlunos, int newSerie) {
        nome = newName;
        curso = newCurso;
        qntDeAlunos = numDeAlunos;
        serie = newSerie;
    }

    // métodos de acesso
    public static String getNome () {
        return nome;
    }

    public static String getCurso () {
        return curso;
    }

    public static int getQntDeAlunos () {
        return qntDeAlunos;
    }

    public static int getSerie () {
        return serie;
    }

    //métodos modificadores
    public static void setNome (String newNome) {
        nome = newNome;
    }

    public static void setCurso(String newCurso) {
        curso = newCurso;
    }

    public static void setQntDeAlunos(int newQntDeAlunos) {
        qntDeAlunos = newQntDeAlunos;
    }

    public static void setSerie(int newSerie) {
        serie = newSerie;
    }
}
