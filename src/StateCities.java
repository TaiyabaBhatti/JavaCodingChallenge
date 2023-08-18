import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StateCities {
    public static void main(String[] args) {

        State state=new State("Pakistan");
        CityClass c1=new CityClass("Chiniot");
        CityClass c2=new CityClass("Skardu");
         List<CityClass> cities=new ArrayList<CityClass>();
         cities.add(c1);
         cities.add(c2);
         state.setConurbation(cities);
        System.out.println(state.getConurbation() + "these cities are in "+state.getStateName());


    }
}

class CityClass{

    private String cityName;

    CityClass(String cityName){
        this.cityName=cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }
}
class State{

    private String stateName;
    private List<CityClass> conurbation;
 State(String stateName){
     this.stateName=stateName;
 }
    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
    public void setConurbation(List<CityClass> conurbation){
        this.conurbation=conurbation;
    }

    public List<CityClass> getConurbation(){
        return conurbation;

    }
}
