public class Horista extends Empregado {
    private double salarioHora;
    private int horasTrabalhadas;

    public Horista() {
        this.salarioHora = 0.0;
        this.horasTrabalhadas = 0;
    }

    public Horista(String nome, String sobrenome, int cpf, double salarioHora, int horasTrabalhadas) {
        super(nome, sobrenome, cpf, salarioHora * horasTrabalhadas);
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getSalarioHora() {
        return this.salarioHora;
    }

    public int getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public void setSalarioHora(double salarioHora) {
        if (salarioHora > 0.0) {
            this.salarioHora = salarioHora;
        }
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        if (horasTrabalhadas > 0) {
            this.horasTrabalhadas = horasTrabalhadas;
        }
    }

    public double getSalarioMensal() {
        return this.salarioHora * this.horasTrabalhadas;
    }

    public String dados() {
        return super.dados() + "\nSalário hora: " + this.salarioHora + "\nHoras trabalhadas: " + this.horasTrabalhadas;
    }
}
