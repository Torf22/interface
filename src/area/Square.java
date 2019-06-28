package area;

public class Square implements Area {

    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public double area() {
        return a * a;
    }
}
