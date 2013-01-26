/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myconcrete;

/**
 *
 * @author LPM
 */
public class Employee {
    private String employeeName;
    private int employeeNumber;
    private String dateOfHire;
    private char gender;

    @Override
    public String toString() {
        return "Employee{" + "employeeName=" + employeeName + ", employeeNumber=" + employeeNumber + ", dateOfHire=" + dateOfHire + ", gender=" + gender + '}';
    }
    
    
    
}
