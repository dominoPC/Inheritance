public class Worker extends Person{
    private double hourlyPayRate;

    public Worker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate){
        super(ID, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked){
        if(hoursWorked <= 40.0){
            return hoursWorked * this.hourlyPayRate;
        }
        else {
            return (40.0 * this.hourlyPayRate) + (((hoursWorked - 40) * 1.5 * this.hourlyPayRate));
        }
    }

    public String displayWeeklyPay(double hoursWorked){
        if(hoursWorked <= 40){
            return "Regular pay hours: " + hoursWorked + " Total: $" + calculateWeeklyPay(hoursWorked) +
                    " Overtime hours: 0.0 Total: $0.0 Combined pay: $" + calculateWeeklyPay(hoursWorked);
        }
        else{
            return "Regular pay hours: 40.0 Total: $" + calculateWeeklyPay(40) + " Overtime hours: " +
                    (hoursWorked - 40) + " Total: $" + ((hoursWorked - 40)*1.5*this.hourlyPayRate) + " Combined pay: $"
                    + calculateWeeklyPay(hoursWorked);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Worker{" +
                "hourlyPayRate=" + hourlyPayRate +
                '}';
    }
}
