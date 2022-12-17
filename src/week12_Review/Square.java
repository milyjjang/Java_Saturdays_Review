package week12_Review;

public class Square extends Shape{

    private double side;

    public Square(String name) {
        super(name);
    }

    @Override
    protected double calc_area() {
        return side * side;
    }

    @Override
    protected double calc_perimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                "side=" + side +
                '}';
    }
}
