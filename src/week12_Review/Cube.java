package week12_Review;

public class Cube extends Shape implements Volume{

    private double side;

    public Cube(String name, double side) {
        super(name);
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    protected double calc_area() {
        return 6 * (side * side);
    }

    @Override
    protected double calc_perimeter() {
        return 12 * side;
    }

    @Override
    public double calc_volume() {
        return side * side * side;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", volume=" + calc_volume() +
                ", side=" + side +
                '}';
    }
}
