/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myconcrete;

/**
 *
 * @author LPM
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee {
    private double salary;
    private double bonus;
    private double bonusPercent;
    
    public SalaryPlusBonusEmployee (double salary){
        this.salary = salary;
    }
    
    public void setBonusPercent(double bonusPercent){
        this.bonusPercent = bonusPercent;
    }
    
    public double getBonus() {
        return salary * bonusPercent;
    }
}
