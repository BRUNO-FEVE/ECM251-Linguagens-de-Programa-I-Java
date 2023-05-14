import java.util.ArrayList;

public class Tetrahedron extends ThreeDimensionalShape {
    private static String[] medidas = { "a aresta" };

    public Tetrahedron(ArrayList<Integer> listaDeDados) {
        super(listaDeDados);
    }

    public Tetrahedron() {
        super(medidas);
    }

    public double getExternalFacesArea() {
        return (Math.sqrt(3)/4)*Math.pow(getListaDeDados().get(0), 2);
    }

    public double getVolume() {
        return (Math.sqrt(2)/12)*Math.pow(getListaDeDados().get(0), 3);
    }
}
