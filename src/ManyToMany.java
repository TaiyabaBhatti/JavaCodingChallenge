import java.util.ArrayList;

public class ManyToMany {
    public static void main(String[] args) {

        Courses c1=new Courses("AI Modelng",12311);
        Courses c2=new Courses("AI Detection",154223);
        Student_Many s1=new Student_Many("Tayyaba","tayyabbhatti89@gmail.com",c1);
        Student_Many s2=new Student_Many("Hnai","Hani89@gmail.com",c1);

        s1.addCourses(c1);
        s1.addCourses(c2);
        c1.addStudent_enrolled(s1);
        c1.addStudent_enrolled(s2);
      ArrayList<Courses> list=s1.getCourses();
        for (Courses element:list) {
            System.out.println(element.getCourse_Name()+" "+element.getEnrollment_No());
        }
        ArrayList<Student_Many> list2=c1.getStudent_enrolled();
        for (Student_Many element2:list2) {
            System.out.println(element2.getStudent_name()+" "+element2.getStudent_email());
        }



    }
}



class Student_Many{

    private String student_name;
    private String student_email;
    private ArrayList<Courses> courses;
    Student_Many(String student_name,String student_email,Courses courses){
        this.student_name=student_name;
        this.student_email=student_email;
        this.courses=new ArrayList<>();
    }

    public ArrayList<Courses> getCourses() {
        return courses;
    }

    public String getStudent_email() {
        return student_email;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_email(String student_email) {
        this.student_email = student_email;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public void addCourses(Courses courses) {
        this.courses.add(courses);
    }
}
class Courses{

    private String course_Name;
    private int enrollment_No;
    private ArrayList<Student_Many> student_enrolled;
    Courses(String course_Name,int enrollment_No){
        this.course_Name=course_Name;
        this.enrollment_No=enrollment_No;
        this.student_enrolled=new ArrayList<>();
    }

    public String getCourse_Name() {
        return course_Name;
    }

    public void setCourse_Name(String course_Name) {
        this.course_Name = course_Name;
    }

    public int getEnrollment_No() {
        return enrollment_No;
    }

    public void setEnrollment_No(int enrollment_No) {
        this.enrollment_No = enrollment_No;
    }

    public ArrayList<Student_Many> getStudent_enrolled() {
        return student_enrolled;
    }

    public void addStudent_enrolled(Student_Many student_enrolled) {
        this.student_enrolled.add(student_enrolled);
    }
}
