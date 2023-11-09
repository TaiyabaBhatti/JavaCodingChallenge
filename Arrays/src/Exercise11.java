import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise11 {
    static ArrayList<Integer> reverse(ArrayList<Integer> list2){
         ArrayList<Integer> resersedList=new ArrayList<>();
for (int i=list2.size()-1;i>=0;i--){

    resersedList.add(list2.get(i));
}
return resersedList;

    }
    public static void main(String[] args) {
        //Write a Java program to reverse an array of integer values.
        Stream<Integer> stream=Stream.of(3,5,78,54,23,4);
        ArrayList<Integer> list=stream.collect(Collectors.toCollection(ArrayList::new));
        System.out.println(list);
        // we can add elements after initiate the elements to the stream
        list.add(4,44);
        System.out.println(list);
        System.out.println( reverse(list));








    }
}
