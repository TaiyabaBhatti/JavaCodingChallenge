import java.util.ArrayList;
import java.util.Arrays;

public class exam5 {
    public static void main(String[] args) {

        University muet=new University("Muet","Jamshoro");
        University KU=new University("KU","Karachi");
         ArrayList<University> list=new ArrayList<>();
         list.add(muet);
         list.add(KU);
       list.forEach(obj -> System.out.println(obj.getName() + " " + obj.getLocation()));



    }
}

class University{
    private String name;
    private String location;
    University(String name,String location){

        this.name=name;
        this.location=location;
    }







    public String getName(){
        return name;
    }
    public  String getLocation(){

        return location;
    }



}
