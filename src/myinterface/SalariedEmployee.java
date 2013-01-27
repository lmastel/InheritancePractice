
package myinterface;

import myconcrete.*;


public class SalariedEmployee implements Employee {
    private String employeeName;
    private int employeeNumber;
    private String dateOfHire;
    private char gender;
    
    private double salary;
    
    
    public void setSalary( double salary){
        this.salary = salary;
    }
    
    public double getSalary(){
        return salary;
    }

//    @Override
//    public String toString() {
//        return super.toString() +
//                "SalariedEmployee{" + "salary=" + salary + '}';
//    }

    @Override
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    @Override
    public void setDateOfHire(String dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    @Override
    public String getDateOfHire() {
        return dateOfHire;
    }

    @Override
    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + "employeeName=" + employeeName + ", employeeNumber=" + employeeNumber + ", dateOfHire=" + dateOfHire + ", gender=" + gender + ", salary=" + salary + '}';
    }
    
    
}
