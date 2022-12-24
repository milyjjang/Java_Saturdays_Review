package week13_Review;

public class Developer extends Employee implements WorkFromHome{

    public Developer(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is developing");
    }

    @Override
    public void WFH() {
        System.out.println(getJobTitle() + " " + getName() + " is WFH");
    }

    public void unitTesting(){
        System.out.println(getJobTitle() + " " + getName() + " is unit testing");
    }
}
