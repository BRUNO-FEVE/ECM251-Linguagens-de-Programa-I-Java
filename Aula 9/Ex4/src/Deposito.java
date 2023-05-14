import java.util.ArrayList;

public class Deposito {
    private ArrayList<Caixa> caixas = new ArrayList<Caixa>();

    public void addCaixas (Caixa caixa) {
        caixas.add(caixa);
    }

    public void removeCaixa (Caixa caixa) {
        caixas.remove(caixa);
    }

    public int getIndex (String dono) {
        for (int i=0; i < caixas.size(); i++) {
            if (caixas.get(i).getDono().equals(dono)) {
                return i;
            } 
        }
        return -1;
    }

    public void changeInfo (String corredor, int posicao, double peso, String dono) {
        for (int i=0; i < caixas.size(); i++) {
            if (caixas.get(i).getDono() == dono) {
                caixas.get(i).setCorredor(corredor);
                caixas.get(i).setPeso(peso);
                caixas.get(i).setPosicao(posicao);
            } 
        }
    }

    public ArrayList weigthAbove (double peso) {
        ArrayList<String> caixasAbove = new ArrayList<String>();
        for (int i=0; i < caixas.size(); i++) {
            if (caixas.get(i).getPeso() > peso) {
                caixasAbove.add(caixas.get(i).getAll() + "\n\n");
            } 
        }
        return caixasAbove;
    }

    public Caixa getCaixa(String dono) {
        for (Caixa caixa : caixas) {
            if (caixa.getDono().equals(dono)) {
                return caixa;
            }
        }
        return null;
    }
    
    public String getCaixas() {
        String resultado = " ";
        for (Caixa caixa : caixas) {
            resultado +=  " " + caixa.getAll();
        }
        return resultado;
    }
}
