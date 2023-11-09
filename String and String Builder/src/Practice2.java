import java.util.ArrayList;
import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {


        System.out.println('a' + 'b'); // + convert character into ASCII values

        System.out.println("a" + "b");  // + concatenate two String

        System.out.println((char)('a' + 3));
        System.out.println("a" + 3);      // 3 will change to Integer wrapper class then will call toString()


        System.out.println("a" + new ArrayList<>());


        int[] arr={1,2,3,4};
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));

    }
}
