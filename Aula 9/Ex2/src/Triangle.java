import java.util.ArrayList;

public class Triangle extends TwoDimensionalShape {
    private static String[] medidas = { "a base", "a altura", "lado esquerdo", "lado direito"};

    public Triangle(ArrayList<Integer> listaDeDados) {
        super(listaDeDados);
    }

    public Triangle() {
        super(medidas);
    }

    public double getArea() {
        return (getListaDeDados().get(0) * getListaDeDados().get(1)) / 2;
    }

    public double getPerimeter() {
        return getListaDeDados().get(2) + getListaDeDados().get(3) + getListaDeDados().get(0);
    }
}
