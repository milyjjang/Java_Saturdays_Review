package week12_Review;

public class Circle extends Shape{

    private double radius;
    private static double pi;

    static {
        pi = 3.14;
    }

    public Circle(String name) {
        super(name);
    }

    @Override
    protected double calc_area() {
        return pi * (radius * radius);
    }

    @Override
    protected double calc_perimeter() {
        return 2 * pi * radius;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                "radius=" + radius +
                '}';
    }
}
