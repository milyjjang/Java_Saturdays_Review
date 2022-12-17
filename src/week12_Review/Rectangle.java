package week12_Review;

public class Rectangle extends Shape {

    private double length, width;

    public Rectangle(String name, double length, double width) {
        super(name);
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    protected double calc_area() {
        return length * width;
    }

    @Override
    protected double calc_perimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}
