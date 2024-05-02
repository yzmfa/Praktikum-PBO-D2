public class PartTimeEmployee extends Employee implements WorkSchedule {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    public double getHourlyRate(){
        return hourlyRate;
    }
    
    public void setHourlyRate(double hourlyRate){
        this.hourlyRate = hourlyRate;
    }
    
    public double getHoursWorked(){
        return hoursWorked;
    }
    
    public void setHoursWorked(int hoursWorked){
        this.hoursWorked =  hoursWorked;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void getDetails(){
        System.out.println("Part-Time Employee Details:");
        super.getDetails();
        System.out.println("Hourly Rate: $" + getHourlyRate());
        System.out.println("Hours Worked: " + getHoursWorked());
        System.out.println("Salary: $" + calculateSalary());
        displaySchedule();
    }
    
    public void displaySchedule() {
        System.out.println("Part-Time Employee Schedule: Flexible hours");
    }
}
