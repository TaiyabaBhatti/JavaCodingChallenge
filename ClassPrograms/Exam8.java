import java.util.ArrayList;
import java.util.Scanner;

public class Exam8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Continent asia=new Continent();
        asia.setConti_name();
        System.out.println("Name of Continent: "+asia.getConti_name());
        System.out.println("Adding countries:");
        asia.addCountries(3);
        asia.get_country_list();
         asia.change_Country_Name();
        asia.get_country_list();




    }
}

class Continent{
    Scanner sc=new Scanner(System.in);
    String name;
    private String conti_name;
    private ArrayList<Country> country_list=new ArrayList<>();

    public void setConti_name(){
        System.out.println("Enter continent name:");
        conti_name=sc.next();
    }
    public String getConti_name(){
        return conti_name;
    }
       public void addCountries(int size){

           System.out.println("Enter country name to add:");
           for (int i = 0; i < size; i++) {
               name= sc.next();
               country_list.add(new Country(name));
           }
       }

       public void change_Country_Name(){
           System.out.println("Enter old name:");
          name=sc.next();
           for (int i = 0; i < country_list.size(); i++) {
               if ((country_list.get(i).getCoun_name()).equals(name)){
                   country_list.get(i).replace_name();
               }
           }
       }
       public void get_country_list(){

        for (Country obj:country_list){
            System.out.println(obj.getCoun_name());

        }
       }
}
class Country{
    private String coun_name;
Scanner sc=new Scanner(System.in);
String name;

Country(String coun_name){

    this.coun_name=coun_name;
}
public String getCoun_name(){
    return coun_name;
}
public void replace_name(){
    System.out.println("Enter new name");
    name= sc.next();
    this.coun_name=name;
}
}

