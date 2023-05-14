import java.util.ArrayList;

public class TwoDimensionalShape extends Shape {
    public TwoDimensionalShape(ArrayList<Integer> listaDeDados) {
        super(listaDeDados);
    }
    
    public TwoDimensionalShape(String[] medidas) {
        super(medidas);
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }
}
