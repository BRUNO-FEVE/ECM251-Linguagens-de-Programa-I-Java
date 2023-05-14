import java.util.ArrayList;

public class BlocoDeNotas {
    private ArrayList<String> blocoDeNotas = new ArrayList<String>();

    public void insiraUmaNota(String nota) {
        blocoDeNotas.add(nota);
    }

    public void removaUmaNotaPorIndex(int index) {
        blocoDeNotas.remove(index);
    }

    public void removaUmaNotaPorString(String notaAntiga) {
        boolean mesagem = true;
        for (int i = 0; i < blocoDeNotas.size(); i++) {
            if (blocoDeNotas.contains(notaAntiga)) {
                blocoDeNotas.remove(i);
                mesagem = false;
            } 
        }
        if (mesagem) {
            System.out.println("A nota que você quer remover não existe!!");
        } 
    }

    public void altereUmaNotaPorIndex(int index, String notaNova) {
        blocoDeNotas.set(index, notaNova);
    }

    public void altereUmaNotaPorString(String notaAntiga, String notaNova) {
        boolean mesagem = true;
        if (blocoDeNotas.contains(notaAntiga)) {
            blocoDeNotas.set(blocoDeNotas.indexOf(notaAntiga), notaNova);
            mesagem = false;
        } 
        if (mesagem) {
            System.out.println("A nota que você quer alterar não existe!!");
        } 
    }

    public ArrayList<String> getBlocoDeNotas() {
        return blocoDeNotas;
    }

    public String getNotaPorIndex(int index) {
        return blocoDeNotas.get(index);
    }
}
