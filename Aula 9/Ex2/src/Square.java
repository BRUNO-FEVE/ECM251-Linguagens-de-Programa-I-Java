import java.util.ArrayList;

public class Square extends TwoDimensionalShape {
    private static String[] medidas = { "a base", "a altura" };

    public Square(ArrayList<Integer> listaDeDados) {
        super(listaDeDados);
    }

    public Square() {
        super(medidas);
    }

    public double getArea() {
        return getListaDeDados().get(0) * getListaDeDados().get(1);
    }

    public double getPerimeter() {
        return 2 * (getListaDeDados().get(0) + getListaDeDados().get(1));
    }
}
