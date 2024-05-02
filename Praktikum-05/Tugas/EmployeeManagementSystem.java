public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create objects of FullTimeEmployee and PartTimeEmployee
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(101, "John Doe", 4000.0);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(201, "Jane Smith", 15.0, 30);

        // Print Full-Time Employee details
        fullTimeEmployee.getDetails();

        System.out.println();

        // Print Part-Time Employee details
        partTimeEmployee.getDetails();
    }
}
