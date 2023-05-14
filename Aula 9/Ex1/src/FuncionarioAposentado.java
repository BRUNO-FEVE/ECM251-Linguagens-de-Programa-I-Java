public class FuncionarioAposentado extends Pessoa{
    private double salarioAposentadoria;

    public FuncionarioAposentado(String nome, int idade, double salarioAposentadoria) {
        super(nome, idade);
        this.salarioAposentadoria = salarioAposentadoria;
    }

    public double getSalarioAposentadoria() {
        return salarioAposentadoria;
    }

    public void setSalarioAposentadoria(double salarioAposentadoria) {
        if (salarioAposentadoria > 0) {
            this.salarioAposentadoria = salarioAposentadoria;
        }
    }

    public String getDados() {
        return super.getDados() + "\nSalario Aposentadoria: " + salarioAposentadoria;
    }
}
