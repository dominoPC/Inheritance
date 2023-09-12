public class SalaryWorker extends Worker{
    private double annualSalary;

    public SalaryWorker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary){
        super(ID, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double calculateWeeklyPay(double hoursWorked){
        return this.annualSalary/52;
    }

    public String displayWeeklyPay(double hoursWorked){
        return "Weekly pay is a fraction of yearly salary. Total: $" + calculateWeeklyPay(hoursWorked);
    }

    @Override
    public String toString() {
        return super.toString() + "SalaryWorker{" +
                "annualSalary=" + annualSalary +
                '}';
    }
}
