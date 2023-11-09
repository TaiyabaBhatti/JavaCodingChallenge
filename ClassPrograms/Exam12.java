import java.util.ArrayList;
import java.util.Scanner;

public class Exam12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<CustomWrapperClass> list=new ArrayList<>();
        while (true) {
            System.out.println("Enter value.");
            int value = sc.nextInt();
            try {

                list.add(new CustomWrapperClass(value));
                System.out.println("Do again?(y/n)");
                String check = sc.next();
                if (check.charAt(0) == 'n') {
                    break;
                }

            } catch (Exception obj) {
                System.out.println("Exception: " + obj.toString());
            }
        }



    }
}
class CustomWrapperClass{

    private int value;
    CustomWrapperClass(int value){
        if (value<10){
            throw new IllegalArgumentException("Condition failed!");
        }
        this.value=value;

    }

    public int getValue() {
        return value;
    }
}