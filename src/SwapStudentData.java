
public class SwapStudentData {

    public static void main(String[] args) {

        StudentClass s1=new StudentClass("Elif Shafaq","18sw023");
        StudentClass s2=new StudentClass("Paulo Coelho","17me123");
        StudentClass s3=new StudentClass("William Shakespeare","19bscs104");

        //Swap s1 name with s3 name and s1 rollNumber with s2 rollNumber

        s1.swap_Data(s3,s2);
        System.out.println("Name : "+ s1.getName());
        System.out.println("Roll Number : "+ s1.getRoll_Number());
        System.out.println(s2.getRoll_Number());
  StudentClass s4=s2.fetchData();
        System.out.println(s4.getName());


    }
}


class StudentClass{

    private String name;
    private String roll_Number;


    StudentClass(String name, String roll_Number){
        this.name=name;
        this.roll_Number=roll_Number;

    }
    public void setName(String name){
        this.name=name;
    }
    public void swap_Data(StudentClass student1,StudentClass student2 ){
        this.name= student1.name;
        student2.roll_Number=this.roll_Number;
    }
     public void setRollNumber(String rollNumber){
        this.roll_Number=rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getRoll_Number() {
        return roll_Number;
    }

    public StudentClass fetchData(){
        return this;
    }



}

