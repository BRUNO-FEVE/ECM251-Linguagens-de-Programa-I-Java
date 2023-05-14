public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 20);
        Funcionario funcionario = new Funcionario("Maria", 10, 1000, "Gerente");
        FuncionarioAposentado funcionarioAposentado = new FuncionarioAposentado("José", 40, 2000);
        
        System.out.println(pessoa.getDados());
        System.out.println(funcionario.getDados());
        System.out.println(funcionarioAposentado.getDados());

    }
}
