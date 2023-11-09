import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        // Write a Java program to sum values of an array.

        int[] array={56,78,4,8,3,98};
        int sum=0;
        for (int element:array) {

            sum+=element;

        }
        System.out.println(Arrays.toString(array));
        System.out.println(sum);








    }
}
