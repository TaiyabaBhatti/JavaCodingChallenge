import java.util.ArrayList;
import java.util.Scanner;

public class HomWork03 {
    public static void main(String[] args) {

        // ArrayList of userDefined datatype
      //  ArrayList<ClassName   > arraylistName;
        Scanner sc=new Scanner(System.in);
    ArrayList<StudentCustomClass> list=new ArrayList<>();
    StudentCustomClass student;


        for (int i=0;i<4;i++) {
        if (i < 2) {
            student = new StudentCustomClass();
            list.add(student);
        }
        else{
           student =getStudentData(sc,i) ;
            list.add(student);
        }
    }

        for (StudentCustomClass obj:list) {
            System.out.println(obj.getName()+" "+obj.getId()+" "+obj.getRollNo());
        }
        removeStudent(list);

        for (StudentCustomClass obj:list) {
            System.out.println(obj.getName()+" "+obj.getId()+" "+obj.getRollNo());
        }




    }

    public static StudentCustomClass getStudentData(Scanner sc, int index){

        String name;
        int id;
        int rollNo;
        System.out.println("Enter name for student: "+index);
        name=sc.next();
        System.out.println("Enter id for student: "+index);
        id=sc.nextInt();
        System.out.println("Enter rollNumber for student: "+index);
        rollNo=sc.nextInt();
        return new StudentCustomClass(name,id,rollNo);
    }

    public static ArrayList<StudentCustomClass> removeStudent(ArrayList<StudentCustomClass> list  ){

        for (StudentCustomClass element :list) {
            if (element==list.get(2)){

                list.remove(element);
                break;

            }
        }
        return list;
    }


}


  class StudentCustomClass{

    String name;
    int id;
    int rollNo;
   StudentCustomClass(){
       this.name="ABC";
       this.id=123;
       this.rollNo=56;
   }
    StudentCustomClass(String Name, int id, int rollNo){
this.name=Name;
this.id=id;
this.rollNo=rollNo;


    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}




