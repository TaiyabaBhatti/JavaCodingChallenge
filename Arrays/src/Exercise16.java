import java.util.Arrays;
import java.util.HashSet;

public class Exercise16 {
    public static void main(String[] args) {

        //Write a Java program to remove duplicate elements from an array.

      int[] array={6,7,3,7,4,2,3,8,7};
        HashSet<Integer> set=new HashSet<>();
        System.out.println(Arrays.toString(array));
        for (int element:array) {
            set.add(element);

        }
        System.out.println(set);










    }
}
