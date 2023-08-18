
import java.time.LocalTime;

public class Exercise16 {
    public static void main(String[] args) {

        //Write a Java program to create a class called "Airplane" with a flight number, destination,
        // and departure time attributes, and methods to check flight status and delay.
    Airplane PIA=new Airplane("BA2490","Faisalabad Int'l (LYP / OPFA)",LocalTime.of(5,37));
     PIA.display_flight_update();
     PIA.setDelay_Time(30);
    PIA.display_flight_update();
    }
}

class Airplane{

    private String flight_Number;
    private String destination;
    private LocalTime departure_Time;

    private int delay_Time;
    Airplane(String flight_Number,String destination, LocalTime departure_Time){
        this.flight_Number=flight_Number;
        this.destination=destination;
        this.departure_Time=departure_Time;
    }

    public void setFlight_Number(String flight_Number) {
        this.flight_Number = flight_Number;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDeparture_Time(LocalTime departure_Time) {
        this.departure_Time = departure_Time;
    }

    public String getFlight_Number() {
        return flight_Number;
    }

    public String getDestination() {
        return destination;
    }

    public LocalTime getDeparture_Time() {
        return departure_Time;
    }

    public int getDelay_Time() {
        return delay_Time;
    }

    public void setDelay_Time(int delay_Time_in_Minutes) {
        this.delay_Time = delay_Time_in_Minutes;
        this.departure_Time=this.departure_Time.plusMinutes(delay_Time_in_Minutes);

    }

    public void display_flight_update(){
        System.out.println("Flight number : "+flight_Number);
        System.out.println("Destination : "+destination);
        System.out.println("Flight Departure time : "+departure_Time);
        if (delay_Time==0) {
            System.out.println("Flight is on Time");
        }
        else{
                System.out.println("Flight is delayed by "+delay_Time+" minutes.");
            }





    }



}
