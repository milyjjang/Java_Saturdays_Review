package week11_Review;

public class Employee extends Person{

    public String employeeId, jobTitle;
    public double salary;

    public Employee(String name, int age, char gender, String employeeId, String jobTitle, double salary) {
        super(name, age, gender);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {

        if (employeeId.charAt(0) == '0'){
            System.err.println("Invalid employee ID. Employee ID cannot start with '0'.");
            System.exit(1);
        }
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {

        if (jobTitle.isEmpty() || jobTitle == null){
            System.err.println("Invalid job title. Job title cannot be empty or null.");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        if (salary <= 0){
            System.err.println("Invalid salary. Salary cannot be zero or negative.");
            System.exit(1);
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName() + " is working.");
    }

    public String toString() {
        return super.toString().replace("}", "") +
                "employeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}

/*
Create a sub-class of Person named Employee:

            Extra variables:
                employeeId (String), jobTitle, salary

            Encapsulate all the fields
                restrictions for the fields:
                    job title can not be empty
                    job title can not be null
                    salary can not be negative
                    salary can not be zero
                    employee id can not start with the character '0'

            Add a constructor to set all the fields
                (Make sure all the restrictions are applied)

            Methods:
                work()
                toString()
 */