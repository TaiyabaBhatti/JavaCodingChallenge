public class Exercise3 {

    public static void main(String[] args) {
        // Write a Java program to create a class called "Rectangle" with width and height attributes.
        // Calculate the area and perimeter of the rectangle.
        // ignore units
    Rectangle calculator=new Rectangle();

    calculator.setWidth(56.3f);
    calculator.setHeight(34.6f);
        System.out.println(calculator.calulateArea());
        System.out.println(calculator.calulatePeramiter());






    }
}

class Rectangle{
    private float width;
    private float height;

    void setWidth(float width){
        this.width=width;
    }
    void setHeight(float height){
        this.height=height;
    }
        float calulateArea(){

        return width*height;

        }
        float calulatePeramiter(){

        return 2 * (width+height);

        }




}
