import java.util.ArrayList;
import java.util.Scanner;

public class Exam13 {
    public static void main(String[] args) throws NotEligibleException,StudentBatchException{
        Scanner sc=new Scanner(System.in);
        ExamHall class_room3=new ExamHall();
       while(true){
           System.out.println("Enter student rollnumber:");
           String rollno=sc.next();
           System.out.println("Enter student attendence percentage in %");
           byte attendance=sc.nextByte();
           try{
               class_room3.add_students(rollno,attendance);
           }
           catch (Exception obj){
               System.out.println("Exception: "+obj.toString());
           }
           System.out.println("More students to allow:(y/n)");
           String check=sc.next();
           if (check.charAt(0)=='n'){
               break;
           }
       }
        class_room3.eligible_students();

    }
}





class ExamHall{
    ArrayList<Students> student_list_allowed=new ArrayList<>();
   public void add_students(String rollno,byte attendence) throws NotEligibleException,StudentBatchException{
       if (attendence<75){
           throw new NotEligibleException(rollno+" is not eligible for in Exam");
       }
       if (!(rollno.contains("22"))){
           throw new StudentBatchException(rollno+" Student is of another batch!!");
       }
       else{
           student_list_allowed.add(new Students(rollno,attendence));
       }
   }
   public void eligible_students(){
       for (Students obj:student_list_allowed) {
           System.out.println(obj.getS_rollno()+" "+obj.getAttendance());
       }


   }



}
class Students{

    private String s_rollno;
    private byte attendance;
    Students(String s_rollno,byte attendance){
        this.s_rollno=s_rollno;
        this.attendance=attendance;
    }

    public byte getAttendance() {
        return attendance;
    }

    public String getS_rollno() {
        return s_rollno;
    }
}

class NotEligibleException extends Exception{
    NotEligibleException(String message){
        super(message);
    }

}

class StudentBatchException extends Exception{
    StudentBatchException(String message){
        super(message);

    }

}