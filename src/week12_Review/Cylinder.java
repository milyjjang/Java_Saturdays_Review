package week12_Review;

public class Cylinder extends Shape implements Volume {

    private double radius, height;
    private static double pi;

    static {
        pi = 3.14;
    }

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
        return ((2 * pi * radius * height) + (2 * pi * (radius * radius)));
    }

    @Override
    protected double calc_perimeter() {
        return 2 * (2 * radius + height);
    }

    @Override
    public double calc_volume() {
        return pi * (radius * radius) * height;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                "radius=" + radius +
                ", height=" + height +
                '}';
    }
}
