
package myconcrete;


public class Employee {
    private String employeeName;
    private int employeeNumber;
    private String dateOfHire;
    private char gender;
    
    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }
    
    public String getEmployeeName (){
        return employeeName;
    }     
    
     public void setEmployeeNumber(int employeeNumber){
        this.employeeNumber = employeeNumber;
    }
     
     public int getEmployeeNumber(){
         return employeeNumber;
     }
     
      public void setDateOfHire(String dateOfHire){
        this.dateOfHire = dateOfHire;
    }
      
      public String getDateOfHire(){
          return dateOfHire;
      }
      
       public void setGender(char gender){
        this.gender = gender;
    }
       
       public char getGender(){
           return gender;
       }

    @Override
    public String toString() {
        return "Employee{" + "employeeName=" + employeeName + ", employeeNumber=" + employeeNumber + ", dateOfHire=" + dateOfHire + ", gender=" + gender + '}';
    }
    
    
    
}
