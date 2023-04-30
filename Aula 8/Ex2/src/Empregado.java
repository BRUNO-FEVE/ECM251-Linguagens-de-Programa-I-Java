public class Empregado extends PessoaFisica {
    private double salarioMensal; // valor em reais

    public Empregado() {
        this.salarioMensal = 0.0;
    }

    public Empregado(String nome, String sobrenome, int cpf, double salario) {
        super(nome, sobrenome, cpf);
        this.salarioMensal = salario;
    }

    public double getSalarioMensal() {
        return this.salarioMensal;
    }

    public String dados() {
        return super.dados() + "\nSalário mensal: " + this.salarioMensal;
    }

    public void setSalarioMensal(double salario) {
        if (salario > 0.0) {
            this.salarioMensal = salario;
        }
    }
}
