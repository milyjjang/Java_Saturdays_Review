package week12_Review;

import static java.lang.Math.PI;

public class Cylinder extends Shape implements Volume {

    private double radius, height;

    public Cylinder(String name, double radius, double height) {
        super(name);
        setRadius(radius);
        setHeight(height);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    protected double calc_area() {
        return ((2 * PI * radius * height) + (2 * PI * (radius * radius)));
    }

    @Override
    protected double calc_perimeter() {
        return 2 * (2 * radius + height);
    }

    @Override
    public double calc_volume() {
        return PI * (radius * radius) * height;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                "radius=" + radius +
                ", height=" + height +
                '}';
    }
}
