package week12_Review;

public abstract class Shape {

    private final String name;

    public Shape(String name) {
        this.name = getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    protected abstract double calc_area();
    protected abstract double calc_perimeter();

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                "area='" + calc_area() + '\'' +
                "perimeter='" + calc_perimeter() + '\'' +
                '}';
    }
}


/*
Shape Task:
    1. Create a class named Shape:
            Variables:
                name (final)

            Encapsulate all the fields

            Methods:
                calc_area()
                calc_perimeter()
                toString(): include the area & perimeter of the shape

    2. Create an interface named Volume:

            Variables:
                HAS_VOLUME

            Methods:
                calc_volume()


    3. Create the following sub-classes of Shape and add any additional variables/methods that are needed:

            3.1 Square
            3.2 Rectangle
            3.3 Circle
            3.4 Cylinder
            3.5 Cube

    4. Implement the Volume interface to Cylinder and Cube classes
 */