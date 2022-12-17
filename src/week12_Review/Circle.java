package week12_Review;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle extends Shape {

    private double radius;

    public Circle(String name, double radius) {
        super(name);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    protected double calc_area() {
        return PI * (pow(radius, 2));
    }

    @Override
    protected double calc_perimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", radius=" + radius +
                '}';
    }
}
