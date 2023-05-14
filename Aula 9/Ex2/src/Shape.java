import java.util.ArrayList;
import java.util.Scanner;

public class Shape {
    private ArrayList<Integer> listaDeDados = new ArrayList<Integer>();

    Scanner sc = new Scanner(System.in);

    public Shape(ArrayList<Integer> listaDeDados) {
        this.listaDeDados = listaDeDados;
    }

    public Shape(String [] medidas) {
        for (String medida : medidas) {
            System.out.print("Digite " + medida + ": ");
            listaDeDados.add(sc.nextInt());
        }
    }

    public ArrayList<Integer> getListaDeDados() {
        return this.listaDeDados;
    }

    public void setListaDeDados(ArrayList<Integer> listaDeDados) {
        this.listaDeDados = listaDeDados;
    }


}
