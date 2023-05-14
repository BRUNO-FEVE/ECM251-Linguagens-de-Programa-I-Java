public class Funcionario extends Pessoa{
    private double salario;
    private String cargo;

    public Funcionario(String nome, int idade, double salario, String cargo) {
        super(nome, idade);
        this.salario = salario;
        this.cargo = cargo;
    }

    public int Categoria() {
        if( super.getIdade() > 20) {
            return 30;
        } else {
            return 10;
        }
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        }
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDados() {
        return super.getDados() + "\nSalario: " + salario + "\nCargo: " + cargo;
    }
}
