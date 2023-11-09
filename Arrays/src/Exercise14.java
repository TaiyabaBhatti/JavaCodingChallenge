import java.util.HashSet;

public class Exercise14 {
    public static void main(String[] args) {
        //Write a Java program to find common elements between two arrays (string values).

        String[] array1={"Git","GitHub","FireFox","Kotlin","Web"};
        String[] array2={"Hashmaps",".net","Godaddy","web","Jquery","Safari","git"};
    //    HashSet<String> set=new HashSet<>();

        for (int i=0;i< array1.length;i++){
            for (int j=0;j< array2.length;j++){

                if (array1[i].equalsIgnoreCase(array2[j])){

//                    set.add(array1[i]);
                   System.out.println(array1[i]);
                }

            }
        }

  //      System.out.println("Common Elements:"+set);








    }
}
