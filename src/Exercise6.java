public class Exercise6 {
    public static void main(String[] args) {
        // Write a Java program to create a class called "Employee"
        // with a name, job title, and salary attributes, and methods to calculate and update salary.

        Employee e1=new Employee("Rehmat","Catering",10000);
        System.out.println(e1.getEmp_Salary());
        e1.setEmp_Salary(15000);
        System.out.println(e1.getEmp_Salary());






    }
}

class Employee{
    private String emp_Name;
    private String emp_Job_Title;
    private long emp_Salary;

    Employee(String emp_Name,String emp_Job_Title,int emp_Salary){
        this.emp_Name=emp_Name;
        this.emp_Job_Title=emp_Job_Title;
        this.emp_Salary=emp_Salary;
    }

    public String getEmp_Name() {
        return emp_Name;
    }

    public String getEmp_Job_Title() {
        return emp_Job_Title;
    }

    public long getEmp_Salary() {
        return emp_Salary;
    }


    public void setEmp_Salary(long emp_Salary) {
        this.emp_Salary = emp_Salary;
    }
}
