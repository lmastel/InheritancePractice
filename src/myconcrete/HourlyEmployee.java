
package myconcrete;


public class HourlyEmployee extends Employee {
    private double ratePerHour;
    private double hoursWorked;
    
       
    public void setRatePerHour(double ratePerHour){
        this.ratePerHour = ratePerHour;
    }
    
    public void setHoursWorked(double hoursWorked){
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return super.toString() +
                "HourlyEmployee{" + "ratePerHour=" + ratePerHour + ", hoursWorked=" + hoursWorked + '}';
    }
    
    
}
