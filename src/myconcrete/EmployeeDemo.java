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
        
        System.out.print("Enter employee number (5 numeric digits): ");        
        int number = keyboard.nextInt();
        
        keyboard.nextLine();
        System.out.print("Enter employee date of hire (mm-dd-ccyy): ");        
        String date = keyboard.nextLine();
        
        System.out.print("Enter employee gender (M)ale or (F)emale): ");        
        String gender = keyboard.nextLine();
    }
}
