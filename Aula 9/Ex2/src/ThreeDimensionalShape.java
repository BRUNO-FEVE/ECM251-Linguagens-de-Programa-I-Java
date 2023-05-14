import java.util.ArrayList;

class ThreeDimensionalShape extends Shape{
    public ThreeDimensionalShape(ArrayList<Integer> listaDeDados) {
        super(listaDeDados);
    }
    
    public ThreeDimensionalShape(String[] medidas) {
        super(medidas);
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }
}