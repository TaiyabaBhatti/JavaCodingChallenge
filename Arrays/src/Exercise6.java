import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        Scanner object=new Scanner(System.in);

        // Write a Java program to remove a specific element from an array.
        int size=6;
        ArrayList<Integer> array_list=new ArrayList<>(size);
        for (int i=0;i<size;i++){

            array_list.add(i, object.nextInt());
        }
        System.out.println(array_list);

        array_list.remove(5);
        System.out.println(array_list);


//        array_list.add(6,9);
//        System.out.println(array_list);
//





















    }
}
