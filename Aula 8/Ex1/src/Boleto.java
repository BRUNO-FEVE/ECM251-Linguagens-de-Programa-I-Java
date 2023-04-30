
public class Boleto extends Pagamento {
    private String numeroDoBoleto;
    private int diaVencimento;
    private int mesVencimento;
    private int anoVencimento;

    public Boleto (String nomeDoPagador, String cpf, double valorASerPago, String numeroDoBoleto, int diaVencimento, int mesVencimento, int anoVencimento) {
        super(nomeDoPagador, cpf, valorASerPago);
        this.numeroDoBoleto = numeroDoBoleto;
        this.diaVencimento = diaVencimento;
        this.mesVencimento = mesVencimento;
        this.anoVencimento = anoVencimento;
    }

    public String getNumeroDoBoleto() {
        return this.numeroDoBoleto;
    }

    public int getDiaVencimento() {
        return this.diaVencimento;
    }

    public int getMesVencimento() {
        return this.mesVencimento;
    }

    public int getAnoVencimento() {
        return this.anoVencimento;
    }

    public String getAll() {
        return super.getNomeDoPagador() + "\n" + super.getCpf() + "\n" + super.getValorASerPago() + "\n" + this.numeroDoBoleto + "\n" + this.diaVencimento + "/" + this.mesVencimento + "/" + this.anoVencimento;
    }

    public void setNumeroDoBoleto(String numeroDoBoleto) {
        this.numeroDoBoleto = numeroDoBoleto;
    }

    public void setDiaVencimento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
    }

    public void setMesVencimento(int mesVencimento) {
        this.mesVencimento = mesVencimento;
    }

    public void setAnoVencimento(int anoVencimento) {
        this.anoVencimento = anoVencimento;
    }

    public String getDataVencimento() {
        return this.diaVencimento + "/" + this.mesVencimento + "/" + this.anoVencimento;
    }

    public void setDataVencimento(int diaVencimento, int mesVencimento, int anoVencimento) {
        this.diaVencimento = diaVencimento;
        this.mesVencimento = mesVencimento;
        this.anoVencimento = anoVencimento;
    }    
}