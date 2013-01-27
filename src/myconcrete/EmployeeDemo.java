/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myconcrete;

import java.util.Scanner;

/**
 *
 * @author LPM
 */
public class EmployeeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        //Employee employee = new Employee();
        
        System.out.print("Enter employee name: ");        
        String name = keyboard.nextLine();
        //employee.setEmployeeName(name);
        
        System.out.print("Enter employee number (5 numeric digits): ");        
        int number = keyboard.nextInt();
        //employee.setEmployeeNumber(number);
        
        keyboard.nextLine();
        System.out.print("Enter employee date of hire (mm-dd-ccyy): ");        
        String date = keyboard.nextLine();
        //employee.setDateOfHire(date);
        
        System.out.print("Enter employee gender- (M)ale or (F)emale): ");        
        String inGender = keyboard.nextLine();
        String gender = inGender.toUpperCase();
        //employee.setGender(gender.charAt(0));
        
        //System.out.println(employee.toString());
        
        System.out.print("Enter type of employee- (S)alaried, (B)Salaries plus bonus, or (H)ourly: ");
        String inType = keyboard.nextLine();
        String type = inType.toUpperCase();
        
        if (type.charAt(0) == 'S' || type.charAt(0) == 'B')
        {
            SalariedEmployee se = new SalariedEmployee();
            se.setEmployeeName(name);
            se.setEmployeeNumber(number);
            se.setDateOfHire(date);
            se.setGender(gender.charAt(0));
            System.out.print("Enter salary per year: ");        
            double salary = keyboard.nextDouble();
            se.setSalary(salary);
            if (type.charAt(0) == 'B')
            {
                SalaryPlusBonusEmployee sb = new SalaryPlusBonusEmployee(salary);
                System.out.print("Enter salary bonus percent (0.0 to 100.0): ");
                double bonusPercent = keyboard.nextDouble();
                sb.setBonusPercent(bonusPercent);
            }
                 
            System.out.println(se);
        }
        else if (type.charAt(0) == 'H')
        {
            HourlyEmployee he = new HourlyEmployee();
            System.out.print("Enter rate of pay per hour: ");
            double ratePerHour = keyboard.nextDouble();
            he.setRatePerHour(ratePerHour);
            
            System.out.print("Enter hours worked: ");
            double hoursWorked = keyboard.nextDouble();
            he.setHoursWorked(hoursWorked);
        }
    }
    
}
