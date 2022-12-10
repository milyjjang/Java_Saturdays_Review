package week11_Review;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, String employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    public void unitTesting(){
        System.out.println(getName() + " is unit testing.");
    }
}

/*
Developer:
      additional methods:
            unitTesting()
 */