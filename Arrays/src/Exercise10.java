import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise10 {
    public static void main(String[] args) {
        //10. Write a Java program to find the maximum and minimum value of an array.
        Stream<Integer> stream=Stream.of(3,10,6,1,8);

//        ArrayList<Integer> arrayList=stream.collect(Collectors.toCollection(ArrayList::new));
        List<Integer> list=stream.toList();
        ArrayList<Integer> arrayList=new ArrayList<>(list);
        System.out.println(arrayList);

        int max=arrayList.get(2);
        int min = arrayList.get(4);

        for (Integer integer : arrayList) {
            if (integer > max) {
                max = integer;
            }
            if (integer < min) {
                min = integer;
            }

        }
        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+min);





    }
}
