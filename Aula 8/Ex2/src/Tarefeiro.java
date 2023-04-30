public class Tarefeiro extends Empregado {
    private String[] valorPagoTarefas;

    public Tarefeiro() {
        this.valorPagoTarefas = new String[0];
    }

    public Tarefeiro(String nome, String sobrenome, int cpf, double salarioMensal, String[] valorPagoTarefas) {
        super(nome, sobrenome, cpf, salarioMensal);
        for (int i = 0; i < valorPagoTarefas.length; i++) {
            salarioMensal += Integer.parseInt(valorPagoTarefas[i]);
        }
        super.setSalarioMensal(salarioMensal);
        this.valorPagoTarefas = valorPagoTarefas;
    }

    public String[] getValorPagoTarefas() {
        return this.valorPagoTarefas;
    }

    public String dados() {
        String dados = super.dados() + "\nValor pago por tarefa: ";
        for (int i = 0; i < this.valorPagoTarefas.length; i++) {
            dados += "\n" + this.valorPagoTarefas[i];
        }
        return dados;
    }

    public void setValorPagoTarefas(String[] valorPagoTarefas) {
        this.valorPagoTarefas = valorPagoTarefas;
    }
}
