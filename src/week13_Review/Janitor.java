package week13_Review;

public class Janitor extends Employee{

    public Janitor(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is cleaning");
    }
}
