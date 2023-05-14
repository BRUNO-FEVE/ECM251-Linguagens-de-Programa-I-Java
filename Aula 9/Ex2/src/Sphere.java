import java.util.ArrayList;

class Sphere extends ThreeDimensionalShape{
    private static String[] medidas = { "o raio" };

    public Sphere(ArrayList<Integer> listaDeDados) {
        super(listaDeDados);
    }

    public Sphere() {
        super(medidas);
    }

    public double getExternalFacesArea() {
        return 4 * Math.PI * Math.pow(getListaDeDados().get(0), 2);
    }

    public double getVolume() {
        return 4 * Math.PI * Math.pow(getListaDeDados().get(0), 3) / 3;
    }
}