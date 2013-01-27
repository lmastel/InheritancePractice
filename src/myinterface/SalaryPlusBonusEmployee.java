
package myinterface;

import myconcrete.*;


public class SalaryPlusBonusEmployee extends SalariedEmployee {
    private double bonus;
    private double bonusPercent;
    
    
    public void setBonusPercent(double bonusPercent){
        this.bonusPercent = bonusPercent;
    }
    
    public double getBonus() {
        bonus = super.getSalary() * (bonusPercent / 100);
        return bonus;
    }

    @Override
    public String toString() {
        return super.toString() +
                "SalaryPlusBonusEmployee{" + "bonus=" + getBonus() + ", bonusPercent=" + bonusPercent + '}';
    }
    
    
}
