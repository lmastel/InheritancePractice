/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myconcrete;

/**
 *
 * @author LPM
 */
public class SalariedEmployee extends Employee {
    private double salary;
    
    
    public void setSalary( double salary){
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "SalariedEmployee{" + "salary=" + salary + '}';
    }
    
    
}
