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
    
    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }
    
     public void setEmployeeNumber(int employeeNumber){
        this.employeeNumber = employeeNumber;
    }
     
      public void setDateOfHire(String dateOfHire){
        this.dateOfHire = dateOfHire;
    }
      
       public void setGender(char gender){
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeName=" + employeeName + ", employeeNumber=" + employeeNumber + ", dateOfHire=" + dateOfHire + ", gender=" + gender + '}';
    }
    
    
    
}
