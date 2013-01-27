
package myabstract;

import myconcrete.*;


public class HourlyEmployee extends Employee {
    private double ratePerHour;
    private double hoursWorked;
    private double vacationHours; 
    
       
    public void setRatePerHour(double ratePerHour){
        this.ratePerHour = ratePerHour;
    }
    
    public double getRatePerHour(){
        return ratePerHour;
    }
    
    public void setHoursWorked(double hoursWorked){
        this.hoursWorked = hoursWorked;
    }
    
    public double getHoursWorked(){
        return hoursWorked;
    }

    
    @Override
    public double getVacationHours() {    
        vacationHours = 80;
        return vacationHours;        
    
    }

    @Override
    public String toString() {
        return super.toString() + 
                "HourlyEmployee{" + "ratePerHour=" + ratePerHour + ", "
                + "hoursWorked=" + hoursWorked + ", "
                + "vacationHours=" + getVacationHours() + '}';
    }
    
    
}
