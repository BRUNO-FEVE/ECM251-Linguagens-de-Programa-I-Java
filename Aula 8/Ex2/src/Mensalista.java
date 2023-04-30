public class Mensalista extends Empregado {
    private double salarioMensal;

    public Mensalista() {
        this.salarioMensal = 0.0;
    }

    public Mensalista(String nome, String sobrenome, int cpf, double salarioMensal) {
        super(nome, sobrenome, cpf, salarioMensal);
        this.salarioMensal = super.getSalarioMensal();
    }

    public double getSalarioMensal() {
        return this.salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal > 0.0) {
            this.salarioMensal = salarioMensal;
        }
    }
}
