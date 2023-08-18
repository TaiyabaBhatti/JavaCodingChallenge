import java.util.ArrayList;
import java.util.List;

public class Homework2 {
    public static void main(String[] args) {












    }
}



class DepartmentII{

    private String dname;
    private List<StudentII> studentlist;
    DepartmentII(String dname){
        this.dname=dname;
        this.studentlist=new ArrayList<>();
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }


    public void addStudent(StudentII student){
        this.studentlist.add(student);
    }

    public void removeStudent(StudentII student){
        this.studentlist.remove(student);
    }
    public  List<StudentII> getStudentlist(){
        return this.studentlist;
    }


}
class StudentII{

    private String sname;
    private DepartmentII department;

    StudentII(String sname){
        this.sname=sname;
    }
    public void setDepartment(DepartmentII department){
        this.department=department;
    }


    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

}
class UniversityMUET{

    private String name;
    private  List<StudentII> studentList;
    private List<DepartmentII> departmentList;
    UniversityMUET(String[] sname,String[] dname){

    }
//    public Student getStudent(String skey){
//
//    }
//    public Student getDepartment(String dkey){
//
//    }


}
