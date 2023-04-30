import java.util.Scanner;

public class PessoaFisica {
    private String nome;
    private String sobrenome;
    private int cpf;

    Scanner sc = new Scanner(System.in);

    public PessoaFisica(String nome, String sobrenome, int cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public PessoaFisica() {
        System.out.print("Digite o nome: ");
        this.nome = sc.nextLine();
        System.out.print("Digite o sobrenome: ");
        this.sobrenome = sc.nextLine();
        System.out.print("Digite o cpf: ");
        this.cpf = sc.nextInt();
    }

    public String getNome() {
        return this.nome;
    }

    public String getSobrenome(){
        return this.sobrenome;
    }

    public int getCpf() {
        return this.cpf;
    }

    public String dados() {
        return "Nome: " + this.nome + " " + this.sobrenome + "\nCPF: " + this.cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
