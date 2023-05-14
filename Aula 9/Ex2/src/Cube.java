import java.util.ArrayList;

public class Cube extends ThreeDimensionalShape {
    private static String[] medidas = { "a aresta" };

    public Cube(ArrayList<Integer> listaDeDados) {
        super(listaDeDados);
    }

    public Cube() {
        super(medidas);
    }

    public double getExternalFacesArea() {
        return 6 * Math.pow(super.getListaDeDados().get(0), 2);
    }

    public double getVolume() {
        return Math.pow(getListaDeDados().get(0), 3);
    }
}
