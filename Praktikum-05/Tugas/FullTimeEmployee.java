public class FullTimeEmployee extends Employee implements WorkSchedule {
    private double monthlySalary;

    public FullTimeEmployee(int id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary(){
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary){
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary() {
        return monthlySalary;
    }

    public void displaySchedule() {
        System.out.println("Full-Time Employee Schedule: Monday to Friday, 9:00 AM - 5:00 PM");
    }

    @Override
    public void getDetails(){
        System.out.println("Full-Time Employee Details:");
        super.getDetails();
        System.out.println("Monthly Salary: $" + calculateSalary());
        System.out.println("Salary: $" + calculateSalary());
        displaySchedule();
    }
}
