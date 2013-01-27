
package myinterface;

import myconcrete.*;


public class HourlyEmployee implements Employee {
    private String employeeName;
    private int employeeNumber;
    private String dateOfHire;
    private char gender;
    
    private double ratePerHour;
    private double hoursWorked;
    
       
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

//    @Override
//    public String toString() {
//        return super.toString() +
//                "HourlyEmployee{" + "ratePerHour=" + ratePerHour + ", hoursWorked=" + hoursWorked + '}';
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
        return "HourlyEmployee{" + "employeeName=" + employeeName + ", employeeNumber=" + employeeNumber + ", dateOfHire=" + dateOfHire + ", gender=" + gender + ", ratePerHour=" + ratePerHour + ", hoursWorked=" + hoursWorked + '}';
    }
    
    
}
