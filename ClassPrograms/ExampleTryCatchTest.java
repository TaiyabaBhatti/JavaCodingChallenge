import java.util.ArrayList;
import java.util.Scanner;

  public class ExampleTryCatchTest {
      public static void main(String[] args) throws AdmissionException{
     Scanner sc=new Scanner(System.in);
          StudenAdmissionManagement com2=new StudenAdmissionManagement();
     while(true) {
         com2.add_student();
         System.out.println("Want to add more(yes/no)");
         String op=sc.next();
         if (op.equalsIgnoreCase("no")){
            break;
         }

     }

     com2.print();

      }
}

class StudenAdmissionManagement{
      private ArrayList<Student> student_list=new ArrayList<>();
      public void add_student() throws AdmissionException {
          Scanner sc=new Scanner(System.in);

          System.out.println("Enter student name:");
          String name=sc.nextLine();
          System.out.println("Enter student age:");
          byte age=sc.nextByte();
          System.out.println("Enter student test score:");
          byte test_score=sc.nextByte();
          try{
              if (test_score<=40){
                  throw new AdmissionException("Student "+name+" not eligible for admission.");
              }

              else {
                  student_list.add(new Student(name,age,test_score));

              }
          }
          catch (AdmissionException obj){
              System.out.println("Exception: "+obj.toString());
          }
      }
      public void print(){
          for (Student obj:student_list) {
              System.out.println(obj.getName()+" "+obj.getAge()+" "+obj.getTest_score());
          }
      }
}
class Student{
      private String name;
      private byte age;
      private byte test_score;
      Student(String name,byte age, byte test_score){
          this.name=name;
          this.age=age;
          this.test_score=test_score;
      }

    public String getName() {
        return name;
    }
    public byte getAge() {
        return age;
    }
    public byte getTest_score() {
        return test_score;
    }
}
class AdmissionException extends Exception{
      AdmissionException(String message){
          super(message);
      }
}
