
package myabstract;

import myconcrete.*;
import java.util.Scanner;


public class EmployeeDemo {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter employee name: ");        
        String name = keyboard.nextLine();
                
        System.out.print("Enter employee number (5 numeric digits): ");        
        int number = keyboard.nextInt();
                
        keyboard.nextLine();
        System.out.print("Enter employee date of hire (mm-dd-ccyy): ");        
        String date = keyboard.nextLine();
        //employee.setDateOfHire(date);
        
        System.out.print("Enter employee gender- (M)ale or (F)emale): ");        
        String inGender = keyboard.nextLine();
        String gender = inGender.toUpperCase();
                
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
            if (type.charAt(0) == 'S')
            {
               System.out.println(se); 
            }
            if (type.charAt(0) == 'B')
            {
                SalaryPlusBonusEmployee sb = new SalaryPlusBonusEmployee();
                
                sb.setEmployeeName(name);
                sb.setEmployeeNumber(number);
                sb.setDateOfHire(date);
                sb.setGender(gender.charAt(0));
                sb.setSalary(salary);
            
                System.out.print("Enter salary bonus percent (1.0 to 20.0): ");
                double bonusPercent = keyboard.nextDouble();
                sb.setBonusPercent(bonusPercent);
                System.out.println(sb);
            }
        }                 
        else if (type.charAt(0) == 'H')
        {
            HourlyEmployee he = new HourlyEmployee();
            
            he.setEmployeeName(name);
            he.setEmployeeNumber(number);
            he.setDateOfHire(date);
            he.setGender(gender.charAt(0));
            
            System.out.print("Enter rate of pay per hour: ");
            double ratePerHour = keyboard.nextDouble();
            he.setRatePerHour(ratePerHour);
            
            System.out.print("Enter hours worked: ");
            double hoursWorked = keyboard.nextDouble();
            he.setHoursWorked(hoursWorked);
            
            System.out.println(he);
        }
    }
  }

