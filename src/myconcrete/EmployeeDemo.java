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
        
        Employee employee = new Employee();
        
        System.out.print("Enter employee name: ");        
        String name = keyboard.nextLine();
        employee.setEmployeeName(name);
        
        System.out.print("Enter employee number (5 numeric digits): ");        
        int number = keyboard.nextInt();
        employee.setEmployeeNumber(number);
        
        keyboard.nextLine();
        System.out.print("Enter employee date of hire (mm-dd-ccyy): ");        
        String date = keyboard.nextLine();
        employee.setDateOfHire(date);
        
        System.out.print("Enter employee gender- (M)ale or (F)emale): ");        
        String inGender = keyboard.nextLine();
        String gender = inGender.toUpperCase();
        employee.setGender(gender.charAt(0));
        
        System.out.println(employee.toString());
        
        System.out.print("Enter type of employee- (S)alaried, (B)Salaries plus bonus, or (H)ourly: ");
        String inType = keyboard.nextLine();
        String type = inType.toUpperCase();
        
        if (type.charAt(0) == 'S')
        {
            SalariedEmployee se = new SalariedEmployee();
        }
        else if (type.charAt(0) == 'B')
        {
            SalaryPlusBonusEmployee sb = new SalaryPlusBonusEmployee();
        }
        else if (type.charAt(0) == 'H')
        {
            HourlyEmployee he = new HourlyEmployee();
        }
    }
    
}
