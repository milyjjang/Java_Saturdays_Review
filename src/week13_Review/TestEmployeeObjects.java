package week13_Review;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee employee;

        employee = new Tester("Josh", 35, 'M', "A01", "Manual Tester", 100000);

        System.out.println(employee);
        employee.work();
        // employee.smokeTesting();   // reference type decides what is accessible
        // Tester tester = (Tester)employee;   // can assign to a variable to reuse
        ((Tester)employee).smokeTesting();   // downcasting

        System.out.println("--------------------------");

        employee = new Developer("Bella", 30, 'F', "A02", "Java Developer", 100000);

        System.out.println(employee);
        employee.work();
        ((Developer)employee).unitTesting();

        System.out.println("--------------------------");

        employee = new Teacher("Jimmy", 36, 'M', "A03", 100000);

        System.out.println(employee);
        employee.work();
        ((Teacher)employee).WFH();

        System.out.println("--------------------------");

        employee = new Driver("Aaron", 40, 'M', "B01", 110000, 'A');

        System.out.println(employee);
        employee.work();

        System.out.println("--------------------------");

        employee = new Janitor("Daniel", 38, 'M', "C01", 90000);

        System.out.println(employee);
        employee.work();

        System.out.println("--------------------------");

        Employee[] employees = {
                new Tester("Josh", 35, 'M', "A01", "Manual Tester", 100000),
                new Developer("Bella", 30, 'F', "A02", "Java Developer", 100000),
                new Teacher("Jimmy", 36, 'M', "A03", 100000),
                new Driver("Aaron", 40, 'M', "B01", 110000, 'A'),
                new Janitor("Daniel", 38, 'M', "C01", 90000)
        };

        int countTesters = 0;

        for (Employee each : employees) {
            each.work();

            if (each instanceof Tester){
                countTesters++;
            }
        }
    }
}
