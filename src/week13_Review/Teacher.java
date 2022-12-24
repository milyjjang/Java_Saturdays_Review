package week13_Review;

public class Teacher extends Employee implements WorkFromHome{

    public Teacher(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is teaching");
    }

    @Override
    public void WFH() {
        System.out.println(getJobTitle() + " " + getName() + " is WFH");
    }
}
