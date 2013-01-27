/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myconcrete;

/**
 *
 * @author LPM
 */
public class HourlyEmployee extends Employee {
    private double ratePerHour;
    private double hoursWorked;
    
       
    public void setRatePerHour(double ratePerHour){
        this.ratePerHour = ratePerHour;
    }
    
    public void setHoursWorked(double hoursWorked){
        this.hoursWorked = hoursWorked;
    }
}
