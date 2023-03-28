public class Disciplina {

    private static String nome; 
    private static String professor;
    private static int semestre;
    private static boolean ofertada;

    // método construtor
    public Disciplina (String newName, String newProfessor, int newSemestre, boolean newOfertada) {
        nome = newName;
        professor = newProfessor;
        semestre = newSemestre;
        ofertada = newOfertada;
    }

    // métodos de acesso
    public static String getNome () {
        return nome;
    }

    public static String getProfessor () {
        return professor;
    }

    public static int getSemestre () {
        return semestre;
    }

    public static boolean getOfertada () {
        return ofertada;
    }

    //métodos modificadores
    public static void setNome (String newNome) {
        nome = newNome;
    }

    public static void setCurso(String newProfessor) {
        professor = newProfessor;
    }

    public static void setQntDeAlunos(int newSemestre) {
        semestre = newSemestre;
    }

    public static void setSerie(boolean newOfertada) {
        ofertada = newOfertada;
    }
}
