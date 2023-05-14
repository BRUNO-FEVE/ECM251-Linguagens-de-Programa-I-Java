import java.util.ArrayList;

public class Circle extends TwoDimensionalShape {
    private static String[] medidas = { "o raio" };

    public Circle(ArrayList<Integer> listaDeDados) {
        super(listaDeDados);
    }

    public Circle() {
        super(medidas);
    }

    public double getArea() {
        return Math.PI * Math.pow(getListaDeDados().get(0), 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * getListaDeDados().get(0);
    }
}
