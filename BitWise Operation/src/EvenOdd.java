import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);

        // Write a java program to check if a given number is even or odd using bitwise operator

       int number= object.nextInt();
       int position_check=0;  // 0 index bit from right
       int bit_mask=1<<position_check;
       int get_check= number & bit_mask;
       if(get_check == 1){
           System.out.println("Odd number");
       }
       else {
           System.out.println("Even number");
       }















    }
}
