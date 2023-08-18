

public class Exercise4 {
    public static void main(String[] args) {
        //Write a Java program to create a class called "Circle" with a radius attribute.
        // You can access and modify this attribute.
        // Calculate the area and circumference of the circle.
    Circle circle=new Circle(67);

        System.out.println(circle.circumferenceOfCircle());
        circle.setRadius(3.4);
        System.out.println(circle.circumferenceOfCircle());
    }
}


class Circle{

    private double radius;
    void setRadius(double radius){
        this.radius=radius;
    }
    double getRadius(){
        return radius;
    }
    Circle(double radius){

        this.radius=radius;
    }
    double areaOfCircle(){
        // 3.14 * radius*radius
        return  Math.PI*(radius*radius);
    }
    double circumferenceOfCircle(){
        return 2*Math.PI*radius;
    }



}
