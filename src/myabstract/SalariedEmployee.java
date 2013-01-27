
package myabstract;

import myconcrete.*;


public class SalariedEmployee extends Employee {
    private double salary;
    private double vacationHours;
    
    
    public void setSalary( double salary){
        this.salary = salary;
    }
    
    public double getSalary(){
        return salary;
    }

    

    @Override
    public double getVacationHours() {
        vacationHours = 120.0;
        return vacationHours;
    }

    @Override
    public String toString() {
        return super.toString() +
                "SalariedEmployee{" + "salary=" + salary + ","
                + " vacationHours=" + getVacationHours() + '}';
    }
    
    
}
