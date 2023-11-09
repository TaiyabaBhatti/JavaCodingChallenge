import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        // Write a Java program to find the index of an array element.

//        Scanner object=new Scanner(System.in);
//        int[] array={4,6,8,45,67,89};
//        System.out.println(Arrays.toString(array));
//        System.out.println("Enter element to find its index");
//        int index_element=object.nextInt();
//
//        for (int i=0;i<array.length;i++){
//
//            if (array[i]==index_element){
//                System.out.println("Index of element "+ index_element+" is " + i);
//                break;
//            }
//        }

        // Write a Java program to find the index of an array element.(binary search) returns
        // element index

        int[] array={5,8,3,7,56,45};
        Arrays.sort(array);
        int element=7;
        int index=Arrays.binarySearch(array,element);
        System.out.println(index);


















    }
}
