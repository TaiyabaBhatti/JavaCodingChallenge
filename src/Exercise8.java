public class Exercise8 {
    public static void main(String[] args) {


        // Write a Java program to create class called "TrafficLight" with attributes for color and duration,
        // and methods to change the color and check for red or green.
        TrafficLight light=new TrafficLight("red",56);
light.signal_Display();
light.setColor("green");
light.signal_Display();
light.setColor("yellow");
light.signal_Display();


    }
}


class TrafficLight{

    private String color;
    private int duration;

TrafficLight(String color,int duration){
    this.color=color;
    this.duration=duration;
}

    public void setColor(String color) {
        this.color = color;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getColor() {
        return color;
    }

    public int getDuration() {
        return duration;
    }


    public void signal_Display(){

    if (color.equalsIgnoreCase("red")){
        System.out.println("Alert!!!!!! STOP YOUR VEHICLE TILL "+duration+" SECONDS");
        setColor("green");
    }

    if (color.equalsIgnoreCase("green")){
        setDuration(duration-10);
        System.out.println("Alert!!!!!! START YOUR VEHICLE WITHIN "+duration+" SECONDS ");
        setColor("yellow");
    }
if (color.equalsIgnoreCase("yellow")) {
    System.out.println("Go!!!!!!!!!!");
}


    }




}
