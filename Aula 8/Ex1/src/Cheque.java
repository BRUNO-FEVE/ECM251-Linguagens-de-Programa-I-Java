public class Cheque extends Pagamento {
    private String numeroDoCheque;

    public Cheque (String nomeDoPagador, String cpf, double valorASerPago, String numeroDoCheque) {
        super(nomeDoPagador, cpf, valorASerPago);
        this.numeroDoCheque = numeroDoCheque;
    }

    public String getNumeroDoCheque() {
        return this.numeroDoCheque;
    }

    public String getAll() {
        return super.getNomeDoPagador() + "\n" + super.getCpf() + "\n" + super.getValorASerPago() + "\n" + this.numeroDoCheque;
    }

    public void setNumeroDoCheque(String numeroDoCheque) {
        this.numeroDoCheque = numeroDoCheque;
    }
}