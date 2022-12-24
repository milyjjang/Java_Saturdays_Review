package week13_Review;

public class Driver extends Employee {

    private char typeofDL;

    public Driver(String name, int age, char gender, String id, String jobTitle, double salary, char typeofDL) {
        super(name, age, gender, id, "Driver", salary);
        setTypeofDL(typeofDL);
    }

    public char getTypeofDL() {
        return typeofDL;
    }

    public void setTypeofDL(char typeofDL) {

        if (!(typeofDL == 'A' || typeofDL == 'B' || typeofDL == 'C')){
            throw new RuntimeException("Invalid type of Driver's Licence");
        }
        this.typeofDL = typeofDL;
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is driving");
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", typeofDL='" + typeofDL + '\'' +
                '}';
    }
}
