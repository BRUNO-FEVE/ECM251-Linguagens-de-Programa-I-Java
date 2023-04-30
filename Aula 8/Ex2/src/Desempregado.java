public class Desempregado extends PessoaFisica {
    private double seguroDesemprego; // valor em reais

    public Desempregado() {
        this.seguroDesemprego = 0.0;
    }

    public Desempregado(String nome, String sobrenome, int cpf, double seguroDesemprego) {
        super(nome, sobrenome, cpf);
        this.seguroDesemprego = seguroDesemprego;
    }

    public double getSeguroDesemprego() {
        return this.seguroDesemprego;
    }

    public void setSeguroDesemprego(double seguroDesemprego) {
        this.seguroDesemprego = seguroDesemprego;
    }

    public String dados() {
        return super.dados() + "\nSeguro desemprego: " + this.seguroDesemprego;
    }
}
