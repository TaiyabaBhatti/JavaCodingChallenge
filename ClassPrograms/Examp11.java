import java.util.ArrayList;
import java.util.Scanner;

public class Examp11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] countries={"Pakistan"};
        ContinentSuper asia=new ContinentSuper("Asia",1005006738L,countries);
        asia.add_countryinfo();
        asia.add_countries("India");
        asia.add_countryinfo();
        asia.display();
        asia.calculate_pop();
        ArrayList<CountrySub> country_list=asia.getCountry_list();
        for (int i = 0; i < country_list.size(); i++) {
            System.out.println("Enter number of cities to add.");
            int number=sc.nextInt();
            String[] cities=new String[number];
            System.out.println("Enter cities to add.");
            for (int j = 0; j <number; j++) {
                cities[i]=sc.next();
            }
            country_list.get(i).add_cities(cities);
        }
        country_list.get(0).display();


    }
}
class ContinentSuper{
    private String C_name;
    private long C_pop;
    private long C_area;
    private ArrayList<CountrySub> country_list=new ArrayList<>();

    ContinentSuper(String C_name,Long C_area,String[] c_name){
        this.C_name=C_name;
        this.C_area=C_area;
        for (int i = 0; i < c_name.length; i++) {
            country_list.add(new CountrySub(c_name[i]));
        }
    }
    public void add_countryinfo(){

        for (int i=0;i<country_list.size();i++){

            country_list.get(i).country_info();
        }
    }
    public void add_countries(String c_name){
        country_list.add(new CountrySub(c_name));
    }


    public void display(){
        for (CountrySub obj:country_list) {
            System.out.println(obj.getc_name()+" "+obj.getc_area()+" "+obj.getc_pop());
        }
    }
    public void calculate_pop(){
        for (CountrySub obj:country_list) {
            C_pop+= obj.getc_pop();
        }
        System.out.println("Population of "+C_name+": "+C_pop);
    }

    public ArrayList<CountrySub> getCountry_list(){
        return country_list;
    }


}
class CountrySub{
    private String c_name;
    private long c_pop;
    private long c_area;
    Scanner sc=new Scanner(System.in);
    private ArrayList<City> city_list=new ArrayList<>();
    CountrySub(String c_name){
        this.c_name= c_name;
    }
    public void country_info(){
        System.out.println("Data for country: "+this.c_name);
        if (this.c_area==0){
            System.out.println("Enter Country area: ");
            c_area= sc.nextLong();
        }
        if (this.c_pop==0){
            System.out.println("Enter Country pop: ");
            c_pop= sc.nextLong();
        }
    }
    public long getc_area() {
        return c_area;
    }
    public long getc_pop() {
        return c_pop;
    }
    public String getc_name() {
        return c_name;
    }

    public void add_cities(String[] cities){
        System.out.println("Adding cities for "+this.c_name);
        for (int i = 0; i < cities.length; i++) {
            city_list.add(new City(cities[i]));
        }
    }
    public void display(){
        System.out.println("Cities of "+this.c_name);
        for (City obj:city_list) {
            System.out.println(obj.getCity_name());
        }
    }




}
class City{
    Scanner sc=new Scanner(System.in);
    private String city_name;
    private long city_pop;
    private long city_area;
    private CountrySub country;
    City(String city_name){
        this.city_name=city_name;
    }
    public long getCity_area() {
        return city_area;
    }

    public long getCity_pop() {
        return city_pop;
    }
    public String getCity_name() {
        return city_name;
    }
}