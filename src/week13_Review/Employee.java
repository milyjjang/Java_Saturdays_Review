package week13_Review;

public abstract class Employee {

    private String name;
    private int age;
    private char gender;
    private final String id;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, String id, String jobTitle, double salary) {
        setName(name);
        setAge(age);
        setGender(gender);
        this.id = id;
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age <= 0) {
            throw new RuntimeException("Invalid age - age cannot be negative or zero");
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        if (salary <= 0) {
            throw new RuntimeException("Invalid salary - salary cannot be negative or zero");
        }
        this.salary = salary;
    }

    public abstract void work();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}

/*
Create the following classes:

        Tester:
            Attributes:
                name, age, gender, id, jobTitle, salary

                Restrictions:
                    age can not be 0 or negative
                    salary can not be zero or negative

            Actions:
                work(), toString(), workFromHome()

        Developer:
            Attributes:
                name, age, gender, id, jobTitle, salary

                Restrictions:
                    age can not be 0 or negative
                    salary can not be zero or negative

            Actions:
                work(), toString(), workFromHome()

        Teacher:
            Attributes:
                name, age, gender, id, jobTitle, salary

                Restrictions:
                    age can not be 0 or negative
                    salary can not be zero or negative

            Actions:
                work(), toString(), workFromHome()

        Driver:
            Attributes:
                name, age, gender, id, jobTitle, salary, typeOfDL

                Restrictions:
                    age can not be 0 or negative
                    salary can not be zero or negative
                    typeOfDL can ONLY be 'A' or 'B' or 'C'
            Actions:
                work(), toString()

        Janitor:
            Attributes:
                name, age, gender, id, jobTitle, salary

                Restrictions:
                    age can not be 0 or negative
                    salary can not be zero or negative
                    typeOfDL can ONLY be 'A' or 'B' or 'C'

            Actions:
                work(), toString()
    Create a class named TestEmployeeObjects

            Create a variable named employee:
                    Assign the Tester Object
                    Call all the methods of tester object

                    Assign the Developer Object
                    Call all the methods of developer object

                    Assign the Teacher Object
                    Call all the methods of teacher object

                    Assign the Driver Object
                    Call all the methods of driver object

                    Assign the Janitor Object
                    Call all the methods of janitor object
 */