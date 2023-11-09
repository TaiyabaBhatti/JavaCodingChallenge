import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        // Write a Java program to calculate the average value of array elements.

        Scanner object=new Scanner(System.in);
        int array_size=object.nextInt();
        int[] array=new int[array_size];
        int sum=0;
        float average;


        for (int i=0;i<array_size;i++){

            array[i]= object.nextInt();

        }
        System.out.println(Arrays.toString(array));

        for (int i=0;i<array_size;i++){
            if (array[i]<0){
                System.out.println("Input should be positive at index"+i);
                array[i]= object.nextInt();
            }
        }
        System.out.println(Arrays.toString(array));

         for(int element:array){

             sum+=element;
         }

         average = (float) sum/array_size;
        System.out.println("Averge of the Array "+average);





    }
}
