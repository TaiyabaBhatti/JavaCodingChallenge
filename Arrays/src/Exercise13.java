public class Exercise13 {
    public static void main(String[] args) {
        // Write a Java program to find duplicate values in an array of string values.

        String[] array={"API","Framework","Server","api","fRamework"};

        for (int i=0;i< array.length-1;i++){

            for (int j=i+1;j< array.length;j++){

                if ((array[i].equalsIgnoreCase(array[j]) && i!=j)){
                    System.out.println(array[j]);

                }




            }




        }










    }
}
