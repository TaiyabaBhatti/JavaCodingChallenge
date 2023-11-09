import java.util.ArrayList;
import java.util.HashSet;

public class Exercise15 {
    public static void main(String[] args) {

    // Write a Java program to find common elements between two integer arrays.

        int[] array1={4,6,2,7,4,2,3,3};
        int[] array2={5,2,6,8,1,5,3};

        HashSet<Integer> set=new HashSet<>();

//        ArrayList<Integer> result=new ArrayList<>();
        // This approach will fail as it will fail to recognize values as one

        for (int i=0;i< array1.length;i++){
            for (int j=0;j< array2.length;j++){

                if (array1[i]==(array2[j])){

//                    result.add(array1[i]);
                    set.add(array1[i]);

                }

            }
        }

              System.out.println("Common Elements:"+set);
//        System.out.println(result);





    }
}
