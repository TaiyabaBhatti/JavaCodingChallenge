import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {


        Scanner obj=new Scanner(System.in);

        // area of circle=pi*r^2;

        float value_of_pi=3.14f;
        float radius_of_circle= obj.nextFloat();
        float areaOfCircle=value_of_pi*(radius_of_circle*radius_of_circle);
        System.out.println(areaOfCircle);










    }
}
