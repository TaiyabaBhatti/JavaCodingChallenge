import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {

        // Write a Java program to sort a numeric array and a string array.


        int[] num_array={1100,1890,2023,1890,1870, 1500,1957,1445,1855};

        Arrays.sort(num_array);




        //int temp;
//        for (int i=0;i< num_array.length-1;i++) {
//            for (int j = i + 1; j < num_array.length; j++) {
//
//                if (num_array[i] > num_array[j]) {
//                    temp = num_array[i];
//                    num_array[i] = num_array[j];
//                    num_array[j] = temp;
//                }
//            }
//        }

            String[] string_array={"Java", "C##","Python", "Ruby"};

            Arrays.sort(string_array);

            //            String var;
//
//            for (int x=0;x<string_array.length-1;x++){
//                for (int y=x+1;y< string_array.length;y++){
//
//                if
//                        ((string_array[x].compareTo(string_array[y])) > 0) {
//                    var = string_array[x];
//                    string_array[x] = string_array[y];
//                    string_array[y] = var;
//                }
//
//            }


        System.out.println(Arrays.toString(num_array));
        System.out.println(Arrays.toString(string_array));














    }
}
