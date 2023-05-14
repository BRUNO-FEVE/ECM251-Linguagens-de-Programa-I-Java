public class Caixa {
    private String corredor;
    private int posicao;
    private double peso;
    private String dono;

    public Caixa(String corredor, int posicao, double peso, String dono) {
        this.corredor = corredor;
        this.posicao = posicao;
        this.peso = peso;
        this.dono = dono;
    }

    public String getCorredor() {
        return corredor;
    }

    public int getPosicao() {
        return posicao;
    }

   public double getPeso() {
       return peso;
   }

   public String getDono() {
       return dono;
   }

   public String getAll() {
        return "CORREDOR: " + corredor + "\n" + "POSIÇÃO: " + posicao + "\n" + "PESO: " + peso + "\n" + "DONO: " + dono;
   }

   public void setCorredor(String corredor) {
       this.corredor = corredor;
   }

   public void setPosicao(int posicao) {
       this.posicao = posicao;
   }

   public void setPeso(double peso) {
       this.peso = peso;
   }

   public void setDono(String dono) {
       this.dono = dono;
   }
}
