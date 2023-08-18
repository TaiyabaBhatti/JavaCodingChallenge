import java.util.ArrayList;
import java.util.PrimitiveIterator;

public class Exercise10 {
    public static void main(String[] args) {

        // Write a Java program to create a class called "Student"
        // with a name, grade, and courses attributes, and methods to add and remove courses.
    Student s1=new Student("Mark Zurkerburg" ,11);
     s1.add_courses("web development");
     s1.show_infomation();
      s1.add_courses("Web");
        System.out.println(s1.getCourse_collection());

    }
}

class Student {
    private String name;
    private int grade;
    private ArrayList<String> course_list;


    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.course_list=new ArrayList<>();
    }

    void show_infomation() {
        System.out.println(name);
        System.out.println(grade);
    }

    public  void  add_courses(String course){
        course_list.add(course);
    }

    public  ArrayList<String> getCourse_collection() {
        return course_list;
    }
    public  void remove_course(String course){
        course_list.remove(course);
    }
}
