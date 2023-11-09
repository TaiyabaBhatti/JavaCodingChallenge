import java.lang.String;
import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {


         String name="Tayyaba";

         int[] arr1={1,2,3,4};
         int[] arr2=arr1;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        arr1[2]=88;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        String name1="Tayyaba";

        String name2=name1;
        System.out.println(name1);
        System.out.println(name2);
        name1="Bhatti";
//        name2="taiba";
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name1==name2);
        int num=5;
        System.out.println(num);

         // meaning that String not change it retain here for the one name2 pointing to

         String a="tayyaba";
         a=a.concat("hello");
        System.out.println(a);

















    }
}
