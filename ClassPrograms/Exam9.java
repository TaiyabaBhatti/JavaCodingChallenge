import java.util.ArrayList;
import java.util.Scanner;

public class Exam9 {
    public static void main(String[] args) {
        String[] country_array={"Pakistan"};

        Continnent asia=new Continnent("Asia",10000000,50000,country_array);
        asia.add_country("Thailand");
        asia.display();
        asia.country_info();
        asia.display();
        asia.calculate_pop();
        System.out.println("Population of "+asia.getContinent_name()+"is : "+asia.getPop());



    }
}
class Continnent{
    private String continent_name;
    private long area;
    private long pop;
    private ArrayList<Counntry> country_list=new ArrayList<>();
    Continnent(String continent_name,long area,long pop,String[] country_name){
        for (int i=0;i<country_name.length;i++){

            country_list.add(new Counntry(country_name[i]));
        }
        this.continent_name=continent_name;
    }
    public void add_country(String country_name){
        country_list.add(new Counntry(country_name));
    }

    public void display(){
        int count=1;
        for (Counntry obj:country_list) {
            System.out.println(count+"  "+obj.getCountry_name()+" "+obj.getArea()+" "+obj.getPop());
            count++;
        }
    }
     public void country_info(){


         for (int i = 0; i < country_list.size(); i++) {
             System.out.println("Enter area and pop for "+country_list.get(i).getCountry_name());
             country_list.get(i).set_area_pop();
         }
     }

     public void calculate_pop(){

         for (Counntry obj:country_list) {
             pop+= obj.getPop();
         }
     }

    public long getPop() {
        return pop;
    }

    public String getContinent_name() {
        return continent_name;
    }
}
class Counntry{
    private String country_name;
    private long area;
    private long pop;
    private Continnent continent;
    Scanner sc=new Scanner(System.in);
    Counntry(String country_name){
        this.country_name=country_name;
    }

    public String getCountry_name(){
        return country_name;
    }
    public void set_area_pop(){
        System.out.print("Area: ");
        area=sc.nextLong();
        System.out.print("Pop: ");
        pop=sc.nextLong();
    }

    public long getArea() {
        return area;
    }

    public long getPop() {
        return pop;
    }
}

//class City{
//    private String city_name;
//    private long cit
//
//
//
//
//}




