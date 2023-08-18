import java.time.LocalDate;
import java.time.Period;

public class Exercise9 {
    public static void main(String[] args) {
        //Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes
        // , and a method to calculate years of service.
    Emp_loyee e1=new Emp_loyee("Shafiqa Iqbal",200000, LocalDate.parse("2022-03-14"));
e1.print_Data();
        System.out.println("You are served us for "+e1.serveYears() +" Years");
        System.out.println("You served us for "+e1.serveMonths()+" Months");
        System.out.println("You served us for "+e1.serveDays()+" Days");
    }

}


class Emp_loyee{

    private int emp_Salary;
    private String emp_Name;
    private LocalDate hire_Date;

   Emp_loyee(String emp_Name,int emp_Salary,LocalDate hire_Date){
       this.emp_Name=emp_Name;
       this.emp_Salary=emp_Salary;
       this.hire_Date=hire_Date;
   }

    public void setEmp_Salary(int emp_Salary) {
        this.emp_Salary = emp_Salary;
    }

    public String getEmp_Name() {
        return emp_Name;
    }

    public int getEmp_Salary() {
        return emp_Salary;
    }

    public void setEmp_Name(String emp_Name) {
        this.emp_Name = emp_Name;
    }

    public void setHire_Date(LocalDate hire_Date) {
        this.hire_Date = hire_Date;
    }

    public LocalDate getHire_Date() {
        return hire_Date;
    }

    public  int serveYears(){
      Period period=Period.between(hire_Date,LocalDate.now());
      return period.getYears();
   }
   public int serveMonths(){
       Period period=Period.between(hire_Date,LocalDate.now());
       return period.getYears() * 12 + period.getMonths();
   }
   public int serveDays(){
       Period period=Period.between(hire_Date,LocalDate.now());
       return period.getYears() * 12*365 + period.getDays();
   }

    public void print_Data(){
        System.out.println(emp_Name);
        System.out.println(emp_Salary);
        System.out.println(hire_Date);
    }
}
