public class Produto {

    private static String nome; 
    private static double preco;
    private static int quatidade;

    // método construtor
    public Produto (String newNome, double newPreco, int newQuatidade) {
        nome = newNome;
        preco = newPreco;
        quatidade = newQuatidade;
    }

    // métodos de acesso
    public static String getNome () {
        return nome;
    }

    public static double getPreco () {
        return preco;
    }

    public static int getQuatidade () {
        return quatidade;
    }

    //métodos modificadores
    public static void setNome (String newNome) {
        nome = newNome;
    }

    public static void setPreco(double newPreco) {
        preco = newPreco;
    }

    public static void setQuantidade(int newQuantidade) {
        quatidade = newQuantidade;
    }
}
