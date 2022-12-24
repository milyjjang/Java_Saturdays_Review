package week13_Review;

public class Tester extends Employee implements WorkFromHome {

    public Tester(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is testing");
    }

    @Override
    public void WFH() {
        System.out.println(getJobTitle() + " " + getName() + " is WFH");
    }

    public void smokeTesting() {
        System.out.println(getJobTitle() + " " + getName() + " is smoke testing");
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Tester)){
            throw new RuntimeException("Invalid object");
        }

        if (obj instanceof Tester) {
            if (((Tester) obj).getSalary() == getSalary()) {
                return true;
            }
        }
        return false;
    }
}
